
public class Main {
	public static void main(String[] args) {
		// ====================================
		// Declaration & Initialize Value
		// ====================================
		Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, world."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);

		// ====================================
		// Execution Part
		// ====================================

		// ====================================
		// Display Result Part
		// ====================================
	}
}
