import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> numbersList = new ArrayList<>();
        for (Integer i : input) {
            if (i > 0 && i % 2 == 0) {
                numbersList.add(i);
            }
        }
        Collections.sort(numbersList);
        for (Integer number : numbersList) {
            System.out.print(number + " ");
        }
    }
}
