package File_handling;

import java.io.FileOutputStream;
import java.io.IOException;

public class write_file {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream out=new FileOutputStream("third.txt");
		String s="Hello java";
		byte b[]=s.getBytes();
		System.out.println("file is created successfully");
		out.write(b);
		out.close();
		
	}

}
