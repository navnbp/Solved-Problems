package List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class  NestedInteger
{
	int integer;
	List<NestedInteger> list=null;
	
	 public boolean isInteger()
	 {
		 return list==null?true:false;
	 }
	
	public int getInteger() {
		return integer;
	}
	public void setInteger(int integer) {
		this.integer = integer;
	}
	public List<NestedInteger> getList() {
		return list;
	}
	public void setList(List<NestedInteger> list) {
		this.list = list;
	}
}
//[[1,1],2,[1,1]] ->10
//[1,[4,[6]]] -> 27  (1 + 4*2 + 6*3 = 27)
public class NestedSum {

	 public int depthSumRec(List<NestedInteger> nestedList) {
	        int depth=1,sum=0;
	            
	              
	            return calculateSum(nestedList,1);
	        
	    }
	 
	
	 public int calculateSum(List<NestedInteger> nestedList,int depth)
	 {
		 int sum=0;
		 
		 for(NestedInteger i:nestedList)
		 {
			 
			 sum+=i.isInteger()?i.getInteger()*depth:calculateSum(i.getList(),depth+1);
			 
		 }
		 
		 return sum;
		 
	 }
	 
	 public int depthSum(List<NestedInteger> nestedList) 
	 {
		 if(nestedList==null)
		 return 0;
		 int depth=1,sum=0;
		 Queue<NestedInteger> q= new LinkedList<NestedInteger>(nestedList);
		 
		 while(!q.isEmpty())
		 {
			 NestedInteger temp=q.poll();
			 
			 
			 
			 if(temp.isInteger())
				 sum+=temp.getInteger()*depth;
			 else
			 {
				q.addAll((temp.getList()));
				 
			 }
				 
			 
			 
			 
			 
		 }
		 
		 return sum;
		 
	 }
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Queue<Integer> q= new LinkedList<Integer>();
		 
		 
		 q.add(1);
		 q.add(12);q.poll();
		 q.add(13);
		 q.add(14);
		 q.add(15);q.poll();
		 q.add(16);
		 q.add(17);
		 q.add(18);q.poll();
		 q.add(19);
		 q.add(2);q.poll();
		 q.add(21);
		 q.add(22);
		 q.add(23);
		 q.poll();
		 q.poll();
		
		
	}

}
