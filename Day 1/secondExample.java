
class secondExample{
	public static void main(String[] args) {
		System.out.println("Enter your name");
		String name = System.console().readLine();

		System.out.println("Enter your address");
		String address = System.console().readLine();

		System.out.println("Enter your age");
		String age = System.console().readLine();

		System.out.println("the name entered is " + name );
		System.out.println("The address is " + address);
		System.out.println("The age is " + age);
	}
}