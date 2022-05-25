import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersFilter {

    public List<Integer> getPositive(List<Integer> numbers) {
        List<Integer> positiveNumbers = numbers.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());
        return positiveNumbers;
    }

    public void printList(List<Integer> numbers) {
        numbers.forEach(System.out::println);
    }

    public void printList(ArrayList<Integer> numbers) {
        numbers.forEach(System.out::println);
    }

    public ArrayList<Integer> getDivisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> divisibleNumbers = numbers.stream()
                .filter(n -> (n % 2 == 0) || (n % 3 == 0) || (n % 5 == 0))
                .collect(Collectors.toCollection(ArrayList::new));
        return divisibleNumbers;
    }
}
