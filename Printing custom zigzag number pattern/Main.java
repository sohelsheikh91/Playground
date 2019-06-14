import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  int n1=n;
  
    for(int i=1; i<=n;i++){
  for(int k =1; k<=n;k++){
     if(i%2==1 ){
       if(k!=n)
     System.out.print(i);
    else System.out.print(i+1);
    
   }
     
    if(i%2==0){
       if(k!=1)
     System.out.print(i);
    else System.out.print(i+1);
      
   }
    
    
  }
   System.out.println();
  }
}}
  