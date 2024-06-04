import java.io.File;
import java.io.FileReader;


public class Ex1205 {

	public static void main(String[] args) {
		File file = new File("member.txt");
		try {
			if (!file.exists())
				file.createNewFile();
<<<<<<< HEAD
			
=======
>>>>>>> 02972a801b488cdf16598a750e3780048f7c472f
			FileReader fis = new FileReader(file);
			int i = 0;
			
			While ((i = fis.read()) != -1) {
				System.out.print((char)i);
<<<<<<< HEAD
				
			}
			
=======
			}
>>>>>>> 02972a801b488cdf16598a750e3780048f7c472f
			fis.close();
			System.out.println("파일 읽기 성공");
			
		}catch(Exception e) {
			System.out.println(e);
<<<<<<< HEAD
=======
			
>>>>>>> 02972a801b488cdf16598a750e3780048f7c472f
		}

	}

}
