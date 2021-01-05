package Example;

public class eg11_6_DynamicBindingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());
	}
	
	public static void m(Object x) {
		System.out.println(x.toString());
	}

static class GraduateStudent extends Student{
}

static class Student extends Person{
	@Override
	public String toString() {
		return "Student";
	}
}

static class Person extends Object{
	@Override
	public String toString() {
		return "Person";
	}
}
}

