package Scanner;
import java.util.Scanner;

public class Ex03_Scanner2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("홍길동 전우치 손오공 이렇게 입력하고 엔터를 입력하세요.");
		String name1 = sc.nextLine();	//엔터가 입력될 때 한 번에 줄 단위 입력 처리 
		
		System.out.println("홍길동 전우치 손오공 이렇게 입력하고 엔터를 입력하세요.");
		String name2 = sc.next();	//공백이나 탭 단위 처리, 입력받은 값을 일단 버퍼에 넣고 공백이나 탭으로 구분 
		String name3 = sc.next();
		String name4 = sc.next();
		
		System.out.printf("[%s] [%s] [%s] [%s]", name1, name2, name3, name4);
	}

}
