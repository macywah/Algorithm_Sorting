public class SelectionSort {

	public static void main(String[] args)
	{
		//unsorted data
		int[] s = {9,5,3,3,24,12,1};
		printArray(s);
		
		//call selection sort method
		selectionsort(s);
		 
		System.out.println("\nSorted: ");
		printArray(s);
	}
	
	public static void selectionsort(int[] s)
	{
		int min = 0;
		int temp = 0;
		
		for(int i=0; i<s.length; i++)
		{
			min = i;
			for(int j=i; j<s.length; j++)
			{
			        if(s[min] > s[j])
				{
					min = j;
				}
				
				//swap s[i] and s[min]
			        temp = s[i];
			        s[i] = s[min];
			        s[min] = temp;
			}
		}
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
