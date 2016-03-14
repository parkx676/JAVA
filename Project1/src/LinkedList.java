
public class LinkedList<E> implements ListInterface<E> {
	private Node head;
    private Node tail;
    private int size = 0;
    
    private class Node {
        public E data;
        public Node next;
        
        public Node(E input) {
            data = input;
            next = null;
        } // Node Constructor
        
        public String toString(){
            return String.valueOf(this.data);
        }
    } // Node class
    
	@Override
	public boolean isEmpty() {
		boolean answer = false;
		if (size == 0) {
			answer = true;
		}
		return answer;
	}

	@Override
	public int size() {
		return size;
	}


	@Override
	public boolean add(E element) {
		boolean check = true;
		if (element == null) {
			check = false;
		}
		else{
			Node newNode = new Node(element);
			if (size == 0) {
				head = newNode;
			}
			newNode.next = null;
			if (size > 0) {
				tail.next = newNode;
			}
			tail = newNode;
			size++;
		}
		return check;
	}
	
	@Override
	public boolean add(E element, int index) {
		boolean check = true;
		if (index > size || index < 0 || element == null) {
			check = false;
		}
		else {
			Node newNode = new Node(element);
			Node x = head;
			for (int i = 0; i < index; i++) {
				x = x.next;
			}
			if (index == 0) {
				newNode.next = head;
				head = newNode;
			} //the case when it added to be the first node
			else if (index == size) {
				newNode.next = null;
				tail.next = newNode;
				tail = newNode;
			} //the case when it added to be the last node
			else {
				newNode.next = x.next;
				x.next = newNode;
			} //the case when it added to be the node in anywhere except to be the first and the last node.
			size ++;
		}
		return check;
	}

	@Override
	public void clear() {
		size = 0;
		head = null;
		tail = null;
	}

	@Override
	public boolean contains(Object o) {
		boolean check = false;
		Node x = head;
		for (int i = 0; i < size; i++) {
			if (x.data.equals(o)) {
				check = true;
				break;
			}
			x = x.next;
		}
		return check;
	}

	@Override
	public boolean equals(ListInterface<E> otherList) {
		boolean check = true;
		if (size() != otherList.size()) {
			check = false;
		}
		else{
			for (int i = 0; i < size; i++) {
				if (!get(i).equals(otherList.get(i))) {
					check = false;
					break;
				}
			}
		}
		return check;
	}

	@Override
	public E get(int index) {
		E item = null;
		if (index > size-1) {
			throw(new IndexOutOfBoundsException("Out of Range."));
		}
		else {
			Node x = head;
			for (int i = 0; i < index; i++) {
				x = x.next;
			}
			item = x.data;
		}
		return item;
	}

	@Override
	public int indexOf(Object o) {
		int index = 0;
		if (contains(o) == false) {
			index = -1;
		}
		else {
			Node x = head;
			for (int i = 0; i < size; i++) {
				if (x.data.equals(o)) {
					break;
				}
				x = x.next;
				index++;
			}
		}
		return index;
	}

	@Override
	public E remove(int index) {
		E item = null;
		if (index > size-1) {
			throw(new IndexOutOfBoundsException("Out of Range."));
		}
		else {
			if (index == 0) {
				Node x = head;
				for (int i = 0; i < index; i++) {
					x = x.next;
				}
				item = x.data;
				head = x.next;
			} //the case when removing the first node.
			else if (index == size-1) {
				Node x = head;
				for (int i = 0; i < index-1; i++) {
					x = x.next;
				}
				item = x.next.data;
				x.next = null;
				tail = x;
			} //the case when removing the last node.
			else {
				Node x = head;
				for (int i = 0; i < index-1; i++) {
					x = x.next;
				}
				x.next = x.next.next;
			} //the case when removing the node in anywhere except to be the first and the last node.
			size--; // decrements the size by one.
		}
		return item;
	}

	@Override
	public E set(int index, E element) {
		E item = null;
		if (index > size-1) {
			throw(new IndexOutOfBoundsException("Out of Range."));
		}
		else {
			Node x = head;
			for (int i = 0; i < index; i++) {
				x = x.next;
			}
			item = x.data; // save previous element value and return this.
			x.data = element; // modify data with new element value.
		}
		return item;
	}

	@Override
	public Object[] toArray() {
		int size = size();
		Object[] array = new Object[size];
		Node x = head;
		for (int i = 0; i < size; i++) {
			array[i] = x.data;
			x = x.next;
		}
		return array;
	}

}
