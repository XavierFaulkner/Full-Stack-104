import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniqueLastNames {

    List<String> lastNames = new ArrayList<>();

    public void getNames(Scanner in) {
        String input = "";

        while(true) {
            System.out.println("\nContinue personal information input? 'quit' ends:");
            input = in.nextLine();
            if(input.equals("quit")){
                break;
            }
            System.out.print("\nInput first name: ");
            in.nextLine();
            System.out.print("\nInput last name: ");
            input = in.nextLine();
            lastNames.add(input);
            System.out.print("\nInput year of birth: ");
            in.nextLine();
        }
    }

    public void printLastNames() {
        System.out.println("\nUnique last names in alphabetical order:");
        List<String> filteredNames = lastNames.stream()
                .sorted()
                .collect(Collectors.toList());
        filteredNames.forEach(System.out::println);
    }
}
