import java.io.*;
import java.util.*;

public class RevString 
{
	public static void main(String[] args) 
	{
		String input= "Test Result";
		char[] duparray = input.toCharArray();
		int left, right=0;
		right=duparray.length-1;
		for(left=0;left<right;left++,right--)
		{
			char temp=duparray[left];
			duparray[left]=duparray[right];
			duparray[right]=temp;
			
		}
		for(char c : duparray)
			System.out.print(c);
		    System.out.println();

	}

}
