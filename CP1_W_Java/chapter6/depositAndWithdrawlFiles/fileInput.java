package depositAndWithdrawlFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class fileInput {
	
	public String filename;
	public int count;
	public double total;
	
	public fileInput(String name) {
		filename = name;
		count = 0;
		total = 0;
	}

	public void fileRead() throws IOException, FileNotFoundException {
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		
		while (inputFile.hasNextDouble()) {
			total += inputFile.nextDouble();
			count++;

		}
		
		inputFile.close();
	}
	
	public int getCount() {
		return count;
	}
	
	public double getTotal() {
		return total;
	}
}
