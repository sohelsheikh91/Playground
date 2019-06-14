import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
 int n = in.nextInt();
  int[] arr= new int[n];
  for(int i =0; i<n; i++)
  {
 	arr[i] = in.nextInt();
  }
  int ele1 = in.nextInt(); 
  int ele2 = in.nextInt(); 
  int count1=0;
  int count2=0;
  for(int j= 0; j <n ; j ++)
  {
		if(ele1==arr[j]){
   		 System.out.println(j);
   		count1++;
		}
    	if(ele2==arr[j]){
   		 System.out.println(j);  
          count2++;
        }
  }
   if(count1 ==0)
          System.out.println("-1");
  if(count2 ==0)
          System.out.println("-1");
   			
  
}
}