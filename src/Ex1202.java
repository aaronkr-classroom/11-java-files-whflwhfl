import java.io.File;
import java.io.FileOutputStream;


public class Ex1202 {

	public static void main(String[] args) {
		File file = new File("gugudan.txt");
		try {
<<<<<<< HEAD
			if (!file.exists())
				file.createNewFile();
			
			
			FileOutputStream fos = new FileOutputStream(file);
			
			
			for (int x = 2; x <= 9; x++) {
				for (int y = 1; y <= 9; y++) {
					String str = x + " X " + y + "=" +(x+y) + "\n";
					byte[] b = str.getBytes();
					fos.write(b);
					
				}
			}
			fos.close();
			System.out.println("파일 쓰기 성공");
		} catch(Exception e) {
=======
			if (!file.exists());
				file.createNewFile();
				
				FileOutputStream fos =  new FileOutputStream(file);
				
				
				for (int x = 2; x <= 9; x++) {
					for (int y = 1; y <= 9; y++) {
						String str = x + " X " + y + "= " + (x * y) + "\n";
						byte[] b = str.getBytes();
						fos.write(b);
					}
				}
				fos.close();
				System.out.println("파일 쓰기 성공");
				
		}catch(Exception e) {
>>>>>>> 02972a801b488cdf16598a750e3780048f7c472f
			e.getMessage();
		}

	}

}
