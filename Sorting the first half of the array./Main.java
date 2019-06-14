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
    int val = n/2;
    int temp [] = new int [val];
    for(int i =  0;i < val ; i++)
    {
    	temp[i] = arr[i];
    }
   	 temp  = insertion(val,temp);
    for(int i =  0;i < val ; i++)
    {
    	arr[i] = temp [i];
    }
     for(int i =  0;i < n ; i++)
    {
      	System.out.print(arr[i]+" ");
    }
  }
  public static int[] insertion(int n, int[] arr)
  {
  	for(int i = 1; i< n; i++)
    {
    	int key = arr[i];
      	int ind = i-1;
      	while((ind >= 0) &&	(arr[ind]> key))
        {
        	arr[ind+1]= arr[ind];
         	ind--;
        }
      	arr[ind+1] = key;
    }
    return arr;
    }
}