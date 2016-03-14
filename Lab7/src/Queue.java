
public class Queue<E> {
	
	private Node<E> head;
	private int size;
	
	//This adds the element to the end of the Queue

	public boolean push(E element){
		Node<E> temp = head;
		if (temp == null) {
			head = new Node<E>(element, null);
			size++;
		}
		else {
			while (temp.getNext() != null){
				temp = temp.getNext();
			}
			temp.setNext(new Node<E>(element,null));
			size ++;
		}
		return true;
	}
	
	//This returns the element in the head of the Node and changes the head to its first child
	//This throws an EmptyQueueException if empty
	public E pop(){
		if (size == 0) {
			throw new EmptyQueueException();
		}
		E item = head.getData();
		head = head.getNext();
		size--;
		return item;
	}
	
	//This returns the size of the Queue
	public int size(){
		return size;
	}
	
	//This returns true if the Queue is empty
	public boolean isEmpty(){
		return (size() == 0);
	}

	//This returns true if the two queues have the same elements in the same order
	public boolean equals(Queue<E> other){
		Node<E> temp = head;
		Node<E> otherTemp = other.head;
		boolean equal = true;
		if (size() != other.size()) {
			equal = false;
		}
		else {
			while(temp != null){
				if (temp.getData() != otherTemp.getData()) {
					equal = false;
				}
				temp = temp.getNext();
				otherTemp = otherTemp.getNext();
			}
		}
		return equal;
	}
}
