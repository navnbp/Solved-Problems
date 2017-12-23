package LinkedList;

public class SortList {

	public ListNode sortList(ListNode head)
	{
		if(head==null||head.next==null)
			return head;
		
		ListNode slow,fast,slowPrev;
		slowPrev=null;
		slow=head;
		fast=head;
		
		while(slow!=null && fast!=null )
		{
			slowPrev=slow;
			slow=slow.next;
			fast=fast.next.next;
			
		}
		slowPrev.next=null;
		
		ListNode left=sortList(head);
		ListNode right=sortList(slow);
		
		
		return merge(left, right);
		
	
	}
	
	
	
	public ListNode merge(ListNode l1, ListNode l2)
	{
		if(l1==null)
			return l2;
		else if(l2==null)
			return l1;
		
		if(l1.val<l2.val)
		{
			l1.next=merge(l1.next,l2);
			return l1;
			
		}
		
			l2.next=merge(l1, l2.next);
			return l2;
			
		
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
