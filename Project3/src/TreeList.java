import java.util.ArrayList;

public class TreeList<E extends Comparable<E>> implements ListInterface<E> {
	
	public BTNode root;
    public int depth = -1;
    private int size = 0;

    class BTNode {
        private E data;
        private BTNode left;
        private BTNode right;
        
        public BTNode(E data, BTNode left, BTNode right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		public E getData() {
			return data;
		}
		
		public BTNode getLeft() {
			return left;
		}
		
		public BTNode getRight() {
			return right;
		}
		
		public void setData(E data) {
			this.data = data;
		}
		
		public void setLeft(BTNode left) {
			this.left = left;
		}
		
		public void setRight(BTNode right) {
			this.right = right;
		}
    } // BTNode class
    
	@Override
	public boolean isEmpty() {
		boolean answer = false;
		if (depth == -1) {
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
			BTNode newBTNode = new BTNode(element, null, null); // Make a new BTNode
			if (depth == -1) { // When depth equals 0.
				root = newBTNode;
				depth = 0;
			}
			else {
				BTNode ptr = root;
				BTNode parent = root;
				int checker = 0; //0 = left, 1 = right
				while (ptr != null){
					if (ptr.getData().compareTo(element) > 0) { // element가 root의 데이터 보다 작을때.
						ptr = ptr.getLeft();
						if(ptr != null){
							parent = parent.getLeft();
						}
						depth++;
						checker = 0;
					}
					else if (ptr.getData().compareTo(element) <= 0){ // element가 root의 데이터 보다 크거나 같을때.
						ptr = ptr.getRight();
						if(ptr != null){
							parent = parent.getRight();
						}
						depth++;
						checker = 1;
					}
				}
				if (checker == 0) {
					parent.setLeft(newBTNode);
				}
				else if (checker == 1) {
					parent.setRight(newBTNode);
				}
			}
			size++;
		}
		return check;
	}
	
//	@Override
//	public boolean add(E element, int index) {
//		boolean check = true;
//		if (index > size || index < 0 || element == null) {
//			check = false;
//		}
//		else {
//			need to do something.
//		}
//		return check;
//	}

	@Override
	public boolean add(E element) {
		boolean check = true;
		if (element == null) {
			check = false;
		}
		else{
			BTNode newBTNode = new BTNode(element, null, null); // Make a new BTNode
			if (depth == -1) { // When depth equals 0.
				root = newBTNode;
				depth = 0;
			}
			else {
				BTNode ptr = root;
				BTNode parent = root;
				int checker = 0; //0 = left, 1 = right
				while (ptr != null){
					if (ptr.getData().compareTo(element) > 0) { // element가 root의 데이터 보다 작을때.
						ptr = ptr.getLeft();
						if(ptr != null){
							parent = parent.getLeft();
						}
						depth++;
						checker = 0;
					}
					else if (ptr.getData().compareTo(element) <= 0){ // element가 root의 데이터 보다 크거나 같을때.
						ptr = ptr.getRight();
						if(ptr != null){
							parent = parent.getRight();
						}
						depth++;
						checker = 1;
					}
				}
				if (checker == 0) {
					parent.setLeft(newBTNode);
				}
				else if (checker == 1) {
					parent.setRight(newBTNode);
				}
			}
			size++;
		}
		return check;
	}

	@Override
	public void clear() {
		depth = -1;
		size = 0;
		root = null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean contains(Object o) {
		boolean check = false;
		for (int i = 0; i < size(); i++) {
			if (get(i).compareTo((E) o) == 0) {
				check = true;
				break;
			}
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
			for (int i = 0; i < size(); i++) {
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
		ArrayList<E> arrayList = new ArrayList<E>();
		if (index > size()) {
			throw(new IndexOutOfBoundsException("Out of Range."));
		}
		else {
			BTNode Node = root;
			inorder(Node, arrayList);
			item = arrayList.get(index);
		}
		return item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int indexOf(Object o) {
		int index = 0;
		if (contains(o) == false) {
			index = -1;
		}
		else {
			for (int i = 0; i < size(); i++) {
				if (get(i).compareTo((E) o) == 0){
					index = i;
					break;
				}
			}
		}
		return index;
	}

	@Override
	public E remove(int index) {
		E item = null;
		if (index > depth - 1) {
			throw(new IndexOutOfBoundsException("Out of Range."));
		}
		else {
			BTNode ptr = root;
			BTNode parent = root;
			E target = get(index);
			item = target;
			while (ptr != null && ptr.getData().compareTo(target) != 0){
				parent = ptr;
				if (ptr.getData().compareTo(target) > 0) {
					ptr = ptr.getLeft();
				}
				else {
					ptr = ptr.getRight();
				}
			}
			
			if (ptr == root && ptr.getLeft() == null) {
				root = root.getRight();
			}
			else if (ptr != root && ptr.getLeft() == null) {
				if (ptr == parent.getLeft()) {
					parent.setLeft(ptr.getRight());
				}
				else {
					parent.setRight(ptr.getRight());
				}
			}
			else {
				BTNode rightMostNode = ptr;
				while (rightMostNode.getRight() != null) {
					rightMostNode = rightMostNode.getRight();
				}
				ptr.setData(rightMostNode.getData());
				rightMostNode = null;
			}
			depth--;
			size--;
		}
		return item;
	}

	@Override
	public E set(int index, E element) {
		E item = null;
		if (index > size()-1) {
			throw(new IndexOutOfBoundsException("Out of Range."));
		}
		else {
			item = get(index);
			remove(index);
			add(element);
		}
		return item;
	}

	@Override
	public Object[] toArray() {
		Object[] array = new Object[size()];
		
		for (int i = 0; i < size(); i++) {
			array[i] = get(i);
		}
		return array;
	}
	
	public void inorder(BTNode Node, ArrayList<E> arrayList){
		if (Node == null) {
			return;
		}
		inorder(Node.getLeft(), arrayList);
		arrayList.add(Node.getData());
		inorder(Node.getRight(), arrayList);
	} //Helper method for get(int index) method. This will be operating the in-order traverse and add ascending sorted data into the arryList located in get method.
	
	public int countLeaves(BTNode tree) {
		if (tree == null) {
			return 0;
		}
		else if (tree.getLeft() == null && tree.getRight() == null) {
			return 1;
		}
		else {
			return countLeaves(tree.getLeft()) + countLeaves(tree.getRight());
		}
	}
}
