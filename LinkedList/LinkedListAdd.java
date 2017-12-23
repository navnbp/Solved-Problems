package LinkedList;
import java.util.Stack;


public class LinkedListAdd {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	     
		 ListNode temp=l1;
		 Stack<Integer> st1= new Stack<Integer>();
		 while(temp!=null)
		 {
			 st1.push(temp.val);
			 temp=temp.next;
			 
		 }
		 temp=l2;
		 Stack<Integer> st2= new Stack<Integer>();
		 while(temp!=null)
		 {
			 st2.push(temp.val);
			 temp=temp.next;
			 
		 }
		 ListNode next= null;
		 int sum=0,rem=0,div=0;
		 while(!st1.isEmpty() && !st2.isEmpty())
		 {
			  sum= st1.pop()+st2.pop()+div;
			  rem=sum%10;
			  div=sum/10;
			 temp=new ListNode(rem);
			 temp.next=next;
			 next=temp;
			 
		 }
		 
		 while(!st1.isEmpty())
		 {
			 sum= st1.pop()+div;
			 rem=sum%10;
			 div=sum/10;
			 temp=new ListNode(rem);
			 temp.next=next;
			 next=temp;
			 
		 }
		 while(!st2.isEmpty())
		 {
			 sum= st2.pop()+div;
			 rem=sum%10;
			 div=sum/10;
			 temp=new ListNode(rem);
			 temp.next=next;
			 next=temp;
		 }
		 
		 if(div>0)
		 {
			 temp=new ListNode(div);
			 temp.next=next;
			 next=temp;
		 }
		 
		 return temp;
	    }
	 
	 
	 
	public static void main(String[] args) {
		LinkedListAdd obj= new LinkedListAdd();;
		
		ListNode l1= new ListNode(7);
		
		l1.next=new ListNode(2);
		l1.next.next=new ListNode(4);
		l1.next.next.next=new ListNode(3);
		
		
ListNode l2= new ListNode(5);
		
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);
		
		
		System.out.println(obj.addTwoNumbers(l1, l2).toString());
	}

}
