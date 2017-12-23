package LinkedList;

public class ListNode {
	
	int val;
	ListNode next;
	@Override
	public String toString() {
		
		String str="";
		while(next!=null)
		{
			str+=" "+val+" ";
		}
		return str;
	}
	ListNode(int x)
	{
		val=x;
	}
	
	

}
