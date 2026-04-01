package Problem3;

import java.util.ArrayList;

public class Collection<E> implements MyCollection<E> {
    private ArrayList<E> list = new ArrayList<>();

    public void add(E e) { 
    	list.add(e); 
    }

    public void remove(E e) { 
    	list.remove(e); 
    }

    public boolean contains(E e) { 
    	return list.contains(e); 
  	}

    public int size() { 
    	return list.size(); 
    }

    public boolean isEmpty() { 
    	return list.isEmpty(); 
    }

    public void clear() { 
    	list.clear(); 
    }
}