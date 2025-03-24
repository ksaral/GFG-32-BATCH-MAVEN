package gfg32maven;

public class MyCalc {
	
	public int sum(int a, int b)
	{
		int c,d;
		c=a+b;
		return c;
	}
	public int diff(int a, int b)
	{
		return (a-b);
	}
	public int mul(int a, int b)
	{
		return (a*b);
	}
	
	public int div(int a, int b)
	{
		return (a/b);
	}
	public int mod(int a, int b)
	{
		return (a%b);
	}
	public void greet()
	{
		System.out.println("Hello Master Branch");
	}
	

	public static void main(String[] args) {

		MyCalc calc = new MyCalc();
		System.out.println("Sum is :"+calc.sum(20, 10));
		System.out.println("Diff is :"+calc.diff(20, 10));
		System.out.println("Mul is :"+calc.mul(20, 10));
		System.out.println("Div is :"+calc.div(20, 10));
		System.out.println("Mod is :"+calc.div(20, 10));
		calc.greet();

	}

}
