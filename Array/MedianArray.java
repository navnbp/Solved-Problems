package Array;

public class MedianArray {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		return (findMedian(nums1)+findMedian(nums2))/2;    
    }
	
	public double findMedian(int[] nums) {
    
		int length=nums.length;
		
		if(length==0)
			return 0.0;
		else if(length==1)
			return nums[0];
		else if(length%2!=0)
			return nums[(length/2)];
		else
			return (nums[length/2]+nums[(length/2)-1])/2;    
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MedianArray obj= new MedianArray();
		int[] num1={1,3}, nums2={2};
		System.out.println(obj.findMedianSortedArrays(num1,nums2));
	}

}
