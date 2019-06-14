import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  int n1=n;
  int k=1;
     int  a= k;
      int b=n;
    for(int i=1; i<=n;i++){
     
  for(k =1; k<=n;k++){
    
     if(k==a || k==b)
     System.out.print("*");
    else System.out.print(" ");
   
   }
      a++; b--;
     System.out.println();
  }
  
  }
}