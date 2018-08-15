import java.util.HashMap;
public class LLIntersection 
{
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        HashMap<Integer,ListNode> map = new HashMap<Integer,ListNode>();
        while(headA != null)
        {
            map.put(headA.val,headA);
            headA = headA.next;
        }
        while(headB != null)
        {
            if(map.containsKey(headB.val))
            {
                return(headB);
            }
            headB = headB.next;
        }
        return(null);
    }
	public static void main(String args[])
	{
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(10);
		ListNode l2 = l1.next;
		LLIntersection obj = new LLIntersection();
		ListNode l3 = obj.getIntersectionNode(l1, l2); //gets the intersecting node from the method.
		System.out.println(l3.val);
	}
}
