//Definition for singly-linked list.
public class Splice 
{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        ListNode l3 = new ListNode(0);
        ListNode temp = l3;
        while(l1!=null && l2!=null)
        {
            if(l1.val <= l2.val)
            {
                temp.next= new ListNode(l1.val);
                l1 = (l1.next==null)? null : l1.next;
            }
            else
            {
                temp.next = new ListNode(l2.val);
                l2 = (l2.next==null)? null : l2.next;
            }
            temp = temp.next;
        }
        while(l1 != null)
        {
           temp.next = new ListNode(l1.val);
           l1 = l1.next;
           temp = temp.next;
        }
        while(l2 != null)
        {
           temp.next = new ListNode(l2.val);
           l2 = l2.next;
           temp = temp.next;
        }
        return(l3.next);
    }

public static void main(String args[])
{
	ListNode l1 = new ListNode(1);
	l1.next = new ListNode(2);
	l1.next.next= new ListNode(3);
	ListNode l2 = new ListNode(4);
	l2.next = new ListNode(5);
	l2.next.next = new ListNode(6);
	Splice s = new Splice();
	ListNode l3 = s.mergeTwoLists(l1,l2);
	while(l3 != null)				// Printing the merged list.
	{
		System.out.print(l3.val + "->");
		l3 = l3.next;
	}
}
}