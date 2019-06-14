import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int[] arr= new int[n];
    	for (int i = 0; i<n ; i++)
        {
        arr[i] = in.nextInt();
        }
		  int rot = in.nextInt();
    int temp;
    for (int k= 0 ; k< rot; k++)
    {
      if(n%2==0){
           temp = arr[n-2];
        for (int r1=n-2 ;r1>0; r1-= 2 )
          {
           arr[r1]= arr[r1-2];
          }
          arr[0]=temp;
    }
      else{
       	   temp = arr[n-1];
      
          for (int r1=n-1 ;r1>0; r1-= 2 )
          {
           arr[r1]= arr[r1-2];
          }
          arr[0]=temp;
      }
    	//one
       if(n%2==0){
           temp = arr[1];
        for (int r1=1 ;r1<n-1; r1+= 2 )
          {
           arr[r1]= arr[r1+2];
          }
          arr[n-1]=temp;
    }
      else{
       	    temp = arr[1];
        for (int r1=1 ;r1<n-2; r1+= 2 )
          {
           arr[r1]= arr[r1+2];
          }
          arr[n-2]=temp;
      }
    }
    	for (int i = 0; i<n ; i++)
        {
        System.out.print(arr[i]+ " ");
        }
  	}
}