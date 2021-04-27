package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Usuario\\Desktop\\RASTREIO.txt");
		Scanner sc = null;
		
		try {
			sc= new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch (FileNotFoundException e) {
			System.out.println("File does not found !");
			e.printStackTrace();
		}finally {
			if(sc!=null) {
				sc.close();
			}
		}
	}
}
