import java.io.*;
import java.util.Scanner;


public class exec_test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("Enter the command you want to execute: ");
			String cmd = s.next();
			System.out.println(cmd);
		
			try {
				Process process = Runtime.getRuntime().exec(cmd);
				BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String d;
				    while ((d = input.readLine()) != null) {
					System.out.println(d);
				    }

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

