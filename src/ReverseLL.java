import java.util.ArrayList;
public class ReverseLL
{
	public ListNode reverseList(ListNode head)
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
		for(int i = len-1 ;i>=0;i--)
		{
			l1.next = new ListNode(lst.get(i));
            l1 = l1.next;
		}
        l1.next = null;
		return(temp.next);        
    }
	public static void main(String args[])
	{
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(6);
		ReverseLL obj = new ReverseLL();
		ListNode r_list = obj.reverseList(l1);
		while(r_list != null)
		{
			System.out.print(r_list.val + "->");
			r_list = r_list.next;
		}
	}
}
