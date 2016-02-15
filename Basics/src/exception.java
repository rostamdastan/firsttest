import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.IOException;
public class exception {
	static int num, de, result;
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		try {
			/*System.out.print("Enter the num:");
			num = input.nextInt();
			System.out.print("Enter the de:");
			de = input.nextInt();
			result = num / de;
			System.out.print("The result is : " + result);*/
			String filename = "test.txt";
			Scanner inFile = new Scanner(new FileReader(filename));
			int something;
			//PrintWriter outFile = new PrintWriter(new FileWriter(filename));
			//outFile.println(85);
			//outFile.println(75);
			something =Integer.parseInt(inFile.nextLine());
			//outFile.close();
			System.out.print("The result is : "+something);
			}
		catch (ArithmeticException ae){
			System.out.println("this is and exception");
		}

		

	}

}
