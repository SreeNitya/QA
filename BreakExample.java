public class BreakExample 
{
 
  public static void main(String[] args) 
{     
    int intArray[] = new int[]{2,5,6,8,9};
   
    System.out.println("Elements less than 6 are: ");
    
    for(int i=0; i < intArray.length ; i ++)
    {  
      if(intArray[i] == 6)
        break; //after break statement is executed, control goes to the statement immediately after the loop					
      else
        System.out.println(intArray[i]);
    }
   
  }
}