interface Greet //1.인터페이스
{
	void greet();
}

interface Talk//2.인터페이스
{
	void talk();
}

class Morning implements Greet, Talk //3. 인터페이스 구현
{
	public void greet()
	{
		System.out.println("안녕하세요!");
	}
	
	public void talk()
	{
		System.out.println("날씨 좋네요.");
	}
}
public class Ex01_Meet
{

	public static void main(String[] args)	//4.프로그램이 여기서 시작합니다.
	{
		Morning morning = new Morning(); //5 모닝 클래스를 이용하여 객체를 만듭니다.
		morning.greet();	//6. 참조 변수를 이용하여 인터페이스의 추상 메서드를 구현한 greet()메서드를 호출합니다.
		morning.talk();		//7

	}

}
