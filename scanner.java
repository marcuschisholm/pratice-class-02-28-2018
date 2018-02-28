package java.util;

public class scanner {
	public static void main(String[]args){
		System.out.println("enter a name");
		Scanner scan=new Scanner(System.in);
	String text1 =scan.nextLine();
	String text="james";
	char cl =text.charAt(0);
	System.out.println(cl); 
	String c1="james";
	
	int index=text.length()-2;
	System.out.println(text.charAt(index));
	
		
	}
}
