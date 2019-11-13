import java.io.*;
import java.util.Scanner;

//exec_test https://github.com/dakshpokar/RuntimeExecutioner
public class exec_test {

	public static void main(String[] args) {
		if(true){
			String cmd = "/usr/bin/python -h";
			//System.out.println(cmd);
		
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

