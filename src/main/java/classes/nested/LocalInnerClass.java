package classes.nested;

/**
 * This is a Local Inner Class, the scope of it is a method, and it can be only used there.
 */
public class LocalInnerClass {
	
	private int length = 5;
	
	private void calculate() {
		int width = 3;
		
		// doesn't have a modifier
		class Inner {
			private int xd = 2;
			public String a = "aa";
			
			void multiply() {
				System.out.println(LocalInnerClass.this.length * width);
			}
		}
		
		Inner inner = new Inner();
		System.out.println(inner.xd); // can access a private var
		inner.multiply();
	}

}
