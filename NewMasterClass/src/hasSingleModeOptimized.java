import java.util.HashMap;
import java.util.Map;

public class hasSingleModeOptimized {
    public static int hasSingleModeOptimized(int [] a){
        if(a == null || a.length == 0) return 0;

        int maxfrequency = 0;
        int mode = a[0];
        boolean hasSingleMode = false;
        Map<Integer, Integer> modalFrequency = new HashMap<>();
        for(int i : a){
            modalFrequency.put(i,modalFrequency.getOrDefault(i,0)+1);
            if(modalFrequency.get(i) > maxfrequency){
                mode = i;
                maxfrequency = modalFrequency.get(i);
                hasSingleMode = true;

            }else if(modalFrequency.get(i) == maxfrequency  && i != mode){
                hasSingleMode = false;
            }

        }

        return hasSingleMode? 1: 0;
    }

    public static void main(String[] args) {
        int [] a = {7,1,2,1,7,4,2,7,1};
        int[] b = {1, -29, 8, 5, -29, 6};
        int [] c = {1, 2, 3, 4, 2, 4, 7};
        int [] d = {1, 2, 3, 4, 6};
        System.out.println(hasSingleModeOptimized(a));
        System.out.println(hasSingleModeOptimized(b));
        System.out.println(hasSingleModeOptimized(c));
        System.out.println(hasSingleModeOptimized(d));
    }
}
