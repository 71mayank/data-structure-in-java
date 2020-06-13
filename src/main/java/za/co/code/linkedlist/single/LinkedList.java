package za.co.code.linkedlist.single;

/* Structure of a Single Linked List  */

public class LinkedList {

    /* LinkedList has an initial Node called as head */

    Node head; // Head of LinkedList

    /* Linked list node */
    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data; // Put the data in the data part
            next= null;       // Next node of an initial linked list always points to null
                              // i.e there's nothing connected, no next element in the linked list
        }
    }

    public static void main(String[] args) {
        // Putting some data in the linked list
        LinkedList linkedList = new LinkedList();
        linkedList.createDefaultSingleListForTest();
    }

    protected void createDefaultSingleListForTest(){
        LinkedList linkedList = new LinkedList();
        for(int i =6;i>0;--i) {
            linkedList.push(i);
        }
        linkedList.printLinkedList();
        linkedList.printMiddleOfLinkedList();
    }

    private void push(int data) {
        // New Node that will be added to the head
        Node newNode = new Node(data);
        // Since we intent to add the newly created node before the head
        // so the new node's next which is currently null should be linked to the head
        newNode.next = head;
        // and since head is always the first node
        // so we will be referencing head to the new node after linking
        head = newNode;
    }

    private void printLinkedList(){
        Node theNode = head;
        while(theNode!=null){
            System.out.print(theNode.data+"->");
            // Move the pointer to next
            theNode = theNode.next;
        }
    }

    protected void printMiddleOfLinkedList(){
        Node slow = head;
        Node fast = head;
        if(head!=null) {
            while (fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("The Middle Element is ["+slow.data+"]");
        }
    }

}
