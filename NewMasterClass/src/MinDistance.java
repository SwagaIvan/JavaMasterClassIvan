public class MinDistance {
    static int minDistance(int n){
        if (n == 1 || n == 0){
            return 0;
        }

        int currentFactor = 1;
        int minDistance  = n-1;
        for (int i = 2; i*i<=n; i++){
            if(n%i == 0){

                 minDistance = Math.min(i-currentFactor, minDistance);
                currentFactor  = i;
            }
        }
        return minDistance;
    }

    public static void main(String[] args) {
        System.out.println(minDistance(7));
    }
}
