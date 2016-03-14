
public class LinkedList<E> {
	
	private Node<E> headNode;
	private int size = 0;
	
	//This returns the size of the list
	public int size() {
		return size;
	}
	
	//This returns true if the List is empty
	public boolean isEmpty(){
		boolean check = false;
		if (size == 0) {
			check = true;
		}
		return check;
	}

	//Adds to the end of the list
	public boolean add(E element){
		boolean check = true;
		Node<E> temp = headNode;
		if (element == null) {
			check = false;
		}
		else {
			if (temp == null) {
				headNode = new Node<E>(element, null);
			}
			else {
				while (temp.getNext() != null) {
					temp = temp.getNext();
				}
				temp.setNext(new Node<E>(element, null));	
			}
			size++;
		}
		return check;
	}
	
	//Adds to the index in index
	//Throws an IndexOutOfBoundsException if the index is out of bounds
	public boolean add(E element, int index){
		boolean check = true;
		Node<E> temp = headNode;
		
		if (element == null) {
			check = false;
		}
		else if (index > size || index < 0) {
			throw(new IndexOutOfBoundsException("Out of Range."));
		}
		else {
			Node<E> newNode = new Node<E>(element, null);
			if (index == 0) {
				newNode.setNext(temp);
				headNode = newNode;
			}
			else {
				while(index > 1){
					index--;
					temp = temp.getNext();
				}
				newNode.setNext(temp.getNext());
				temp.setNext(newNode);
			}
			size++;
		}
		
		return check;
	}
	
	public E remove(int index){
		E value = null;
		if(index == 0){
			value = headNode.getData();
			headNode = headNode.getNext();
			size--;
		}
		else {
			Node<E> temp = headNode;
			for (int i = 0; i < index-1; i++) {
				temp = temp.getNext();
			}
			value = temp.getNext().getData();
			temp.setNext(temp.getNext().getNext());
			size--;
		}
		return value;
	}
	
	//This returns the element in index E
	public E get(int index){
		Node<E> temp = headNode;
		while(index > 0){
			index--;
			temp = temp.getNext();
		}
		return temp.getData();
	}
	
	//This returns true if the two lists have the same elements in the same order
	public boolean equals(LinkedList<E> other){
		boolean check = true;
		if (size() != other.size()) {
			check = false;
		}
		else{
			for (int i = 0; i < size; i++) {
				if (!get(i).equals(other.get(i))) {
					check = false;
					break;
				}
			}
		}
		return check;
	}
}
