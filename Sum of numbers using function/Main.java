import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(Sum_of_a_number(n));
    }
  public static int Sum_of_a_number(int a)
  {
	int i=1,sum=0;
    while(i<=a)
    {
	sum=sum+i;
      i++;
    }
      return sum;
    }
     
    
	    // Type your code here
	}
