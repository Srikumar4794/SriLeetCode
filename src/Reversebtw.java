import java.util.ArrayList;
public class Reversebtw
{
	public ListNode reverseBetween(ListNode head, int m, int n)
    {
       ArrayList<Integer> lst = new ArrayList<Integer>();
		while(head != null)
		{
			lst.add(head.val);
			head = head.next;
		}
		ListNode l1 = new ListNode(0);
		ListNode temp = l1;
		int len = lst.size();
        for(int i=0; i<m-1; i++)
		{
			l1.next = new ListNode(lst.get(i));
            l1 = l1.next;
		}
		for(int i = n-1 ;i>=m-1;i--)
		{
			l1.next = new ListNode(lst.get(i));
            l1 = l1.next;
		}
        for(int i = n ;i<len;i++)
		{
            l1.next = new ListNode(lst.get(i));
            if(l1.next!=null)
                l1 = l1.next;
		}
        //l1.next = null;
		return(temp.next); 
    }
	public static void main(String args[])
	{
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(6);
		l1.next.next.next = new ListNode(12);
		Reversebtw obj = new Reversebtw();
		ListNode r_list = obj.reverseBetween(l1,1,3);
		while(r_list != null)
		{
			System.out.print(r_list.val + "->");
			r_list = r_list.next;
		}
	}
}
