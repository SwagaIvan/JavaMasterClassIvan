//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }

        int n  =4;

        System.out.printf("Checking prime:\n %d is Prime?:%s ",n,isPrime(n));



    }


    public static String isPrime(int n){
        if(n < 2) return "No";
        for (int i=2; i*i<=n; i++){
            if (n%i == 0) return "No";

        }
        return "Yes";
    }
}
