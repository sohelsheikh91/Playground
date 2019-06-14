import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
  int n1 = in.nextInt();
	sum(n1);
 
    
 	
}
  public static void sum(int n1){
    int sum = 0;
    for (int j= 2;j<n1;j++){
 	for(int i = 2 ; i<j; i++){
	if(j%i==0){
 	  sum++;
    }
 }
    if(sum ==0){
   System.out.println(j);
    }
      sum=0;
    }
    }
}
