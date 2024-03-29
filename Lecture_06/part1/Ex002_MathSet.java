package Lecture_06.part1;
import java.util.*;
public class Ex002_MathSet {
    public static void main(String[] args) {
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new HashSet<Integer>(a); u.addAll(b);
        var r = new HashSet<Integer>(a); r.retainAll(b);
        var s = new HashSet<Integer>(a); s.removeAll(b);
        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [17, 2, 3, 5, 7, 11, 13]
        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 7, 11, 13]
        System.out.println(r); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]

        System.out.println(a.addAll(b)); // true
        // r.addAll(s);
        // System.out.println(r); // [1, 2, 3, 4, 5, 6, 7]
        s.addAll(u);
        System.out.println(s); // [1, 17, 2, 3, 4, 5, 6, 7, 11, 13]
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(treeSet.first()); // [1]
        System.out.println(treeSet.last()); // [5]
        System.out.println(treeSet.headSet(4)); // [1, 2, 3]
        System.out.println(treeSet.tailSet(3)); // [3, 4, 5]
        System.out.println(treeSet.subSet(2, 5)); // [2, 3, 4]

    }
}