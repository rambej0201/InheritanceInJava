class A
{
	void m1(){
		System.out.println("Pehala nasha");
	}
	void m2(){
		System.out.println("Dusra soch");
	}
}

class B extends A
{
	void m3(){
		System.out.println("Theesra thareeka");
	}
	void m4(){
		System.out.println("Fourth Method");
	}
}

class ExEk extends B
{
	void m5(){
		System.out.println("Paandavula Method");
	}
	void m6(){
		System.out.println("Sixer Method");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello My Dear Methods");

		new A();
		new B();
		ExEk e1 = new ExEk();
		


		e1.m1(); e1.m2(); e1.m3(); e1.m4(); e1.m5(); e1.m6();
	}
}
