package packagemethodoverloading;

public class MethodOverloading {
	void show()
	{
		System.out.println("show");
	}
	void show(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MethodOverloading m = new MethodOverloading();
       m.show();
       m.show(10);
	}

}
