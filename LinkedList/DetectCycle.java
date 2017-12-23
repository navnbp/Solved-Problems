package LinkedList;

public class DetectCycle {

public boolean hasCycle(ListNode head) {
	boolean returnValue=false;
	
	if(head==null) return false;
	
	ListNode slow=head,fast=head;
	
	while(fast.next!=null && fast.next.next!=null)
	{
		
		slow=slow.next;
		fast=fast.next.next;
		if(slow==fast)
			return true;
	}
	
	

	return false;
	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head= new ListNode(1);
		head.next=head;
		ListNode l1= new ListNode(1);
		l1.next=head;
		//head=l1;
		DetectCycle obj= new DetectCycle();
		System.out.println(obj.hasCycle(head));

	}

}
