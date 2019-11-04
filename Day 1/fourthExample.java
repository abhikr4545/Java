import java.io.*;
import java.lang.*;

class IceCream{
	public static int AddFunc(int a , int b){
		return a + b;
	}

	static int SubFunc(int a , int b){
		return a - b;
	}
	
	static int  MulFunc(int a , int b){
		return a * b;
	}
	
	static int DivFunc(int a , int b){
		return a / b;
	}
	

}

class Prompt{
	 static Console con = System.console();
	static String getString(String question){
		con.printf(question);
		return con.readLine();
	}
}



class fourthExample{

	static boolean GetMenu(int a , int b, int choice){
		switch(choice){
			case 1: 
				System.out.println(IceCream.AddFunc(a,b));
				return true;

			case 2:
				System.out.println(IceCream.SubFunc(a,b));
				return true;


			case 3:
				System.out.println(IceCream.MulFunc(a,b));
				return true;

			case 4:
				System.out.println(IceCream.DivFunc(a,b));
				return true;
			
			default:
				return false;


		}
	}

	public static void main(String[] args){

		

		boolean processing;

		do{
			int select = Integer.parseInt(Prompt.getString("Enter the choice"));
			int value1 = Integer.parseInt(Prompt.getString("Enter 1st Value"));
			int value2 = Integer.parseInt(Prompt.getString("Enter 2nd Value"));
			processing = GetMenu(value1, value2, select);

		}while(processing);

	}
}