package classes.nested;

/**
 * This is a Static Nested Class, it can be instantiated without an object of the enclosing class.
 * 
 *  This class can be imported by both ways:
 *  
 *  import bird.Bird.Beak;
 *  import static bird.Bird.Beak;
 */
public class StaticNestedClass {
	
	private int width = 2;
	
	public void testaa() {
		int x = CanBeInstantiated.privado;
		int y = CanBeInstantiated.publico;
		CanBeInstantiated z = new CanBeInstantiated();
	}
	
	static class CanBeInstantiated {
		
		private static int privado = 24; // Can only be acessed in this .java
		public static int publico = 22; // Can be acessed by every class
		
		private void calculate() {
			
		}
	}
	
	public static void main(String[] args) {
		CanBeInstantiated xd = new CanBeInstantiated();
		int publico = CanBeInstantiated.publico;
	}
	
}
