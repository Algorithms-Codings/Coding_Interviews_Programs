import java.util.Arrays;

public class MergeSortAlgorithm {

	public static void main(String[] args)
	{
	    int[] group=new int[] {6,45,2,1,5,44,453,3,7};
	    group=mergeSort(group);
	    for(int i=0;i<group.length;i++)
	    {
	    	System.out.print(group[i] + " ");
	    }
	}
	public static int[] mergeSort(int[] A)
	{
		if(A.length==1)
		{
			return A;
			
		}
		if(A.length==2)
		{
			if(A[0]>A[1])
			{
				int temp=A[0];
				A[0]=A[1];
				A[1]=temp;
				return A;
			}
		}
		int mid=A.length/2;
		int[] left=Arrays.copyOfRange(A, 0, mid);
		int[] right=Arrays.copyOfRange(A, mid, A.length);
		left=mergeSort(left);
		right=mergeSort(right);
		for(int i=0,j=0,idx=0; idx<A.length;idx++)
		{
			if((j>=right.length) || (i<left.length && left[i]<right[j]))
			{
				A[idx]=left[i++];
			}
			else
			{
				A[idx]=right[j++];
			}
			
		}
		return A;
	}
}
