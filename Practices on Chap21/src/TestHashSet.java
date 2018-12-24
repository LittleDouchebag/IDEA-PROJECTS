import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestHashSet {
    public static void main(String[] args) {

        //TODO Gonna try Hash Set here! no rank
        Set<String> hashSet = new HashSet<>();
        hashSet.add("London");
        hashSet.add("Anlahuankeba");
        hashSet.add("Urumqi");
        hashSet.add("Beijing");

        System.out.println(hashSet);

        if (hashSet.contains("London"))
            System.out.println("shabi");

        if (!hashSet.isEmpty())
            System.out.println("shabi");

        for (String everyStringIn : hashSet){
            System.out.println(everyStringIn);
        }
        System.out.println(hashSet.getClass()+"\n");

        //TODO here goes Linked Hash Set! fixed rank
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Paris");
        linkedHashSet.add("Jerusalum");
        linkedHashSet.add("Damascus");

        if (!linkedHashSet.isEmpty())
            System.out.println(linkedHashSet);

        for (String everyStringIn : linkedHashSet){
            System.out.println(everyStringIn);
        }
        System.out.println(linkedHashSet.getClass()+"\n");

        //TODO now is Tree Set! rank recaculated every new element is added!
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Shanghai");
        treeSet.add("Moscow");
        treeSet.add("Vladdimostok");
        treeSet.addAll(hashSet);
        treeSet.addAll(linkedHashSet);
        treeSet.add("Alaska");

        System.out.println(((TreeSet<String>) treeSet).first());
        System.out.println(treeSet);
        System.out.println(((TreeSet<String>) treeSet).pollFirst());
        System.out.println(treeSet);
        System.out.println(((TreeSet<String>) treeSet).headSet("Shanghai"));
        System.out.println(((TreeSet<String>) treeSet).tailSet("Shanghai"));
        System.out.println(((TreeSet<String>) treeSet).higher("J"));
    }
}
