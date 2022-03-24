//오버로딩
class Calc
{
	int add(int a, int b)	//모든 메서드명이 add()로 똑같다. 개수,자료형이 다를뿐이다. 
	{
		return a+b;
	}
	
	int add(int a)
	{
		return a + 1;
	}
	
	double add(double a, double b)
	{
		return a+b;
	}
}
public class OverloadingUse
{

	public static void main(String[] args)
	{
		Calc calc = new Calc();
		int nRtn1 = calc.add(3, 9);
		int nRtn2 = calc.add(3);
		double nRtn3 = calc.add(3.0, 9.0);
		
		System.out.println("Rtn1= "+ nRtn1);
		System.out.println("Rtn2= "+ nRtn2);
		System.out.println("Rtn3= "+ nRtn3);
	}

}
