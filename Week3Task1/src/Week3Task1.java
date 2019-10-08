import java.util.Scanner;

public class Week3Task1 {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a%b);
    }

    public static void primes(int n) {
        int []arr = new int[n+1];
        int []res = new int[n];
        for (int i=0; i<=n; i++) {
            arr[i] = i;
        }
        int tmp = 0;
        for (int i=2; i<=n; i++) {
            if (arr[i] != 0) {
                res[tmp] = arr[i];
                tmp++;
                for (int j=2; j<=n/arr[i]; j++) {
                    arr[i*j] = 0;
                }
            }
        }
        for (int i=0; i<tmp; i++) {
            System.err.print(res[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two your favorite number: ");
        //int a = input.nextInt();
        int b = input.nextInt();
        //System.out.println("So fibonacci thu " + a + " la: " + fibonacci(a));
        //System.out.println("UCLN cua hai so " + a + " va " + b + " la: " + gcd(a, b));
        System.err.print("Day cac so nguyen to nho hon so " + b + " la: ");
        primes(b);
    }
}

