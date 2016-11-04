public class BreakLabel
{
 
  public static void main(String[] args) 
 {
      
    int[][] intArray = new int[][]{{2,4,6,8,9},{10,20,30,40,50}};
    boolean blnFound = false;
   
    System.out.println("Finding 40 in a two dimensional array");
   
    Outer:
    for(int i=0; i < intArray.length ; i++)
    {
      Inner:
      for(int j=0; j < intArray[i].length; j++)
      {
        if(intArray[i][j] == 40)
        {
          blnFound = true;
          break Outer;
        }  
       
      }
    }
   
    if(blnFound == true)
      System.out.println("40 found in the array");
    else
      System.out.println("40 not found in the array");
  }
}
