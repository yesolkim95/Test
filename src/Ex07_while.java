
public class Ex07_while
{

	public static void main(String[] args)
	{
		int num = 0;
		int count = 0;
		
		do	//실행 후 비교. 조건문이 false더라도 최소 1회는 실행됨
		{
			num++;
			
			if((num % 5) != 0)
				continue;
			if((num % 7) != 0)
				continue;
			
			count++;				//5와 7의 배수인 경우에만 실행
			System.out.println(num);//5와 7의 배수인 경우에만 실행
		}while(num< 100);	//세미콜론; 잊지말기!
		
		System.out.println("count: "+ count);
	}

}
