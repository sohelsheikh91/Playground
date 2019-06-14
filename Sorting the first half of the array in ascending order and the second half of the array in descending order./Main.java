import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int index = 0;index < n; index++)
    {
      arr[index] = sc.nextInt();  
    }
    int val=0;
     int val1=0;
    if(n%2==0){
   	  val = n/2;
     val1 = n/2;
    }else{
    
     val = n/2;
     val1 = n/2+1;
    }
    int temp [] = new int [val];
    int temp1 [] = new int [val1];
    for(int i =  0;i < val ; i++)
    {
    	temp[i] = arr[i];
    }
    for(int i =  val;i < n ; i++)
    {
    	temp1[i-val] = arr[i];
    }
   	 temp  = insertion(val,temp,'a');
     temp1  = insertion(val,temp1,'d');
    for(int i =  0;i < val ; i++)
    {
    	arr[i] = temp [i];
    }
     for(int i =  val;i < n ; i++)
    {
    	arr[i] = temp1 [i-val];
    }
     for(int i =  0;i < n ; i++)
    {
      	System.out.print(arr[i]+" ");
    }
  }
  public static int[] insertion(int n, int[] arr, char c)
  {
    
  	for(int i = 1; i< n; i++)
    {
    	int key = arr[i];
      	int ind = i-1;
      if (c=='a'){
      	while((ind >= 0) &&	(arr[ind]> key))
        {
        	arr[ind+1]= arr[ind];
         	ind--;
        }
      }else if(c=='d'){
        	while((ind >= 0) &&	(arr[ind]< key))
        {
        	arr[ind+1]= arr[ind];
         	ind--;
        }
      }
      	arr[ind+1] = key;
    }
    return arr;
    }
}