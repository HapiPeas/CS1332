import java.util.Arrays;

public class ArrayListDriver {
    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<String>();

        System.out.println(list.size());
        list.addToFront("0a"); // 0a
        list.addToFront("1a"); // 1a 0a
        list.addToFront("2a"); // 2a 1a 0a
        list.addToFront("3a"); // 3a 2a 1a 0a
        list.addToFront("4a"); // 4a 3a 2a 1a 0a
        System.out.println(list.size());

        Object[] expected = new Object[ArrayList.INITIAL_CAPACITY];

        expected[0] = "4a"; // 4a
        expected[1] = "3a"; // 3a 4a
        expected[2] = "2a"; // 2a 3a 4a
        expected[3] = "1a"; // 1a 2a 3a 4a
        expected[4] = "0a"; // 0a 1a 2a 3a 4a

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(expected[i]);
        }
    }
}
