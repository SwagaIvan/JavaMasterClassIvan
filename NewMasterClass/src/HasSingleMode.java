public class HasSingleMode {
    public static int hasSingleMode(int [] a) {
        if (a.length == 0 || a == null) {
            return 0;
        }

        int modeCount = 0;
        int modalfrequency = 0;
        int mode = a[0];
        boolean singleMode = false;
        for (int i = 0; i < a.length; i++) {
            //  mode = a[i];
            modeCount = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    modeCount++;
                }
            }
            if (modeCount > modalfrequency) {
                mode = a[i];
                modalfrequency = modeCount;
                singleMode = true;
            }else if(modeCount == modalfrequency && a[i] != mode){
                singleMode = false;
            }



        }
        return singleMode? 1 : 0;
    }


    public static void main(String[] args) {
        int [] a = {7,1,2,1,7,4,2,7,1};
        int[] b = {1, -29, 8, 5, -29, 6};
        int [] c = {1, 2, 3, 4, 2, 4, 7};
        int [] d = {1, 2, 3, 4, 6};
        System.out.println(hasSingleMode(a));
    }

}
