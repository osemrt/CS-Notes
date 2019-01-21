package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class filehandling2 {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		
		//-----------------------------------------------------------------
		OutputStream os = new FileOutputStream("dataConfig.properties");
		
		p.setProperty("url", "localhost:3306/mydb");
		p.setProperty("uname", "osemrt");
		p.setProperty("passwd", "abcde");
		
		p.store(os, null);
		
		//-----------------------------------------------------------------
		InputStream is = new FileInputStream("dataConfig.properties");
		p.load(is);
		String str = p.getProperty("uname");
		System.out.println(str);
		//-----------------------------------------------------------------
		
		p.list(System.out);
		
	}
}
