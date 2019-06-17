package classes.nested;

/**
 * A member inner class. It's not static, so, it gotta be instantiated to be called 
 */
public class MemberInnerClass {

	private String xd;
	
	public void testXd() {
		// this.desc = xd; -> doesnt work
	}
	
	public class Inner {
		
		private String xd;
		// private static String j; -> Can't be done, as it's inside another instance
		
		public void testXd() {
			this.xd = MemberInnerClass.this.xd; // This works
		}
	}
	
	public static void main(String[] args) {
		MemberInnerClass x = new MemberInnerClass();
		Inner inner = x.new Inner();
		x.testXd();
		// Inner xd = new Inner(); -> Can't be done, because we gotta associate the instance to the parent class
	}
}
