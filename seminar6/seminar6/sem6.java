package seminar6.seminar6;
import java.util.Comparator;
import java.util.TreeSet;;
public class sem6 {
    
    public static void main(String[] args) {
        TreeSet <Integer> neee = new TreeSet<>(Comparator.reverseOrder());
        neee.add(2);
        neee.add(9);
        neee.add(3);
        neee.add(5);
        neee.add(1);
        neee.add(7);
        neee.add(8);
        System.out.println(neee);
    }
}
