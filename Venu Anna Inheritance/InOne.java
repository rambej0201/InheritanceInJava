class InOne 
{
	 static int i = 15;
	static int j = 10;
}
class InTwo extends InOne
{
	int k = 5;
	int m = i+j+k;
	public static void main(String[] args) 
	{
		System.out.println("Result is "+m);

	}
}
