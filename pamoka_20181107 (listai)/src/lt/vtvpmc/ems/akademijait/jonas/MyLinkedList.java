package lt.vtvpmc.ems.akademijait.jonas;

public class MyLinkedList {
    private static int counter;
    private Node head;

    // Default constructor
    public MyLinkedList() {

    }

    // appends the specified element to the end of this list.
    public void add(Object data) {

        // Initialize Node only incase of 1st element
        if (head == null) {
            head = new Node(data);
        }

        Node listTemp = new Node(data);
        Node listCurrent = head;

        // Let's check for NPE before iterate over listCurrent
        if (listCurrent != null) {

            // starting at the head node, crawl to the end of the list and then add element after last node
            while (listCurrent.getNext() != null) {
                listCurrent = listCurrent.getNext();
            }

            // the last node's "next" reference set to our new node
            listCurrent.setNext(listTemp);
        }

        // increment the number of elements variable
        incrementCounter();
    }

    private static void incrementCounter() {
        counter++;
    }

    public Object get(int index)
    // returns the element at the specified position in this list.
    {
        // index must be 1 or higher
        if (index < 0)
            return null;
        Node listCurrent = null;
        if (head != null) {
            listCurrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (listCurrent.getNext() == null)
                    return null;

                listCurrent = listCurrent.getNext();
            }
            return listCurrent.getData();
        }
        return listCurrent;

    }


}
