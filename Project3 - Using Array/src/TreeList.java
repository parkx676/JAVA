import java.util.ArrayList;

public class TreeList<E extends Comparable<E>> implements ListInterface<E> {
	private int size = 0;
	private int index = -1;
	
	@SuppressWarnings("unchecked")
	private Object[] elementData = (E[]) new Comparable[size];

	@Override
	public boolean isEmpty() {
		boolean check = false;
		if (size() == 0) {
			check = true;
		}
		return check;
	}

	@Override
	public int size() {
		return size;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean add(E element) {
		boolean check = true;
		if (element == null) {
			check = false;
		}
		else{
			if (size == 0) {
				size++;
				index++;
				elementData = (E[]) new Comparable[size];
				elementData[index] = element;
			}
			else {
				boolean done = false;
				while (!done) {
					if (((Comparable<E>) elementData[index]).compareTo(element) <= 0) {
						index = 2 * index + 2;
						if (elementData.length > index) {
							if (elementData[index] == null) {
								elementData[index] = element;
								size++;
								index = 0;
								done = true;
							}
						}
						else {
							Object[] temp_elementData = elementData;
							elementData = (E[]) new Comparable[index + 1];
							System.arraycopy(temp_elementData, 0, elementData, 0, temp_elementData.length);
							if (elementData[index] == null) {
								elementData[index] = element;
								size++;
								index = 0;
								done = true;
							}
						}
					}
					else if (((Comparable<E>) elementData[index]).compareTo(element) > 0) {
						index = 2 * index + 1;
						if (elementData.length > index) {
							if (elementData[index] == null) {
								elementData[index] = element;
								size++;
								index = 0;
								done = true;
							}
						}
						else {
							Object[] temp_elementData = elementData;
							elementData = (E[]) new Comparable[index + 1];
							System.arraycopy(temp_elementData, 0, elementData, 0, temp_elementData.length);
							if (elementData[index] == null) {
								elementData[index] = element;
								size++;
								index = 0;
								done = true;
							}
						}
					}
				} // While loop
			} // else
		} // else
		return check;
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public boolean add(E element, int index) {
//		boolean check = false;
//		if (index > size || index < 0 || element == null) {
//			check = false;
//		}
//		else {
//			E[] temp_elementData = elementData; // saving previous array into temporary array.
//			size++; // Increment Size
//			elementData = (E[]) new Object[size]; // Making new array with incremented size by one.
//			for (int i = 0; i < size; i++) {
//				elementData[i] = temp_elementData[i]; // Copying previous values back to new array.
//			}
//			for (int i = size - 1; i >= index; i--) {
//				elementData[i+1] = elementData[i]; // pushing values by one position each
//			}
//			elementData[index] = element; // adding new element in desired position in new Array.
//		}
//		return check;
//	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		size = 0;
		elementData = (E[]) new Comparable[size()];
	} // clear Array by making new array with 0 size.

	@SuppressWarnings("unchecked")
	@Override
	public boolean contains(Object o) {
		boolean check = false;
		for (int i = 0; i < elementData.length; i++) {
			if (elementData[i] != null && ((Comparable<E>) elementData[i]).compareTo((E) o) == 0) {
				check = true;
				break; // If list contains o, immediately breaks out from for loop.
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

//	@SuppressWarnings("unchecked")
//	@Override
//	public E get(int index) {
//		E item = null;
//		if (index > size() - 1) {
//			throw(new IndexOutOfBoundsException("Out of Range."));
//		}
//		else {
//			E smallest = (E) elementData[0];
//			E target = (E) elementData[0];
//			for (int i = 0; i < elementData.length; i++) {
//				if (elementData[i] != null && ((Comparable<E>) elementData[i]).compareTo(smallest) < 0) {
//					smallest = (E) elementData[i];
//				}
//			} // finding smallest element;
//			
//			if (index == 0){
//				item = smallest;
//			}
//			else {
//				for (int j = 0; j < index; j++) {
//					for (int i = 0; i < elementData.length; i++) {
//						System.out.println(smallest.toString() + target);
//						if (elementData[i] != null && ((Comparable<E>) elementData[i]).compareTo(smallest) > 0 && ((Comparable<E>) elementData[i]).compareTo(target) < 0) {
//							target = (E) elementData[i];
//						}
//					}
//					smallest = target;
//					target = (E) elementData[0];
//				}
//				item = smallest;
//			}
//		}
//		return item;
//	}
	

	@Override
	public E get(int index) {
		E item = null;
		ArrayList<E> arrayList = new ArrayList<E>();
		if (index > size() - 1) {
			throw(new IndexOutOfBoundsException("Out of Range."));
		}
		else {
			inorder(elementData, 0, arrayList);
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
		if (index > elementData.length || index < 0) {
			throw(new IndexOutOfBoundsException("Out of Range."));
		}
		else {
			if (index == 0 && elementData[2 * index + 1] == null) { // 1) 제거할 값이 root 일경우. && 왼쪽 branch가없을경우.
				elementData[index] = elementData[2 * index + 2];
				if (elementData[2*(2*index+2)+1] != null) { // 오른쪽 트리의 왼쪽 가지가 null이 아닐때
					index = 2*(2*index+2)+1;
					while (elementData[index] != null) {
						elementData[(index-3)/2] = elementData[index];
						index = 2 * index + 1;
					}
				}

			}
		}
		return item;
	}

	public E set(int index, E element) {
		E item = null;
		if (index > size-1) {
			throw(new IndexOutOfBoundsException("Out of Range."));
		}
		else {
			item = get(index);
			int realindex = 0;
			for (int i = 0; i < size(); i++) {
				if (elementData[i].equals(item)) {
					realindex = i;
					break;
				}
			}
			elementData[realindex] = element;
		}
		return item;
	}

	@Override
	public Object[] toArray() {
//		Object[] array = new Object[size()];
//		for (int i = 0, j = 0; i < elementData.length; i++){
//			if (elementData[i] != null) {
//				array[j] = elementData[i];
//				j++;
//			}
//		}
//		Arrays.sort(array);
		
		Object[] array = new Object[elementData.length];
		for (int i = 0; i < elementData.length; i++) {
			array[i] = elementData[i];
		}
		
//		ArrayList<E> arrayList = new ArrayList<E>();
//		Object[] array = new Object[size()];
//		
//		inorder(elementData, 0, arrayList);
//		for (int i = 0; i < arrayList.size(); i++) {
//			array[i] = arrayList.get(i);
//		}

		return array;
	}
	
	
	@SuppressWarnings("unchecked")
	public void inorder(Object[] elementData, int idx, ArrayList<E> arrayList){
		if (idx >= elementData.length || elementData[idx] == null) {
			return;
		}
		inorder(elementData, 2 * idx + 1, arrayList);
		arrayList.add((E) elementData[idx]);
		inorder(elementData, 2 * idx + 2, arrayList);
	}
}
