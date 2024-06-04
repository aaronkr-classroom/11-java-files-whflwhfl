import java.io.File;
import java.io.FileInputStream;


public class Ex1204 {

	public static void main(String[] args) {
		File file = new File("gugudan.txt");
		try {
			if(!file.exists())
				file.createNewFile();
			
<<<<<<< HEAD
			
=======
>>>>>>> 02972a801b488cdf16598a750e3780048f7c472f
			FileInputStream fis = new FileInputStream(file);
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
<<<<<<< HEAD
				
			}
			fis.close();
				System.out.println("파일 읽기 성공");
=======
			}
			fis.close();
				System.out.println("파일 읽기 성공");
				
>>>>>>> 02972a801b488cdf16598a750e3780048f7c472f
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
