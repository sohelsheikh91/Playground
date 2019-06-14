import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[]= new int[n];
    for(int i = 0; i< n; i++)
    {
    arr[i]= in.nextInt();
    }
    int[] sum= new int[n/3];
    int a= 0;
    int count=0;
    int c=0;
    for(int j = 0; j<n/3; j++)
    {
    
    
        a= add(arr[c],arr[++c],arr[++c]);
    
      
     c++;
      sum[j]= a;
     
     
      a=0;
    }
    for(int m =0; m < n/3-1; m++)
    {
    if(sum[m]==sum[++m]){
    count++;
    }
      m--;
    }
   
    int f= n/3-1;
    if(count==f)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
  public static int add(int a,int b,int c){
      return a+b+c;
  }
}