package Main;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

public class FillerV2 {
	
	// Fields
	public int fileAmt;
	public int lineLength;
	public int rowLength;
	
	// Time
	public long time;
	
	// Paths and names
	public String path = "H:\\Fill";
	public String name = "Fill";
	public String nameOrg = "Original";
	
	// Files
	File org;
	File file;
	File log;
	
	// Printwriters
	PrintWriter logWrite;
	PrintWriter orgWrite;
	
	// Constructor
	public FillerV2(int fileAmt, int lineLength, String path) {
		this.fileAmt = fileAmt;
		this.lineLength = lineLength;
		this.path = path;
		rowLength = 100000;
	}
	
	// Constructor
	public FillerV2(int fileAmt, int lineLength) {
		this.fileAmt = fileAmt;
		this.lineLength = lineLength;
		rowLength = 100000;
	}
	
	// Constructor
	public FillerV2() {
		fileAmt = 20000;
		lineLength = 1000;
		rowLength = 100000;
	}
	
	// Fill
	public void Fill() throws IOException {
		
		// Name 
		String name;
		
		// Creates log
		log = new File(path + "\\log.txt");
		logWrite = new PrintWriter(log);
		
		// Creates original copy file
		name = path + "\\" + this.nameOrg + ".txt";
		org = new File(name);
		orgWrite = new PrintWriter(org);
		
		// Adds log entry
		System.out.println("Creating Original: " + name);
		logWrite.println("Creating Original: " + name);
		
		// Sets time
		time = System.currentTimeMillis();
		
		// Builds original file
		for (int curLine = 0; curLine <= lineLength; curLine++) {
			for (int curChar = 0; curChar <= rowLength; curChar++) {
				orgWrite.print("*****");
			}
			
			orgWrite.println();
		}
		
		// Time
		System.out.println("\nOriginal created, Took " + (System.currentTimeMillis() - time) + " ms");
		logWrite.println("\nOriginal created, Took " + (System.currentTimeMillis() - time) + " ms");
		
		// Returns size
		System.out.println("\nSize of " + name + ": " + (org.length() / 1024 / 1024) + "MB");
		logWrite.println("\nSize of " + name + ": " + (org.length() / 1024 / 1024) + "MB");
		
		// Checks if only one is necessary
		if (fileAmt <= 1) {
			System.out.println("Done: 1 File Necessary");
			logWrite.println("Done: 1 File Necessary");
			
			System.exit(0);
		}
		
		// Duplicates original file
		for (int curFile = 1; curFile <= fileAmt; curFile++) {
			
			// Releases file size after 10 runs
			if ((curFile - 1) % 10 == 0) {
				
				// Write to console
				System.out.println("\nFile Space Used: " + ((org.getTotalSpace() - org.getUsableSpace()) / 1024 / 1024 / 1024) + "GB");
				System.out.println("File Space Remaining: " + (org.getFreeSpace() / 1024 / 1024 / 1024) + "GB \n");
						
				// Write to log
				logWrite.println("\nFile Space Used: " + ((org.getTotalSpace() - org.getUsableSpace()) / 1024 / 1024 / 1024) + "GB");
				logWrite.println("File Space Remaining: " + (org.getFreeSpace() / 1024 / 1024 / 1024) + "GB \n");
				
				// Sleep
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					
				}
			}
			
			// Name
			name = path + "\\" + this.name + (curFile) + ".txt";
			file = new File(name);
			
			// Time
			time = System.currentTimeMillis();
			
			// Copies file
			Files.copy(org.toPath(), file.toPath());
			
			// Adds log entry
			System.out.println("Copied File: " + org.getPath() + ", To: " + name + "   Took: " + (System.currentTimeMillis() - time) + " ms");
			logWrite.println("Copied File: " + org.getPath() + ", To: " + name + "   Took: " + (System.currentTimeMillis() - time) + " ms");
			
		}
		
		// Writes to log
		System.out.println("\nDone");
		logWrite.println("\nDone");
		
		// Close
		logWrite.close();
		orgWrite.close();
	}
	
	// Main
	public static void main(String[] args) throws IOException {
		new FillerV2(10, 1000).Fill();
		
		
	}
	
}