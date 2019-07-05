package genericsAndCollections.comparator;

import java.util.Comparator;

/**
 * Multifield comparison made by a external Comparator
 *  
 * @author TECBMMWL
 */
public class MultifieldComparator implements Comparator<Duck> {

	/**
	 * In this case, when a class call a Collections.sort() using this comparator,
	 * this method will be called, and then, the comparison will be made
	 */
	@Override
	public int compare(Duck o1, Duck o2) {
		Comparator<Duck> d = Comparator.comparing(du -> du.getName());
		d = d.thenComparingInt(du -> du.getId());
		return d.compare(o1, o2);
	}

}
