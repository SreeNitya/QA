package tutorial;

public class MultiDimarray 
{
 public static void main(String[] args)
  {
	int multi[][]= {{1,2,3},{3,4,5}};
	MultiDimarray obj=new MultiDimarray();
		
		table(multi);
		
  }

public static void table(int[][] x)
 {
	for(int row=0;row<x.length;row++)
   {
		for(int column=0;column<x[row].length;column++)
     {
			System.out.print(x[row][column]+"\t");
      }
			System.out.println("");
    }
		
  }
}
