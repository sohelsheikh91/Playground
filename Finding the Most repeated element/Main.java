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
   	int grt = 0 ;
    int count = 0 ;
    for(int i = 0 ; i< n ; i++){
    	for(int j = i; j < n;j++){
        if(arr[i]==arr[j]){
        	count ++;
        }
        }
      	for(int k= 0 ; k<i; k++){
          if(arr[i]==arr[k]){
        	count ++;
        }
        	
        }
      if(count> grt){
        grt = count ;
      }
      count =0;
    }
    if(grt ==1){
        System.out.println(arr[0]);

    }else
    System.out.println(grt);
      
  }
   
}
  