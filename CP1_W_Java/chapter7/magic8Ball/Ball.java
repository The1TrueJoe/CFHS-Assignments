package magic8Ball;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Ball {

	public int size;
	public String fileName;
	
	public String[] response;
	
	public Ball(String path, String name, int sz) throws FileNotFoundException {
		fileName = path + name;
		size = sz;
		
		response = new String[size];
		
		buildArray();
	}
	
	public Ball(String path, String name) throws FileNotFoundException {
		fileName = path + name;
		size = scanSize();
		
		response = new String[size];
		
		buildArray();
	}
	
	public Ball(String path, String name, boolean test) throws FileNotFoundException {
		fileName = path + name;
		size = 12;
		
		response = new String[size];
	}
	
	public int getSize() { return size; }
	
	public int scanSize() throws FileNotFoundException {
		int s = 0;
		
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		
		while (inputFile.hasNext()) {
			s++;
		}
		
		inputFile.close();
		
		return s;
	}
	
	public String getResponse() {
		Random rand = new Random();
		
		int i = rand.nextInt(size);
		
		return response[i];
	}
	
	public void buildArray() throws FileNotFoundException {
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		
		for (int i = 0; i < size; i++) {
			response[i] = inputFile.nextLine();
		}
		
		inputFile.close();
	}
	
}
