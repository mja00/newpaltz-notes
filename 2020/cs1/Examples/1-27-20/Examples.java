class Examples
{
	public static void main(String[] args)
	{
		System.out.println(2+3);
		System.out.println("2+3="+2+3);
		//() make a difference
		System.out.println("2+3="+(2+3));
		
		//Does + have two different meanings? 
		
		System.out.println(2-3);
		//System.out.println("2-3="+2-3); //this is an example of a compile time error
		//() make a difference
		System.out.println("2-3="+(2-3));
		
		System.out.println("2*3*4="+(2*3*4));	
		
		//mixed expressions
		System.out.println("3+2*7-1 = "+(3+2*7-1));
		System.out.println("(3+2)*7-1 = "+((3+2)*7-1));
		System.out.println("3+2*(7-1) = "+(3+2*(7-1)));
		System.out.println("(3+(2*7))-1 = "+((3+(2*7))-1));
		//to avoid memorizing java's order of operations always use ()
		
		System.out.println("to use negative: "+ -1);
	}
}