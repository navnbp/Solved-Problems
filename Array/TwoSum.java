package Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class TwoSum {

//[2, 7, 11, 15], target = 9, [0,1]
	
	public int[] twoSum(int[] nums, int target) {
	    
		Map<Integer, Integer> twoSum= new HashMap<Integer,Integer>();
		int size=nums.length;
		for(int i=0;i<size;i++)
		{
			
			if(!twoSum.containsKey(nums[i]))
				twoSum.put(target-nums[i], i);
			else
				return new int[]{twoSum.get(nums[i]),i};
		}
		return new int[2];
    }
	
	public int[] twoSum1(int[] nums, int target) {
    
		int[] result= new int[2];
		
		
		boolean flag= true;
		
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length && flag;j++)
			{
				if(nums[i]+nums[j]==target){
					result=new int[]{i,j};
					flag=false;
					break;
				}
			}
		}
		
		
		
		return result;
		
    }
	
	public static void main(String[] args) {
		TwoSum obj= new TwoSum();
		int[] input= new int[]{3,2,4};
		Object answer=obj.twoSum(input, 6);
		System.out.println("Two Sum");
		
		
	}

}
