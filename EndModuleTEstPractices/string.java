import java.util.Scanner;
public class string {

	public static void main(String[] args) {
		
		String ogstring="IACSD DAC";
		System.out.println("Original String: "+ogstring);
		Scanner sc=new Scanner (System.in);
		int ch=0;
		int i;
		String newstring=null;
		do {
			
			System.out.println("Enter choice: ");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				for(i=0;i<ogstring.length();i++)
				{
					if(i == 5)
					{
						String insertstring=" PG";
						newstring=ogstring.substring(0,5)+ insertstring+ogstring.substring(5);
						System.out.println(newstring);
					}
				}
				break;
				
			case 2:
				for(i=0;i<ogstring.length();i++)
				{
					if(i == 5)
					{
						String insertstring=" PG";
						newstring = newstring.replace(insertstring,"");
						System.out.println(newstring);
					}
				}
				break;
				
			case 3:
				for(i=0;i<ogstring.length();i++)
				{
					if(i == 5)
					{
							
							newstring = ogstring.replace("DAC","DBDA");
							System.out.println(newstring);
					}
				}
				break;
				
			}
			
		}while(ch != 3);

	}

}
