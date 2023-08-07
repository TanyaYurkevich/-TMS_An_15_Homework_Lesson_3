import java.util.Scanner;

public class Lesson3Add5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        while (a!=0 && b!=0) {
            if(a>b) {
                a=a-b;
            } else b -= a;
            }
            System.out.println(a+b);


}

    }

