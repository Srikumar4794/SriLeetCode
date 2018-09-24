
public class MaxSumSubArray 
{
	public int findMaxSum(int[] arr)
	{
		int i=0, j=0, maxSum=0, sum=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i] < 0)
				sum=0;
			else
			{
				sum = sum + arr[i];
				if(sum > maxSum)
					maxSum = sum;
			}
		}
		return(maxSum);
	}
	public static void main(String args[])
	{
		int arr[] = {-2,5,2,-17,-8,-13,-5,-2};
		MaxSumSubArray m =new MaxSumSubArray();
		System.out.println(m.findMaxSum(arr));
	}
}
