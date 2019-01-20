import java.util.Scanner;
class Main{ 
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int number=in.nextInt();
      int num,temp,total=0;
      num=number;
      while(num!=0)
      {
        temp=num%10;
        total=total+temp*temp*temp;
        num=num/10;
      }
      if(total==number)
         
           System.out.println("Armstrong Number");
           else
             System.out.println("Not a Armstrong Number");
         
          
          
	   // Type your code here
	}
}