public class Ex02_MemoryInHeap1
{
	public static void main(String[] args)	//실행하다 이 표시를 만나면 여기서 멈추고 기다리라는 뜻
	{
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.num = 10;
		book2.num = 20;
		
		System.out.println(book1.num);
		System.out.println(book2.num);
		
		book1 = null;	//참조를 끊는다.
		book2 = null;

	}

}
