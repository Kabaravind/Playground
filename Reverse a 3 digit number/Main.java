import java.util.Scanner;
class Main
{
  public static void main(String args[])
    
  {
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int F=n1/100;
    int S=(n1/10)%10;
    int L=n1%10;
    int R=(L*100)+(S*10)+F;
    System.out.println(R);
    //Type your code here
  }
}