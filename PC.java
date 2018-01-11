class PC
{
	PC(){
		System.out.println("peddha class sunna arguments");
	}
}
class child extends PC
{
	child(){
		this(5);
		System.out.println("chinna class sunna arguements");
	}
	child(int a){
		super();
		System.out.println("chinna class okka arguements");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello Haritha");
		new child();
	}
}
