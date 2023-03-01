package File_hadalling1;

import java.io.File;
import java.io.IOException;

public class file_handallingp1 {
	public static void main(String[] args) throws IOException {
		File obj = new File("E:\\java workspace\\File_Handalling\\filehandalling.txt");
		System.out.println(obj.createNewFile());
		System.out.println(obj.canRead());
		System.out.println(obj.canWrite());
		System.out.println(obj.canExecute());
		System.out.println(obj.exists());
		System.out.println(obj.getAbsolutePath());
		System.out.println(obj.getParent());
//		System.out.println(obj.delete());
		
		
	}

}
