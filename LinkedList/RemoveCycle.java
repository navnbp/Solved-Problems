package LinkedList;

public class RemoveCycle {

public ListNode detectCycle(ListNode head) {
	
	if(head==null) return null;
	
	ListNode slow=head, fast=head;
	
	while(fast.next!=null && fast.next.next!=null)
	{
		slow=slow.next;
		fast=fast.next.next;
		if(slow==fast)
			return removeCycle(head,slow);
			
		}
	
	return null;
        
    }
	
public ListNode removeCycle(ListNode head, ListNode slow) {
			
	while(head!=slow)
	{
		head=head.next;
		slow=slow.next;
	}
		
	
	return slow;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
