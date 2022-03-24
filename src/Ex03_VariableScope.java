
public class Ex03_VariableScope
{

	public static void main(String[] args)
	{
		boolean myState = true;
		int num1 = 11;
		
		if(myState)
		{
			//int num1 =22; 포함이 된 작은 영역쪽에서 포함시킨 큰 영역 쪽의 변수는 사용 가능 반대는 불가능
			num1++;
			System.out.println(num1);
		}
		
		{
			int num2 = 33;
			num2++;
			System.out.println(num2);
		}
		
		for(int i=0; i<3; i++)
		{
			System.out.println(i);
		}

	}

}
