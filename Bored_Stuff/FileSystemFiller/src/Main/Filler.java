package Main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Filler {

	public int fileAmt;
	public int lineLength;
	public int rowLength;
	
	public String path = "H:\\Fill";
	public String name = "fill";
	
	PrintWriter file;
	PrintWriter log;
	
	public Filler(int fileAmt, int lineLength, String path) {
		this.fileAmt = fileAmt;
		this.lineLength = lineLength;
		this.path = path;
		rowLength = 100000;
	}
	
	public Filler(int fileAmt, int lineLength) {
		this.fileAmt = fileAmt;
		this.lineLength = lineLength;
		rowLength = 100000;
	}
	
	public Filler() {
		fileAmt = 20000;
		lineLength = 1000;
		rowLength = 100000;
	}
	
	public void Fill() throws FileNotFoundException {
		String name;
		
		log = new PrintWriter(path + "\\log.txt");
		
		for (int curFile = 0; curFile <= fileAmt; curFile++) {
			name = path + "\\" + this.name + (curFile+1) + ".txt";
			file = new PrintWriter(name);
			
			System.out.println("Creating: " + name);
			log.println("Creating: " + name);
			
			for (int curLine = 0; curLine <= lineLength; curLine++) {
				for (int curChar = 0; curChar <= rowLength; curChar++) {
					file.print("****");
				}
				
				file.println();
			}
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		new Filler(100, 10000).Fill();
	}
	
	
}
