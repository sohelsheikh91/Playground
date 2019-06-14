import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
            	
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = sc.nextInt();
        }
      int k = sc.nextInt();
      int [] hello = new int[n]; 
       hello = sort(n,arr);
      System.out.println(hello[k/2]);
     
    }
      public static int[] sort(int n,int arr[]){
      for(int j=0; j<n;j++){
    	for(int i = j+1; i< n ; i++){

    		if(arr[j]>arr[i]){
            int temp =arr[j];
              arr[j]=arr[i];
              arr[i]= temp;
            }
   		}
        }
    	return arr;
    }
      
       
}