public class String1000 {
	
	public static void printName(int count, String name, int max)
	{
		if(count <= max)
		{
			System.out.println(name +"  "+count);
			count++;
			printName(count, name, max);
		}
		
	}		
	public static void main(String[] args) {
		
		printName(1,"jesus",1000);
		
			
	}

}