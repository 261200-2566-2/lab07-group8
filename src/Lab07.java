public class Lab07 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println("Set size: " + set.size());
        System.out.println("Set is empty: " + set.isEmpty());

        System.out.println("Set contains 'orange': " + set.contains(3));

        set.remove(2);
        System.out.println("Set contains 'banana' after removal: " + set.contains(2));

        System.out.println("Set contents: " + set);

        set.remove(1);
        set.remove(3);
        System.out.println("Set is empty: " + set.isEmpty());

    }
}
