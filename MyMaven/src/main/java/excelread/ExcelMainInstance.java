package excelread;

import java.io.IOException;

public class ExcelMainInstance {

	public static void main(String[] args) throws IOException {
		ExelCodeInstance object =new ExelCodeInstance();
		
		String s=object.readData(1, 0);
		System.out.println(s);
		String s1=object.readData(0, 0);
		System.out.println(s1);

	}

}
