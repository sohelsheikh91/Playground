//import required packages
import java.util.Scanner;

class Faculty
{
  int base;
  public Faculty(){}
  public Faculty(int a){
  base = a;
  }
  
  
  public int salary()
  {
    
    System.out.println("Base Salary: "+base);
    return base;
  }
}
class CSE extends Faculty
{
int cse = 3000;
  public void salary(int a)
  {
    cse = a + cse;
  }
}
class IT extends Faculty
{
int it=5000;
  public void salary(int a)
  {
   it = a + it;
  }
}
class ECE extends Faculty
{
  int ece=4500;
  
  public void salary(int a)
  {
    //write your ECE class statements
    ece = a + ece;
  }
}

class Main
{
  public static void main(String[] args)
  {
     Scanner in = new Scanner(System.in);
    

    Faculty fac = new Faculty( in.nextInt());
    int a = fac.salary();
    CSE obj = new CSE();
    
    obj.salary(a);
    System.out.println("CSE Faculty: "+obj.cse);
    IT obj1 = new IT();
    obj1.salary(a);
    System.out.println("IT Faculty: "+obj1.it);
    ECE obj2 = new ECE();
    obj2.salary(a);
    System.out.println("ECE Faculty: "+obj2.ece);
    //implement your required concept here
  }
}