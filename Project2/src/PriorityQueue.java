

public class PriorityQueue<E> {
	
    private int size;
    private Node head;
    @SuppressWarnings("unused")
	private Node tail;
    

	private class Node {
        private E data;
        private int priority;
		private Node next;
        
        public Node(E element, int priority, Node nextNode) {
        	this.priority = priority;
            data = element;
            next = nextNode;
        } // Node Constructor
        
        public E getData() {
            return data;
        }

        @SuppressWarnings("unused")
		public void setData(E element) {
            data = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextNode) {
            next = nextNode;
        }
        
        public int getPriority() {
        	return priority;
        }
 
    } // End of Node class
	
	public PriorityQueue() { } // Constructor
	
	
	// High number priority is higher priority!!  1 : Lowest priority.
	public void addWithPriority(E element, int priority) {
		Node newNode = new Node(element, priority, null);
		if (size == 0) {
			head = newNode;
	        tail = head;
	    }
		else {
			if (head.getPriority() < priority) { // When newNode priority is higher than previous one.
				newNode.setNext(head);
				head = newNode;
			}
			else if (head.getPriority() >= priority) { // When newNode priority is lower than previous one.
				int count = 0;
				Node temp = head;
				// With this for loop, trying to find where should newNode to be inserted.
				for (int i = 0; i < size; i++) {
					if (temp.getPriority() < priority) {
						break;
					}
					else {
						temp = temp.getNext();
						count++;
					}
				}
				
				temp = head; // Reset temp Node as head Node.
				
				// With for loop, move temp Node to be the place where newNode should be.
				for (int i = 0; i < count-1; i++) {
					temp = temp.getNext();
				}
				// If newNode's priority is lowest
				if (count == size) {
					temp.setNext(newNode);
					tail = newNode;
				}
				// newNode's priority is middle of Queues.
				else{
					newNode.setNext(temp.getNext());
					temp.setNext(newNode);
				}
			}
	    }
	    size++;
	} // End of addWithPriority method.
	
	public E remove() {
		E item = head.getData();
		head = head.getNext();
		size--;
		return item;
	} // End of Remove method.
}
