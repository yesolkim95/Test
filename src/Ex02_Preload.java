//인스턴스 생성과 관계 없이 static 변수가 메모리
//공간에 할당될 때 실행이 된다.
import java.util.Random;	//랜덤 클래스 임포트

public class Ex02_Preload
{
	static int num;			//스태틱 멤버 변수
	
	//static 초기화 블록
	static {
		Random rand = new Random();
		//main() 실행 전에 이미 난숫값이 대입이 된다.
		num = rand.nextInt(100);	//0에서 99사이에서 임의의 숫자를 반환
	}
	public static void main(String[] args)
	{
		System.out.println(num);

	}

}
