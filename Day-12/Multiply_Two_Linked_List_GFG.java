//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
/*Node is defined as
class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class Solution {
    
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long MOD = 1000000007;
        
        if(first==null && second == null)
            return 0;
            
        
        Node p1 = first;
        Node p2 = second;
        
        long n1 = 0;
        long n2 = 0;
        
        while(p1!=null){
            n1 = (n1*10 + p1.data)%MOD;
            p1 = p1.next;
        }
        
        while(p2!=null){
            n2 = (n2*10 + p2.data)%MOD;
            p2 = p2.next;
        }
        
        return (n1*n2)%MOD;
        
        
    }
}

//{ Driver Code Starts.

public class GFG {
    public static Node newNode(int data) { return new Node(data); }

    public static void push(Node[] head_ref, int new_data) {
        Node new_Node = newNode(new_data);
        new_Node.next = head_ref[0];
        head_ref[0] = new_Node;
    }

    public static void reverse(Node[] r) {
        Node prev = null;
        Node cur = r[0];
        Node nxt;
        while (cur != null) {
            nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        r[0] = prev;
    }

    public static void freeList(Node Node) {
        Node temp;
        while (Node != null) {
            temp = Node;
            Node = Node.next;
            // In Java, garbage collection takes care of freeing memory.
        }
    }

    public static void printList(Node Node) {
        while (Node != null) {
            System.out.print(Node.data + " ");
            Node = Node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            Node[] first = new Node[1];
            Node[] second = new Node[1];
            first[0] = null;
            second[0] = null;

            String input = sc.nextLine();
            String[] arr = input.split(" ");
            for (String s : arr) {
                push(first, Integer.parseInt(s));
            }

            String input2 = sc.nextLine();
            String[] brr = input2.split(" ");
            for (String s : brr) {
                push(second, Integer.parseInt(s));
            }

            reverse(first);
            reverse(second);

            Solution ob = new Solution();
            long res = ob.multiplyTwoLists(first[0], second[0]);
            System.out.println(res);

            // Free list is not necessary in Java
        }

        sc.close();
    }
}

// } Driver Code Ends
