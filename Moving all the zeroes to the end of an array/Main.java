import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int[] arr= new int[n];
    	for (int i = 0; i<n ; i++)
        {
        arr[i] = in.nextInt();
        }
      int count= 0;
      
     for (int i = 0; i<n ; i++)
        {
        if(arr[i]==0)
          count++;
        }
      int[] wow = new int[n-count];
      int up= 0;
       for (int i = 0; i<n ; i++)
        {
        if(arr[i]>0){
          wow[up]=arr[i];
     	   up++;
        }
         
        }
       for (int i = 0; i<n-count ; i++)
        {
       	arr[i]=wow[i];
        }
      	for (int i =n-count; i<n ; i++)
        {
       	arr[i]=0;
        }
      
        for (int i = 0; i<n ; i++)
        {
        System.out.print(arr[i]+" ");
        }
    }
}