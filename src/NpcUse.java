//클래스 정
class Npc{
	//필드 : 데이터
	String name;
	int np;
	
	//메서드 : 동작
	void say() 
	{
		System.out.println("안녕하세요");
	}
}
public class NpcUse
{

	public static void main(String[] args)
	{
		// 클래스를 이용해 객체 생성
		// -'Npc'라는 설계도(클래스)를 이용해 Npc 객체 만들기
		// 클래스 타입의 변수는 new를 통해 객체 생성
		// 클래스 타입의 참조 변수는 스택에, 생성된 객체는 힙에 적재됨
		Npc saram1 = new Npc();
		
		saram1.name = "경비";		//멤버 변수에 직접 접근
		saram1.np=100;	//멤버 변수에 직접 접근
		System.out.println(saram1.name+":"+saram1.np);
		saram1.say(); 	//메서드 호출
		//객체 생성에 new 연산자를 사용합니다.
		//다른 객체의 멤버에는.을 이용하여 접근합니다.
		
	}

}
