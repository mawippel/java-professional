package classes.nested;

/**
 * This is an inner class that has an anonymous implementation, it's defined, instantiated and called only here. 
 */
public class AnonymousInnerClass {
	
	abstract class SaleTodayOnly {
		abstract int dollarOffset();
	}
	
	private void admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {
			@Override
			int dollarOffset() {
				return 0;
			}
		};
		
		// It can be called also like this
		smallTest(new SaleTodayOnly() {
			int dollarOffset() {
				return 0;
			}
		});
	}
	
	public void smallTest(SaleTodayOnly sale) {
		// We have this object instantiated here
		sale.dollarOffset();
	}
}
