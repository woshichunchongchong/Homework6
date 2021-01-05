package Example;

public class eg11_5_PolymorphismDemo {
	public static void main(String[] args) {
		displayObject(new eg11_2_Circle(1, "red", false));
		displayObject(new eg11_3_Rectangle(1, 1, "black", true));
	}
	
	public static void displayObject(eg11_1_GeometricObject object) {
		System.out.println("Created on "+object.getDateCreated()+". Color is "+object.getColor());
	}
}
