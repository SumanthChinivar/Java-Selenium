

public class T1 extends Thread{

	public void run()
	{
		System.out.println("We are multi tasking");
	}
}

class Driver1
{
	public static void main(String[] args) {
		T1 t=new T1();
		T1 t1=new T1();
		System.out.println(t1.getName());
		t1.run();
		System.out.println(t.getName());
		t.run();
	}
}