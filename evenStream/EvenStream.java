package evenStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenStream {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList();

        for (int i = 0; i < 500; i++) {
            arr.add(i);
        }

        List<Integer> filtered = arr.stream().filter(num -> (num % 2 == 0)).limit(50).collect(Collectors.toList());
        System.out.println(filtered);

    }
}
