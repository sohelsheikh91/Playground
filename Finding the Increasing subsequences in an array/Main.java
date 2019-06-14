import java.util.Scanner;
class Main
 {
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int arr[] = new int[n];
   	for(int i = 0; i< n ; i++){
   		arr[i]=in.nextInt();
   	}
 	for(int i = 0 ; i< n ; i++){
      int count =0,sum= 0, inc =0;
    	for (int j= i+1; j<n; j++){
        
          for (int k = i; k < j; k++){
          sum = sum + arr[i];
                      
          }
          if(arr[i]<arr[j]){
        	if(sum> inc){
          	  System.out.println(arr[i]+","+arr[j]);
              inc =sum;
            }
          }
          sum=0;
        }
    
    }
  }
}