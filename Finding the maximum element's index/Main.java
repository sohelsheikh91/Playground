import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in= new Scanner(System.in);
    int n = in.nextInt();
    int[] arr= new int[n];
    for(int i =0 ; i<n; i++)
  	{
      arr[i]= in.nextInt();
  	}
    
    int s = 0,gre=0,ind=0;
    gre=arr[s];
    for(int j= 0; j<n-1; j++)
    {
    if(gre<arr[++s])
    {
      gre= arr[s];
      ind =s;
    }
    }
    System.out.println(ind);
  }
}