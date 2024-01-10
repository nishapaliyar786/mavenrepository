package assignment1;

public class AreaFigure {
	void area(float r)
	{
		double areac = (3.14*r*r);
		System.out.println("Area of circle is : "+areac);
	}
	void area(int l,int b)
	{
		double arear = l*b;
		System.out.println("Area of rectangle is : "+arear);
	}
	void area(int a)
	{
		int areas = a*a;
		System.out.println("Area of square is : "+areas);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AreaFigure af = new  AreaFigure();
      af.area(3.5f);
      af.area(2, 3);
      af.area(4);
	}

}
