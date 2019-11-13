import java.util.*;
import java.io.*;


public class HelloWorld {
//https://introcs.cs.princeton.edu/java/11hello/HelloWorld.java.html
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello World!");
	try{
	    String cmd = "/usr/bin/python -c \"print('hello world')\"";
	    System.out.println(cmd);
	    Process p = Runtime.getRuntime().exec(
			    new String[]{ "java", "-version" }
			    );
	    int exitVal = p.waitFor();
            System.out.println("Process exitValue: " + exitVal);
	    System.out.println(p);
	    InputStream out = p.getInputStream();
	    PrintStream prtStrm=new PrintStream(out);
	    prtStrm.println();
	} catch (Exception ex) {
	    System.out.println(ex);
	}
    }

}
