package Example;

public class eg11_7_CastingDemo {

	public static void main(String[] args) {
		Object object1 = new eg11_2_Circle(1);
		Object object2 = new eg11_3_Rectangle(1,1);
		
		displayObject(object1);
		displayObject(object2);
	}
	
	public static void displayObject(Object object) {
		if (object instanceof eg11_2_Circle) {
			System.out.println("The circle area is "+((eg11_2_Circle)object).getArea());
			System.out.println("The circle diameter is "+((eg11_2_Circle)object).getDiameter());
		}
		else if(object instanceof eg11_3_Rectangle) {
			System.out.println("The rectangle area is "+((eg11_3_Rectangle)object).getArea());
		}
	}
}
