import java.util.*;
import java.io.*;
import java.lang.*;
class Fibonacci extends Thread
{
  // type your code here
  static int n;
  public Fibonacci(int n){
  this.n=n;
  }
  public void run(){
      try
      {
      	if(n>0){
            int a=0, b=1, c=0;
            System.out.print("The Fibonacci series is :");
            System.out.print(a+" ");
            for(int i=0;i< n-1;i++){
            System.out.print(b+" ");
            c= a+b;
             
             a=b;
             b=c;
            }
            }else
            throw new Exception();
            
       }
       catch(Exception e)
       {
                 System.out.println("Exception occurred");
       }


    }
}
class Main
{
     public static void main(String[] args) 
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the limit for Fibonacci: ");
       int n;
       try{  
    	 n = Integer.parseInt(br.readLine());
         System.out.println(n);
       	Fibonacci fibo = new Fibonacci(n);
       Thread t1 = new Thread(fibo);
       t1.start();
    } catch (IOException e) {e.printStackTrace();}
       
     }
}