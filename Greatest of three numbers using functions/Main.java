import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(Greatest_of_three_numbers(n1,n2,n3));
	    // Type your code here
	}
  public static int Greatest_of_three_numbers(int n1,int n2,int n3)
  {
	if(n1>n2&&n1>n3)
    {
      return n1;
	}
    else if(n2>n1&&n2>n3)
    {
      return n2;
    }
    else
    {
      return n3;
    }
  }
}
      