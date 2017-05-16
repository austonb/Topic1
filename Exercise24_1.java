package chapter24;

public abstract class Exercise24_1<E> implements MyList<E> {
	protected int size = 0; // The size of the list

    /**
     * Create a default list
     */
    protected Exercise24_1() {
    }

    /**
     * Create a list from an array of objects
     */
    protected Exercise24_1(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    
    /** Add a new element at the end of this list */
    public void add(E e) {
        add(e);
    }

    
   
    public boolean isEmpty() {
        return size == 0;
    }

    
    /** Return the number of elements in this list */
    public int size() {
        return size;
    }

    
  
    public boolean remove(E e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        } else
            return false;
    }

    private E indexOf(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    /** Retains the elements in this list that are also in otherList
    Returns true if this list changed as a result of the call */
    public boolean retainAll(MyList<E> otherList) {
        int lastSize = size;

        this.forEach(item -> {
            if (!otherList.contains(item)) {
                remove(item);
            }
        });
        return lastSize != size;
    }

    @Override
    /** Removes all the elements in otherList from this list
     * Returns true if this list changed as a result of the call */
    public boolean removeAll(MyList<E> otherList) {
        int lastSize = size;
        otherList.forEach(this::remove);
        return lastSize != size;
    }

    @Override
    /** Adds the elements in otherList to this list.
     * Returns true if this list changed as a result of the call */
    public boolean addAll(MyList<E> otherList) {
        int lastSize = size;
        otherList.forEach(this::add);
        return lastSize != size;
}
}
