import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		/*

		Scanner sa=new Scanner(System.in);
		String s=sa.nextLine();
		String res="";
		for(int i=s.length()-1;i>=0;i--){
			res=res+s.charAt(i);
		}
		System.out.print(res);

		*/

		Scanner sa=new Scanner(System.in);
		String s=sa.nextLine();
		String a[]=s.split("");
		int len=a.length;
		String a1[]=new String[len];
		int index=0;
		for(int i=a.length-1;i>=0;i--){
			a1[index]=a[i];
			index++;
		}
		for(int i=0;i<a1.length;i++){
			a[i]=a1[i];
		}
		String st=s.join("",a);
		System.out.print(st);
	}
}
