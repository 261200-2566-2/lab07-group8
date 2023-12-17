import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashSet extends AbstractSet<Object> implements Set<Object> {

    final private HashMap<Object, Object> map;

    public HashSet() {
        this.map = new HashMap<>();
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

    @Override
    public boolean add(Object o) {
        if (map.containsKey(o)) {
            return false;
        } else {
            map.put(o, null);
            return true;
        }
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) != null;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Iterator<Object> iterator() {
        return map.keySet().iterator();
    }

}