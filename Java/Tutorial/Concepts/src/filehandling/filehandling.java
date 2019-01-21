package filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class filehandling {
	public static void main(String[] args) throws Exception {
		
		String str;
		File f = new File("abc.txt");
		
		// You can write "abc.txt" inside of FileIn/OutStream, instead of f.
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Hello!");
		
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		str = dis.readUTF();
		
		System.out.println(str);
		
		
	
	}
	
}
