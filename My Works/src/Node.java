

public class Node<E> {
	
	private E data;
	private Node<E> next;
    
    public Node (E element, Node<E> nextNode) {
        data = element;
        next = nextNode;
    } // Node Constructor
    
    public E getData() {
        return data;
    }

    public void setData(E element) {
        data = element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> nextNode) {
        next = nextNode;
    }
 

    @SuppressWarnings("unused")
	public Node<E> nextToLastNode(Node<E> firstNode) {
    	Node<E> answer = null;
    	Node<E> temp = firstNode;
    	int count = 0;
    	for (int i = 0;;i++) {
    		if (temp == null) {
    			break;
    		}
    		else {
    			temp = temp.getNext();
    			count++;
    		}
    	}
    	if (count > 1 ) {
    		answer = firstNode;
    		for (int i = 0; i < count - 2; i++) {
    			answer = answer.getNext();
    		}
    	}
    return answer;
    }

	public static void main(String[] args) {
		Node<String> n1 = new Node<String>("A", new Node<String>("B", new Node<String>("C", new Node<String>("D", new Node<String>("E", null)))));
		System.out.println(n1.nextToLastNode(n1).getData()); // Should return "D"
	}
}
