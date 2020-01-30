class Examples2
{
	public static void main(String[] args)
	{
		System.out.println(2+3.5);
		System.out.println(2+'a'); //what happened? 2+97
		System.out.println(2-'a');
		System.out.println(3.5+'a');
		System.out.println('a'+'b'); 
		//System.out.println(2+true);
		
		//int x=2.3; Gonna error out instantly
		double y=4; // Gonna become 4.0
		char c=2; // Gonna be whatever unicode char is ID2
		int a='D'; // Gonna be the int of D
		
		//System.out.println(2+(int)true);
		int x=(int)2.3;
		System.out.println((char)'a'+'b'); 
		System.out.println((char)('a'+'b')); 
		System.out.println((char)3.5+'a');
		System.out.println(3.5+(double)'a');
		
		//java doesn't round
		System.out.println((int)7.2);
		System.out.println((int)7.9);
	}
}