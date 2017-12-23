package LinkedList;

public class MergeSortedList {

	public ListNode mergeTwoListsRec(ListNode l1, ListNode l2) 
	{
		
		if(l1==null)
			return l2;
		else if(l2==null)
			return l1;
		
		if(l1.val<l2.val){
			l1.next=mergeTwoListsRec(l1.next,l2);
			return l1;
		}
		else{
		
			l2.next=mergeTwoListsRec(l1,l2.next);
			return l2;
		}
		
	}
	
	//l1-> 1,3,5,7 -- 3,5,6
	//l2-> 2,4,6 -- 4,6
	// return -> 1,2
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
	if(l1==null && l2==null)
		return null;
	
		if( l1==null)
			return l2;
		else if( l2==null)
			return l1;
		
		ListNode head= null;
		ListNode prev=null;
	
		while(l1!=null && l2!=null)
		{
			int val;
			if(l1.val<l2.val){
				val=l1.val;
				l1=l1.next;
			}else
			{
				val=l2.val;
				l2=l2.next;
			}
			
			
			if(head==null){
				head=new ListNode(val);
				prev=head;
			}
			else{
				
				prev.next=new ListNode(val);
				prev=prev.next;
			}
				
			
		}
		if(l1!=null)
			prev.next=l1;
		if(l2!=null)
			prev.next=l2;
		
		return head;
	
	
    }



	public static void main(String[] args)
	{
			MergeSortedList obj=  new MergeSortedList();
	
			ListNode l1= new ListNode(1);
			ListNode l2= new ListNode(2);
			l1.next=new ListNode(3);
			l2.next=new ListNode(4);
			l1.next.next=new ListNode(5);
			l2.next.next=new ListNode(6);
			l1.next.next.next=new ListNode(7);
			l2.next.next.next=new ListNode(8);
			l1.next.next.next.next=new ListNode(9);
			l2.next.next.next.next=new ListNode(10);
			
			System.out.println(obj.mergeTwoLists(l1, null).toString());
	
	
}
	
}
