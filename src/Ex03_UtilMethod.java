
public class Ex03_UtilMethod
{

	public static void main(String[] args)
	{
		MyCalculator1 calc1 = new MyCalculator1();	//객체 생성 후 사용
		int num1 = calc1.adder(1, 2);
		System.out.println(num1);
		
		int num2 = MyCalculator1.adder(2, 3); 	//새로 객체를 생성하지 않고 사용
		System.out.println(num2);

	}

}
