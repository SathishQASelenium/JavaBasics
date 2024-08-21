
public class Datatypes {
	// control  -default
	// F5 - line by line
	// F8 - normally
	public static void main(String[] args) {
		System.out.println("Learning dataypes");

		byte b = 127;
		short s = 400;
		int i = 100;// 99% use int only
		long l = 1000;
		i = 200;
		System.out.println("i");
		System.out.println(i);

		float f = 100.45f;
		double d = 300; // 99% use float only
		System.out.println(f);
		System.out.println(d);
		char c = 'g';
		boolean bool = true; // true or false can be used to store the result of some condition
		System.out.println(c);
		
		
		System.out.println(7 > 12);
		bool = 15 > 11;
		System.out.println(bool);

		// Concatenation operator
		System.out.println("Value of i is " + i);
		System.out.println("10 added to i " + i + 10); // here it is concatenated as it has string to start then i value and then 10
		System.out.println(i + 10); // here it is added and then displayed
		System.out.println(i + 10 + " is the result of addition");
		System.out.println("10 added to i " + (i + 10)); // or if we want to print like this, we need to give within brackets

		String str = "Hello there";
		System.out.println(str);

	}

}
