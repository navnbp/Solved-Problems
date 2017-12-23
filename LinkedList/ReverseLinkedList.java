package LinkedList;
import java.util.Stack;


public class ReverseLinkedList {

	public ListNode reverseListRecu(ListNode head) 
	{
		if(head==null || head.next==null)
			return head;
		
		ListNode next=head.next;
		
		ListNode reverse=reverseListRecu(head.next);
		next.next=head;
		head.next=null;
		return reverse;
		
	}
	
	//1 -> 2-> 3 -> 4
	//head -> 1 2  
	//next -> 2 3 
	// 4-> 3 ->2
	
	//1->2->3->4->5
	//   2-> 1->null 
	//prev null 1
	//cur  1    2
	//next 2    3
	public  ListNode reverseList2(ListNode head) 
	{
		ListNode prevNode=null,currNode=head,nextNode=null;
		while(currNode!=null)
		{
			nextNode=currNode.next;
			currNode.next=prevNode;
			prevNode=currNode;
			currNode=nextNode;
			
		}
		return prevNode;
	}
public ListNode reverseList(ListNode head) {
	
	Stack<Integer> st=new Stack<Integer>();
	while(head!=null)
	{
		st.push(head.val);
		head=head.next;
		
	}
	ListNode list=null;
	while(!st.isEmpty())
        if(list==null){
        	list=new ListNode(st.pop());
        	head=list;
        }
        else
        {
        	list.next=new ListNode(st.pop());
        	list=list.next;
        }
	return head;
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList obj= new ReverseLinkedList();
		
		ListNode l1= new ListNode(1);
		
		l1.next=new ListNode(3);
		l1.next.next=new ListNode(5);
		l1.next.next.next=new ListNode(7);
		l1.next.next.next.next=new ListNode(9);
		
		ListNode a=obj.reverseList2(null);
		System.out.println("a");
		}

}
