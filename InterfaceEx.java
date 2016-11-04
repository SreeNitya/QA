interface IntExample{
 
 public void sayHello();
  
}
 
public class InterfaceEx implements IntExample
{
  
  public void sayHello()
 {
    System.out.println("Hello!");
 }
 
  public static void main(String args[])
{
    InterfaceEx javaInterfaceExample = new InterfaceEx(); //create object of the class
    
    javaInterfaceExample.sayHello();
  }
}
 

