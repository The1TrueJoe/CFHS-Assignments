package basicJavaCMD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class basicJavaCMD {
	
	public static void main(String[] args) throws IOException {
		
		String command;
		
		boolean control = true;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			
			System.out.println("Enter command");
			command = keyboard.nextLine();
			
			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);
		        builder.redirectErrorStream(true);
		        
		        Process p = builder.start();
		        
		        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		        
		        String line;
		        
		        while (true) {
		            line = r.readLine();
		            
		            if (line == null) { break; }
		            
		            System.out.println(line);
		        }

			
		} while (control == true);

	        keyboard.close();
	        
	}

}
