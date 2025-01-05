package Company_1_Microsoft;
// https://www.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1
public class Delete_N_nodes_after_M_nodes_of_a_linked_list {
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static void linkdelete(Node head, int n, int m) {
        if (head == null || m < 0 || n < 0) {
            return;
        }
        Node current = head;
        while (current != null) {
            for (int i = 1; i < m && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                break;
            }
            Node temp = current.next;
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }
            current.next = temp;
            current = temp;
        }
    }
}
