/*

Define an abstract class ‘Themepark’ and inhert 2 classes Queenstand! and Wonderta from the abstract class, In both
the theme parks, the entrance fee for adults a Re. 500 and for children itis Re. 200. If a farilybuya adult ticketa and
‘ni childven tickets, define a method inthe abstract clas to caleulate the total cost

‘Also, declare an abetract method playGame() which must be redefined in the subclasses, In Queensland, there are a total
‘of 30 games. Hence create a Boolean array named Games’ of size 30 which intialyctores false values forall the
elements. f the player enters any game code that has already been played, a warning message should be displayed and
the user should be asked for another choice. In Wonder, thete area total of 40 efferent games. Thus create an integer
‘array with a0 elements, Here, the games can be replayed, until the user want to quit. Finally display the games played as
shown In sample output

Input Format
============

Fit line of input consists of Theme patk code (1 for Queensland and 2 for Wonders)
‘Second ine of input consists of games played

‘Output Format
==============

‘Welcome message in ist line followed by games played details as shown in sample outputs

‘Sample Testcases
=================

‘Testease 1 Input
=================
1
4 5 6 7 8 20 5 7

Output
======
Welcome to Queensland!
Playing game 4 at Queensland
Playing game 5 at Queensland
Playing game 6 at Queensland
Playing game 7 at Queensland
Playing game 8 at Queensland
Playing game 20 at Queensland
You have already played game 5
You have already played game 7

‘Testease 2 input
=================
2
4 5 6 7 8 20 5 7

Output
======
Welcome to Wonderla
Playing Game 4 at Wonderla
Playing Game 5 at Wonderla
Playing Game 6 at Wonderla
Playing Game 7 at Wonderla
Playing Game 8 at Wonderla
Playing Game 20 at Wonderla
Playing Game 5 again at Wonderla
Playing Game 7 again at Wonderla

*/
import java.util.Scanner;
abstract class Themepark
{
	public abstract void playGame(int a[]);
}
class Main_1
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int q[]=new int[30];
		int w[]=new int[40];
		if(n==1){
			Queensland qe=new Queensland();
			qe.playGame(q);
		}
		else if(n==2){
			Wonderla wo=new Wonderla();
			wo.playGame(w);
		}
	}
}
class Queensland extends Themepark
{
	public void playGame(int a[]){
		Scanner sa=new Scanner(System.in);
		String str=sa.nextLine();
		String s[]=str.split(" ");
		System.out.println("Welcome to Queensland!");
		for(int i=0;i<s.length;i++){
			for(int j=0;j<a.length;j++){
				int num=Integer.valueOf(s[i]);
				if(num==a[j]){
					System.out.println("You have already played game "+num);
				}
				else if(num-1==j && a[j]==0){
					a[j]=num;
					System.out.println("Playing game "+num+" at Queensland");
				}
			}
		}
	}
}
class Wonderla extends Themepark
{
	public void playGame(int a[]){
		Scanner sa=new Scanner(System.in);
		String str=sa.nextLine();
		String s[]=str.split(" ");
		System.out.println("Welcome to Wonderla");
		for(int i=0;i<s.length;i++){
			for(int j=0;j<a.length;j++){
				int num=Integer.valueOf(s[i]);
				if(num==a[j]){
					System.out.println("Playing Game "+num+" again at Wonderla");
				}
				else if(num-1==j && a[j]==0){
					a[j]=num;
					System.out.println("Playing Game "+num+" at Wonderla");
				}
			}
		}
	}
}