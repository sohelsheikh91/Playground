import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n ; i++){
    arr[i]= in.nextInt();
    }
    int sum = arr[0];
    int big = 0;
    for(int i = 0 ; i<n-1;i++){
      
   		if(arr[i]<arr[i+1] ){
          if(sum >big){
          big = sum;
          sum = arr[i+1];
          }
    	
          
    	}else{
        sum = sum +arr[i+1];
       
        }
      	
    }
    if(big>sum)
    System.out.println(big);
    else
          System.out.println(sum);

  }
   
}
  