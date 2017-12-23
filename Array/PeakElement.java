package Array;

public class PeakElement {

public int findPeakElement(int[] nums) {
       
	return binarySearch(nums,0,nums.length-1);
	
	
    }


	public int binarySearch(int[] nums, int low, int high) {

		if(low==high )
			return high;
		int mid=low+high>>1;
		
		if(nums[mid]>nums[mid+1])
			return  binarySearch(nums,low,mid);
		else 
		{
			return binarySearch(nums,mid+1,high);
		}
	
		
		
}


	public static void main(String[] args) {
		PeakElement obj= new PeakElement();
		int[] nums={1,2,3,1};
		System.out.println(obj.findPeakElement(nums));

	}

}
