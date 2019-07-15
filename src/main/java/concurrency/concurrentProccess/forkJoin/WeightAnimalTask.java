package concurrency.concurrentProccess.forkJoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class WeightAnimalTask extends RecursiveTask {

	private int start;
	private int end;
	private Double[] weights;

	public WeightAnimalTask(Double[] weights, int start, int end) {
		this.start = start;
		this.end = end;
		this.weights = weights;
	}

	@Override
	protected Double compute() {
		if (end - start <= 3) {
			// base process
			double sum = 0;
			for (int i = start; i < end; i++) {
				weights[i] = (double) new Random().nextInt(100);
				System.out.println("Animal weighted: " + i);
				sum += weights[i];
			}
			return sum;
		} else {
			// recursive process
			int middle = start + ((end - start) / 2);
			System.out.println("start:" + start + " middle:" + middle + " end:" + end);

			RecursiveTask<Double> otherTask = new WeightAnimalTask(weights, start, middle);
			otherTask.fork();
			return new WeightAnimalTask(weights, middle, end).compute() + otherTask.join();
		}
	}

	public static void main(String[] args) {
		Double[] weights = new Double[10];

		ForkJoinTask<Double> task = new WeightAnimalTask(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		Double sum = pool.invoke(task);
		System.out.println("Sum: "+ sum);
	}

}
