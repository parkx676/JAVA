

public class ArrayList<E> implements ListInterface<E> {
	private int size = 0;
	@SuppressWarnings("unchecked")
	private E[] elementData = (E[]) new Object[size];

	@Override
	public boolean isEmpty() {
		boolean check = false;
		if (size == 0) {
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
			E[] temp_elementData = elementData; // copying old array
			size++;
			elementData = (E[]) new Object[size]; // making new array
			int k = 0;
			while (k < temp_elementData.length) {
				for (int j = 0; j < temp_elementData.length; j++) {
					elementData[k] = temp_elementData[j];
					k++;
				}
			} //copying old array values into new array
			elementData[size-1] = element;
		}
		return check;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(E element, int index) {
		boolean check = false;
		if (index > size || index < 0 || element == null) {
			check = false;
		}
		else {
			E[] temp_elementData = elementData; // saving previous array into temporary array.
			size++; // Increment Size
			elementData = (E[]) new Object[size]; // Making new array with incremented size by one.
			for (int i = 0; i < size; i++) {
				elementData[i] = temp_elementData[i]; // Copying previous values back to new array.
			}
			for (int i = size - 1; i >= index; i--) {
				elementData[i+1] = elementData[i]; // pushing values by one position each
			}
			elementData[index] = element; // adding new element in desired position in new Array.
		}
		return check;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		size = 0;
		elementData = (E[]) new Object[size];
	} // clear Array by making new array with 0 size.

	@Override
	public boolean contains(Object o) {
		boolean check = false;
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(o)) {
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
			item = elementData[index];
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
			for (int i = 0; i < size; i++) {
				if (elementData[i].equals(o)) {
					index = i;
					break;
				}
			}
		}
		return index;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E remove(int index) {
		E item = null;
		if (index > size || index < 0) {
			throw(new IndexOutOfBoundsException("Out of Range."));
		}
		else {
			item = elementData[index];
			for (int i = index + 1; i < size; i++) {
				elementData[i-1] = elementData[i]; // pushing values by one position each
			}
			E[] temp_elementData = elementData; // saving previous array into temporary array.
			size--; // Decrement Size
			elementData = (E[]) new Object[size]; // Making new array with decremented size by one.
			for (int i = 0; i < size; i++) {
				elementData[i] = temp_elementData[i]; // Copying previous values back to new array except the last value;
			}
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
			item = elementData[index];
			elementData[index] = element;
		}
		return item;
	}

	@Override
	public Object[] toArray() {
		int size = size();
		Object[] array = new Object[size];
		for (int i = 0; i < size; i++) {
			array[i] = elementData[i];
		}
		return array;
	}

}
