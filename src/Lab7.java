import java.util.HashSet; //just only test

public class Lab7 {
    public static void main(String[] args) {
        MySet<Integer> set1 = new MySet<>(); //implement Set using HashMap
        HashSet<Integer> set2 = new HashSet<>(); //for test
        System.out.println("set1 >> "+set1);
        System.out.println("set2 >> "+set2);
        System.out.println(" ");
        System.out.println("Is set1 empty? : "+ set1.isEmpty());
        System.out.println("Add 1 to set1 : "+ set1.add(1));
        System.out.println("Add 1 to set1 : "+ set1.add(1) + " (duplicate)");
        System.out.println("Is set1 empty? : "+ set1.isEmpty());
        System.out.println(" ");
        System.out.println("Does set1 contain 1 ? : "+ set1.contains(1));
        System.out.println("Does set1 contain 99 ? : "+ set1.contains(99));
        System.out.println(" ");
        set1.add(2);
        set1.add(6);
        set1.add(7);
        set1.add(9);
        set1.add(9);//duplicate check
        set1.add(10);
        System.out.println("set1(After setup) >> "+set1);
        System.out.println("size of set1 >> "+set1.size());
        System.out.println(" ");
        System.out.println("Remove 7 from set1 : "+ set1.remove(7));
        System.out.println("Remove 8 from set1 : "+ set1.remove(8)+" (don't exist.)");
        System.out.println(" ");
        System.out.println("set1 >> "+set1);
        set2.add(2);
        set2.add(10);
        System.out.println("set2 >> "+set2);
        System.out.println(" ");
        System.out.println("set1 ⊇ set2 : "+ set1.containsAll(set2));
        set2.add(5);
        set2.add(9);
        set2.add(3);
        System.out.println("set2 (After adding) >> "+set2);
        System.out.println("set1 ⊇ set2 : "+ set1.containsAll(set2));
        System.out.println("set1 - set2 : "+ set1.removeAll(set2) +" | set1 >> "+set1);
        System.out.println("set1 ∪ set2 : "+ set1.addAll(set2) +" | set1 >> "+set1);
        System.out.println("set1 ∩ set2 : "+ set1.retainAll(set2) +" | set1 >> "+set1);
        set1.clear();
        System.out.println("clear set1 : "+set1);
        return;
    }
}
