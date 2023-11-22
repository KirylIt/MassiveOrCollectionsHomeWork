import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создайте числовой массив.
        // Используя класс Arrays, проверьте в работе такие методы,
        // такие как sort(), toString(), copyofRange(), и Equals().

        int[] numbers = {12, 15, 16, 82, -43, 89, 76, -1, 0, 10, 13, -255};
        int[] numbersCopy = Arrays.copyOfRange(numbers, 0,8);


        System.out.println("***********");
        System.out.println(Arrays.toString(numbers));
        System.out.println("***********");
        System.out.println(Arrays.equals(numbers, numbersCopy));
        System.out.println("***********");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}