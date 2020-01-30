class Examples3
{
	public static void main(String[] args)
	{
		System.out.println(5==5);
		System.out.println(5==7);
		
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(3!=3);
		System.out.println(3!=9);
	
		System.out.println(-2<7);
		System.out.println(2<2);
		System.out.println(2<=2);
		System.out.println(7>9);

		System.out.println('a'<'A');
		System.out.println(7.9<5.6);
		System.out.println(2<='!');
		System.out.println((7.2*23)>9);	

		boolean p=true,q=false; //this is a shortcut to declare multiple variable of the same type at once
		System.out.println(p&&q);
		System.out.println(p&&p);
		System.out.println(false && false);
		
		System.out.println(p||q);
		System.out.println(p||p);
		System.out.println(false || false);
	}
}