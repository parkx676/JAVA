
public class Stack<E> {

	public Node<E> top;
	private int size;
	
	//This returns the element in the top Node and changes the top Node to its first child
	//This throws an EmptyStackException if empty
	public E pop(){
		if (size == 0) {
			throw new EmptyStackException();
		}
		E item = null;
		if (size == 1) {
			item = top.getData();
			top = null;
		}
		else {
			Node<E> temp = top;
			for (int i = 0; i < size()-2; i++) {
				temp = temp.getNext();
			}
			item = temp.getNext().getData();
			temp.setNext(null);
		}
		size--;
		return item;
	}
	
	//This adds the next element to the top of the stack and returns true
	public boolean push(E next){
		Node<E> temp = top;
		if (temp == null) {
			top = new Node<E>(next, null);
			size++;
		}
		else {
			while (temp.getNext() != null){
				temp = temp.getNext();
			}
			temp.setNext(new Node<E>(next,null));
			size ++;
		}
		return true;
	}
	
	//This returns the size of the Stack
	public int size(){
		return size;
	}
	
	//This returns true if the Stack is empty
	public boolean isEmpty(){
		return (size() == 0);
	}
	
	//This returns true if the two stacks have the same elements in the same order
	public boolean equals(Stack<E> other){
		Node<E> temp = top;
		Node<E> otherTemp = other.top;
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
