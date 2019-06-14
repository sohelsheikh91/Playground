import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
  	Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i< n; i++){
    arr[i] = in.nextInt();
    }
    int i = 0;
    int j = n-1;
    int count = 0;
      
   		while(i<j){
   	 	if(arr[i]!=arr[j]){
    		count++;
      			
   			 }
          i++;
      	  j--;
    	}
      if(count==0){
      System.out.println("Yes");
      }else
        System.out.println("No");
    }
}