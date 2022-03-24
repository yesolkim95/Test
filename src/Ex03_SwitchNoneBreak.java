
public class Ex03_SwitchNoneBreak
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n = 6;
		
		switch(n % 7)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("주중");	//case 1부터 5까지 break문을 없애 주중이 출력되도록 
			break;				//break는 반복문과 switch문에서만 사용가능, 실행흐름 중단 후 중괄호 빠져나감 
		case 6:
		default:
			System.out.println("주말");
		}

	}

}
