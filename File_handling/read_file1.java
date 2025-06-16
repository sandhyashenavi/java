package File_handling;

import java.io.FileInputStream;
import java.io.IOException;

public class read_file1 {

	public static void main(String[] args) throws IOException {
		FileInputStream in=new FileInputStream("third.txt");
		int i1=0;
		while((i1=in.read())!= -1)
		{
			System.out.print((char)i1);
		}
         in.close();
	}

}
