import java.util.Scanner;

public class StringP {

	public static void main(String[] args) {
    
	Scanner sc = new Scanner(System.in);	
	String s = sc.nextLine();

	char[] str = s.toCharArray();
	char[] str1 = new char[str.length];
	int count= 0;
	boolean flag = false;
	System.out.println(s.length());
	System.out.println(str.length);
	for(int i = str.length-1; i>=0 ; i--)
	{
		str1[count] = str[i];
		count++;
	}
	
	{
		System.out.println(str1);
	}
	for(int i =0; i<str.length;i++) {
	if(str[i]==str1[i])
		flag=true;
	else
	     break;
	}
	if(flag==true)
	{
		System.out.println("YES");
	}
	else
		System.out.println("NO");
		
	}
}
