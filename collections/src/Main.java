import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1,20);

        for (int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}