
public class MergeSort {

	public static void main(String[] args) 
	{
		int[] s = {3,6,15,9,7,1,4,3};
		printArray(s);
	    
	    int[] output = mergesort(s);
	    
	    System.out.println("\nSorted: ");
	    printArray(output);
	}
	
	public static int[] mergesort(int[] s)
	{
		if(s.length <= 1)
		{
			return s;
		}
		
		int middle = s.length/2;
		int[] firstHalf = getSubArray(s,0,middle-1);
		int[] secondHalf = getSubArray(s,middle,s.length-1);
		
		int[] s1 = mergesort(firstHalf);
		int[] s2 = mergesort(secondHalf);
		int[] output = merge(s1,s2);
		
		return output;
	}
	
	public static int[] merge(int[] s1, int[] s2)
	{
		int[] sorted = new int[s1.length + s2.length];
		
		int j = 0;
		int k = 0;
		int i = 0;
		
		while(j<s1.length && k < s2.length)
		{
			if(s1[j] < s2[k])
			{
				sorted[i] = s1[j];
				j++;
			}else
			{
				sorted[i] = s2[k];
			    k++;
			}
			i++;
		}
		
		while(j<s1.length)
		{
			sorted[i] = s1[j];
			i++;
			j++;
		}
		
		while(k < s2.length)
		{
			sorted[i] = s2[k];
			i++;
			k++;
		}
		return sorted;
	}
	
	public static int[] getSubArray(int[] s, int head, int end)
	{
		int[] output = new int[end-head+1];
		
		int k=0;
		
		for(int i=head; i<=end; i++)
		{
			output[k] = s[i];
			k++;
		}
		return output;
	}
	
	public static void printArray(int[] s)
	{
		for(int i=0; i<s.length; i++)
		{
			System.out.print("" + s[i] + " ");
		}
		System.out.println(" ");
	}	
}
