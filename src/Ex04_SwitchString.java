
public class Ex04_SwitchString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String name = "홍길동";	//switch문의 조건식에 스트링 변수나 스트링 값을 사용할 수 있습니다.
		
		switch(name)	//조건식
		{
			case "홍길동":
				System.out.println("제 이름은 홍길동입니다.");
				break;
			case "전우치":
				System.out.println("제 이름은 전우치입니다.");
				break;
			case"손오공":
				System.out.println("제 이름은 손오공입니다.");
				break;
			default:
				System.out.println("같은 이름이 없습니다.");
				
		}

	}

}
