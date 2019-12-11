package java8;


interface Mathoperation
{
	public int operation(int a,int b);
}
class test
{
	void fun()
	{
		Mathoperation mo = (a,b)-> { return a + b;};
		System.out.println(mo);
	}
	public static void main(String s[])
	{
		new test().fun();
	}
	
}