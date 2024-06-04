import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


<<<<<<< HEAD
public class Ex1203 {

	public static void main(String[] args) {
		File file = new File("memver.txt");
		
		try {
			if(!file.exists())
				file.createNewFile();
			
=======

public class Ex1203 {

	public static void main(String[] args) {
			File file = new File("member.txt");
			
			try {
		
			if(!file.exists())
				file.createNewFile();
>>>>>>> 02972a801b488cdf16598a750e3780048f7c472f
			FileWriter fw = new FileWriter(file);
			Scanner input = new Scanner(System.in);
			
			boolean quit = false;
			while (!quit) {
<<<<<<< HEAD
				System.out.print("아이디 : ");
				String userID = input.next();
				fw.write("아이디 : " + userID + " ");
				
				System.out.println("이름 :");
				String userName = input.next();
				fw.write("이름 :" + userName + "\n");
				
				System.out.println("계속 진행! Y|N");
				input = new Scanner(System.in);
				String str = input.nextLine();
				
				if(str.toUpperCase().equals("N"))
					quit = true;
				
			}
			fw.close();
			System.out.println("파일 쓰기 성공");
		}catch(Exception e) {
			e.getMessage();
		}
=======
				System.out.println("아이디: ");
				String userID = input.next();
				fw.write("이름 :" + userID + "\n");
				
				
				System.out.println("이름: ");
				String userName = input.next();
				fw.write("이름 :" + userName + "\n");
				
				System.out.println("계속 진행? Y | N ");
				input = new Scanner(System.in);
				String str = input.nextLine();
				
				if (str.toUpperCase().equals("N"))
					quit = true;
				
				
				
				
			}
			fw.close();
			System.out.println("파일 쓰기 성공");
			
		
			
		}catch(Exception e) {
			e.getMessage();
		}
		
>>>>>>> 02972a801b488cdf16598a750e3780048f7c472f

	}

}
