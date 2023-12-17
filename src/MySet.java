import java.util.HashMap; //import class
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet<E> implements Set<E> {
    private HashMap<E,Object> map;
    public MySet(){
        this.map = new HashMap<>();
    }

    @Override
    public String toString() {
        return map.keySet().toString();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override //unmentioned method (default value)
    public Iterator<E> iterator() {
        return null;
    }


    @Override //unmentioned method (default value)
    public Object[] toArray() {
        return new Object[0];
    }

    @Override //unmentioned method (default value)
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        boolean changed = !this.contains(e);
        map.put(e,null);
        return changed; //true if this set did not already contain the specified element
    }

    @Override
    public boolean remove(Object o) {
        boolean changed = this.contains(o);
        map.remove(o);
        return changed;//true if this set contained the specified element
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for(Object element : c){
            if(!this.contains(element)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean changed = false;
        for(E element : c){
            if(this.add(element)){
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean changed = false;
        HashMap<E,Object> newMap = new HashMap<>();
        for(Object element : c){
            if(this.contains(element)){
                newMap.put((E)element,null);
                changed = true;
            }
        }
         map = newMap;
        return changed;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean changed = false;
        for(Object element : c){
            if(this.remove(element)){
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public void clear() {
        map.clear();
    }

}
