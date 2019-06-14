import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int count =0;
    for(int i=1; i<=n;i++){
    System.out.print(i);
      count++;
      if(count%3==0 && i!=n){
        System.out.print(",");
    }
  }
}}