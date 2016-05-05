import java.util.Arrays;

public class MergeSortAlgorithm2 {

	public static void main(String[] args)
	{
	    int[] group=new int[] {6,45,2,1,5,44,453,3,7};
	    int[] result=Arrays.copyOf(group, group.length);
	   mergeSort(result,group,0,group.length);
	    for(int i=0;i<result.length;i++)
	    {
	    	System.out.print(result[i] + " ");
	    }
	}
	public static void mergeSort(int[] A,int[] result,int start,int end)
	{
		if(end-start<2)
		{
			return;
			
		}
		if(end-start==2)
		{
			if(result[end-2]>result[end-1])
			{
				int temp=result[end-2];
				result[end-2]=result[end-1];
				result[end-1]=temp;
				return;
			}
		}
		int mid=(start+end)/2;
		//int[] left=Arrays.copyOfRange(A, 0, mid);
		//int[] right=Arrays.copyOfRange(A, mid, A.length);
		mergeSort(result,A,0,mid);
		mergeSort(result,A,mid,end);
		//int[] result=new int[A.length];
		for(int i=start,j=mid,idx=start; idx<end;idx++)
		{
			if((j>=end) || (i<mid && A[i]<A[j]))
			{
				result[idx]=A[i++];
			}
			else
			{
				result[idx]=A[j++];
			}
			
		}
		
	}
}
