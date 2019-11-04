import java.io.*;

class VehicleNumber{
	static int twoWheeler;
}

class Prompt{
	 static Console con = System.console();
	static String getString(String question){
		con.printf(question);
		return con.readLine();
	}
}

class ThirdExample{
	private static Console con = System.console();

	public static void main(String[] args) {
		String twoWheeler = Prompt.getString("Enter Vehicle Number");
		String a = "Ag";
		// String result = "The vehicle number is " + VehicleNumber.twoWheeler;

		System.out.println(twoWheeler);
		if(twoWheeler==a){
			System.out.println("Einstein");
		}
		else{
			System.out.println("Art");
		}
		// con.printf(result);
	}
}