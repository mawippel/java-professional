package concurrency;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class AtomicClasses {

	public static void main(String[] args) {
		AtomicBoolean atomicBoolean = new AtomicBoolean();
		AtomicInteger atomicInteger = new AtomicInteger();
		AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(10);
		AtomicLong atomicLong = new AtomicLong();
		AtomicLongArray atomicLongArray = new AtomicLongArray(10);
		AtomicReference<Object> atomicReference = new AtomicReference<>();
		AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(10);
		
		atomicInteger.get();
		atomicInteger.set(123);
		atomicInteger.getAndIncrement();
		atomicInteger.incrementAndGet();
		atomicInteger.decrementAndGet();
		atomicInteger.getAndDecrement();
	}

}
