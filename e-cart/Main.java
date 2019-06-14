//import required packages here
import java.util.Scanner;

class Item
{
  private int price;
  //create various method to return attribute value(s)
  Scanner in = new Scanner(System.in);
  public int getPrice(){
  	return in.nextInt();
  }
  
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  Scanner in = new Scanner(System.in);
   public String getPro(){
  	return in.nextLine();
  }
   public int getQua(){
  	return in.nextInt();
  }
  
}

class Bill
{
  //implement your logic to calculate total price
  Scanner in = new Scanner(System.in);
  public Bill(int a, int b){
    int c;
    c =  a* b;
  	System.out.println("Total Price is : "+ c );
  }
  
}
class Main
{
  public static void main(String[] args)
  {
      Scanner in = new Scanner(System.in);
	
    Item i = new Item();
    Customer c = new Customer();
    String str =in.nextLine();
    int a = in.nextInt();
    int b = in.nextInt();
    Bill obj = new Bill(a,b);
    //write the logic here
  }
}