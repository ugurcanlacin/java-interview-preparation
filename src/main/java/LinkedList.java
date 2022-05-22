class LinkedList {
    Node head; // head of the list

    /* Linked list Node*/
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) { data = d; }
    }

    public void add(int data){
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (this.head == null) {
            this.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node head = this.head;
            while (head.next != null) {
                head = head.next;
            }

            // Insert the new_node at last node
            head.next = new_node;
        }
    }

    // Method to print the LinkedList.
    public void printList()
    {
        Node currNode = this.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
}