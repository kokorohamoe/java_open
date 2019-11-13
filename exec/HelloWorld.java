import java.util.*;
import java.io.*;


public class HelloWorld {
//https://introcs.cs.princeton.edu/java/11hello/HelloWorld.java.html
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello World!");
	try{
	    //String cmd = "/usr/bin/python -c \"print('hello world')\"";
            String cmd = "/usr/bin/python -c \"import os;os._exit(1)\"";
	    System.out.println(cmd);
	    Process p = Runtime.getRuntime().exec(
			    new String[]{ "/usr/bin/id" }
			    );
	    int exitVal = p.waitFor();
            System.out.println("Process exitValue: " + exitVal);
	    System.out.println(p);
	} catch (Exception ex) {
	    System.out.println("Exception");
	    System.out.println(ex);
	}
    }

}
