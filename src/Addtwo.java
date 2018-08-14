
public class Addtwo {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum, carry = 0;
		ListNode l3 = new ListNode(0); // Pointer to linked list. Dummy node.
		ListNode curr = l3; // Reference copy to be used inside loop.
		while (l1 != null | l2 != null) {
			int total = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry; // Carry from previous digit's
																						// place added to total.
			sum = 0; // re-initialise sum for each iteration.
			carry = 0; // make carry 0 once it is added at that digit's place(in 1st line of loop).
						// so that it does not get added to next digit's place.
			if (total >= 10) {
				sum = sum + (total % 10);
				carry = total / 10;
			} else {
				sum = total;
			}
			curr.next = new ListNode(sum); // create new node with sum value.
			l1 = l1 != null ? l1.next : null; // ternary operator conditions to avoid null pointer exception.
			l2 = l2 != null ? l2.next : null;
			curr = curr.next;
		}
		if (carry != 0)
			curr.next = new ListNode(carry);
		return (l3.next); // Next node from dummy node will be the linked list.
	}

}
