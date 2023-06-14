package finalkeyword;

public class Finalkeywordinstancevariable {
	final int a = 20;

	public void show() {
		a = 30;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalkeywordinstancevariable f = new Finalkeywordinstancevariable();
		f.show();
	}

}
