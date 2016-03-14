

public class ExtendedList<E extends Comparable<E>> implements ListInterface<E> {
	

	private int sort = 0;
	private boolean duplicates = true;
	
	private int size = 0;
	@SuppressWarnings("unchecked")
	private Object[] elementData = (E[]) new Comparable[size];
	
	
	public ExtendedList(int sort, boolean duplicates){
		this.sort = sort;
		this.duplicates = duplicates;
	}
	
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
	
	@SuppressWarnings({ "unchecked" })
	public boolean add(E element)  {
		boolean check = true;
		boolean duplicateCheck = false;
		
		if (element == null) {
			check = false;
		}
		else{
			// Duplicate checking loop
			// If duplicates variable is true, it will not go through this checking loop.
			// It will return duplicateCheck true if there is same element in the array.
			// Else, it will go through loop without modifying any variables.
			if (duplicates == false) {
				for (int i = 0; i < size; i++) {
					if (((Comparable<E>) elementData[i]).compareTo(element) == 0) {
						check = false;
						duplicateCheck = true;
						break;
					}
				}
			}
			// If duplicates variable is true, then it will just go through and pass this if statement and add new element.
			// Else if duplicates variable is false, then it will go through this if statement if checking loop said duplicateCheck is false.
			if (duplicateCheck == false) {
				if (sort > 0 && size() > 0) {
					Object[] temp_elementData = elementData; // copying old array
					size++;
					elementData = (E[]) new Comparable[size]; // making new array
					int count = 0;
					for (int i = 0; i < size - 1; i++) {
						if (((Comparable<E>) temp_elementData[i]).compareTo(element) > 0) {
							break;
						}
						else {
							count++;
						}
					}
					for (int i = 0; i < temp_elementData.length; i++) {
						elementData[i] = temp_elementData[i]; // Copying previous values back to new array.
					}
					for (int i = size - 2; i >= count; i--) {
						elementData[i+1] = elementData[i]; // pushing values by one position each
					}
					elementData[count] = element; // adding new element in desired position in new Array.
				}
				else if (sort < 0 && size() > 0) {
					System.out.println("Go Through? descending");
					Object[] temp_elementData = elementData; // copying old array
					size++;
					elementData = (E[]) new Comparable[size]; // making new array
					int count = 0;
					for (int i = 0; i < size - 1; i++) {
						if (((Comparable<E>) temp_elementData[i]).compareTo(element) < 0) {
							break;
						}
						else {
							count++;
						}
					}
					for (int i = 0; i < temp_elementData.length; i++) {
						elementData[i] = temp_elementData[i]; // Copying previous values back to new array.
					}
					for (int i = size - 2; i >= count; i--) {
						elementData[i+1] = elementData[i]; // pushing values by one position each
					}
					elementData[count] = element; // adding new element in desired position in new Array.
				}
				else {
					Object[] temp_elementData = elementData; // copying old array
					size++;
					elementData = (E[]) new Comparable[size]; // making new array
					int k = 0;
					while (k < temp_elementData.length) {
						for (int j = 0; j < temp_elementData.length; j++) {
							elementData[k] = temp_elementData[j];
							k++;
						}
					} //copying old array values into new array
					elementData[size-1] = element; // Adding new element into array.
				}
			}
		}
		return check;
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public boolean add(E element, int index) {
//		
//		boolean check = false;
//		boolean duplicateCheck = false;
//		
//		if (index > size || index < 0 || element == null) {
//			check = false;
//		}
//		else {
//			// Duplicate checking loop
//			// If duplicates variable is true, it will not go through this checking loop.
//			// It will return duplicateCheck true if there is same element in the array.
//			// Else, it will go through loop without modifying any variables.
//			if (duplicates == false) {
//				System.out.println("duplicates Checking.." + "current size is " + size);
//				for (int i = 0; i < size; i++) {
//					System.out.println("for loop checking..");
//					System.out.println(elementData[i]);
//					System.out.println(element);
//					if (elementData[i].equals(element)) {
//						System.out.println("Go through this?");
//						check = false;
//						duplicateCheck = true;
//						break;
//					}
//				}
//			}
//			// If duplicates variable is true, then it will just go through and pass this if statement and add new element.
//			// Else if duplicates variable is false, then it will go through this if statement if checking loop said duplicateCheck is false.
//			if (duplicateCheck == false) {
//				Object[] temp_elementData = elementData; // saving previous array into temporary array.
//				size++; // Increment Size
//				elementData = (E[]) new Object[size]; // Making new array with incremented size by one.
//				for (int i = 0; i < size; i++) {
//					elementData[i] = temp_elementData[i]; // Copying previous values back to new array.
//				}
//				for (int i = size - 1; i >= index; i--) {
//					elementData[i+1] = elementData[i]; // pushing values by one position each
//				}
//				elementData[index] = element; // adding new element in desired position in new Array.
//				
//				// Checking sort variable and sort by sort variable value.
//				if (sort > 0 && size() > 1) {
//					Arrays.sort(elementData);
//				}
//				else if (sort < 0 && size() > 1) {
//					Arrays.sort(elementData, Collections.reverseOrder());
//				}
//			}
//		}
//		return check;
//	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		size = 0;
		elementData = (E[]) new Comparable[size];
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

	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		E item = null;
		if (index > size-1) {
			throw(new IndexOutOfBoundsException("Out of Range."));
		}
		else {
			item = (E) elementData[index];
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
			item = (E) elementData[index];
			for (int i = index + 1; i < size; i++) {
				elementData[i-1] = elementData[i]; // pushing values by one position each
			}
			Object[] temp_elementData = elementData; // saving previous array into temporary array.
			size--; // Decrement Size
			elementData = (E[]) new Comparable[size]; // Making new array with decremented size by one.
			for (int i = 0; i < size; i++) {
				elementData[i] = temp_elementData[i]; // Copying previous values back to new array except the last value;
			}
		}
		return item;
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public E set(int index, E element) {
//		E item = null;
//		if (index > size-1) {
//			throw(new IndexOutOfBoundsException("Out of Range."));
//		}
//		else {
//			item = (E) elementData[index];
//			elementData[index] = element;
//		}
//		return item;
//	}

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
