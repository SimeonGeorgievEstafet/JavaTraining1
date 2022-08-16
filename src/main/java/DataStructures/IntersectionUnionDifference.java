package DataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionUnionDifference {
    Set<Integer> a;
    Set<Integer> b;

    public IntersectionUnionDifference(Set<Integer> a, Set<Integer> b) {
        this.a = a;
        this.b = b;
    }

    public void printAllCommonElements(Set<Integer> a, Set<Integer> b) {

        Set<Integer> newSet = new HashSet<>(a);
        newSet.retainAll(b);
        System.out.println("Common elements: " + newSet);
    }

    public void addMissingElements(Set<Integer> a, Set<Integer> b) {
        Set<Integer> newSet = new HashSet<>(a);
        newSet.addAll(b);
        System.out.println("Add set B to set A: " + newSet);
    }

    public void printUniqueElementsInA(Set<Integer> a, Set<Integer> b) {
        Set<Integer> newSet = new HashSet<>(a);
        newSet.removeAll(b);
        System.out.println("Missing element in set B: " + newSet);
    }


    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        Set<Integer> setB = new HashSet<>(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));

        IntersectionUnionDifference IUD = new IntersectionUnionDifference(setA, setB);
        IUD.addMissingElements(setA, setB);
        IUD.printAllCommonElements(setA, setB);
        IUD.printUniqueElementsInA(setA, setB);
    }
}
