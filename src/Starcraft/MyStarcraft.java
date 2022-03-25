abstract class Unit3 	//부모 클래스
{
	abstract void doMove();	//1.추상 클래스
}

class Marine3 extends Unit3 	//자식 클래스
{
	void doMove()	//2.추상 클래스 구현
	{
		System.out.println("마린은 두 발로 이동합니다.");
	}
	
}

class Zergling extends Unit3 	//자식 클래스
{
	void doMove()
	{
		System.out.println("저글링은 네 발로 이동합니다.");
	}
}
public class MyStarcraft
{

	public static void main(String[] args)
	{
		Marine3 unit1 = new Marine3();	//4
		unit1.doMove();	//5
		
		Zergling unit2 = new Zergling(); //6
		unit2.doMove();	//7
	}

}
