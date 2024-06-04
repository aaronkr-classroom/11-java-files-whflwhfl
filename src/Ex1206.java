import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;



public class Ex1206 {

	public static void main(String[] args) {
<<<<<<< HEAD
		
		
		File file = new File("memver.txt");
		
=======
		File file = new File("member.txt");
>>>>>>> 02972a801b488cdf16598a750e3780048f7c472f
		try {
			if (!file.exists())
				file.createNewFile();
			
			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			
			String str;
			
<<<<<<< HEAD
			While ((str = br.readLine()) != null) {
				System.out.println("str");
			}
				fis.close();
				System.out.println("파일 읽기 성공");
				
		}catch(Exception e) {
			System.out.println(e);
=======
			while((str = br.readLine()) != null) {
				System.out.println(str);
				fis.close();
				System.out.println("파일 읽기 성공");
			}
				
				
			}catch(Exception e) {
				System.out.println(e);
			
>>>>>>> 02972a801b488cdf16598a750e3780048f7c472f
		}

	}

}
