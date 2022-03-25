//오버라이딩
//상속받은 부모 클래스 메서드의 기능 변경
//상속받은 부모 클래스 메서드에 기능 추가
class Unit1 	//부모클래스
{
	String name;
	int hp;
	
	void doMove()	//메서드 정의
	{
		System.out.println("이동속도 10으로 이동");
	}
}

class Marine1 extends Unit1	//자식 클래스
{
	int attack;
	
	void doMove()		//부모 메서드와 같은 이름의 자식 메서드
	{
		super.doMove();	//부모 메서드 호출
		System.out.println(attack + "공격");
	}
}

class Medic1 extends Unit1 	//자식 클래스
{
	int heal;
	
	void doMove()	//부모 메서드와 같은 이름의 자식 메서
	{
		System.out.println("이동속도 8으로 이동");
		System.out.println(heal+ "치유");
	}
}
public class MyTerran2
{

	public static void main(String[] args)
	{
		Marine1 unit1 = new Marine1();
		unit1.name = "마린";
		unit1.hp = 100;
		unit1.attack = 20;
		
		Medic1 unit2 = new Medic1();
		unit2.name = "메딕";
		unit2.hp = 120;
		unit2.heal = 10;
		
		unit1.doMove();
		System.out.println();
		unit2.doMove();
		
	}

}
