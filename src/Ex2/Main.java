package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listInt.add(random.nextInt(100));
        }

        listInt.forEach(e -> System.out.print(e + " "));
        System.out.println("\n");
        System.out.println(listInt.stream().map(e -> Math.pow(e, 2)).mapToInt(Double::intValue).reduce(0, Integer::sum));
    }
}
