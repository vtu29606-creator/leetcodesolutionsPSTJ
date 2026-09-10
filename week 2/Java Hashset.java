import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicate - not added

        System.out.println("HashSet: " + numbers);

       
        System.out.println("Contains 20: " + numbers.contains(20));

        
        numbers.remove(10);

        System.out.println("After removing 10: " + numbers);

        
        System.out.println("Size: " + numbers.size());

        
        System.out.println("Elements:");
        for (Integer n : numbers) {
            System.out.println(n);
        }
    }
}