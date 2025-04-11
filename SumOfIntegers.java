import java.util.*;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        List<Integer> integerList = new ArrayList<>();

        for (String num : numbers) {
            integerList.add(Integer.parseInt(num)); // Autoboxing
        }

        int sum = 0;
        for (int num : integerList) {
            sum += num; // Unboxing
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
