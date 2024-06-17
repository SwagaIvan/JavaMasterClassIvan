import java.util.HashMap;
import java.util.Map;

public class HasSingleModeJames {
    private static int hasSingleMode (int []a ) {

        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            if (myMap.containsKey(a[i])) {

                myMap.put(a[i], myMap.get(a[i]) + 1 );
            }

            else {
                myMap.put(a[i], 1);
            }
        }

        int maxValue = 0;

        for (int i : myMap.values()) {

            if ( i > maxValue) {
                maxValue = i;
            }
        }

        int mode = 0;

        for(int j : myMap.values()) {

            if (j == maxValue) {
                mode++;
            }

            if (mode > 1) {

                return 0;
            }

        }

        return 1;
    }




    public static void main(String[] args) {
        int [] a = {7,1,2,1,7,4,2,7,1};//0
        int[] b = {1, -29, 8, 5, -29, 6};//1
        int [] c = {1, 2, 3, 4, 2, 4, 7};//0
        int [] d = {1, 2, 3, 4, 6};//0
        System.out.println(hasSingleMode(a));
        System.out.println(hasSingleMode(b));
        System.out.println(hasSingleMode(c));
        System.out.println(hasSingleMode(d));
    }
}
