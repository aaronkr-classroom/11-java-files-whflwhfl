import java.io.File;


public class Ex1201 {

	public static void main(String[] args) {
		File finfo = new File("src\\Example01.java");
		
		if (finfo.exists()) {
			System.out.println("파일의 이름: " + finfo.getName());
			System.out.println("파일의 경로: " + finfo.getAbsolutePath());
<<<<<<< HEAD
			System.out.println("파일 쓰기가 가능한가? " + finfo.canWrite());
			
			System.out.println("파일 읽기가 가능하가? " +finfo.canRead());
			
			System.out.println("파일의 크기: " + finfo.length());
=======
			System.out.println("파일 쓰기가 가능한가?: " + finfo.canWrite());
			
			
			System.out.println("파일 읽기가 가능한가?:" + finfo.canRead());
			
			System.out.println("파일의 크기 " + finfo.length());
>>>>>>> 02972a801b488cdf16598a750e3780048f7c472f
		}else {
			System.out.println("존재하는 파일이 아닙니다.");
		}

	}

}
