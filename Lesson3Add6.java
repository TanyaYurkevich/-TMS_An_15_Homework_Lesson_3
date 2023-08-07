import java.util.Scanner;

public class Lesson3Add6 {


        public static void main(String[] args) {
            String amount = "Сумма вкладa:";
            System.out.println(amount);
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            String years = "Желаемы срок:";
            System.out.println(years);
            int b = sc.nextInt();
            for (int i = 0; i <= b; i++) {
                double interestRate = a * 0.1;
                a = a+interestRate;}


            System.out.println("Через " + b + " лет сумма вашего счета составит: " + a );
        }
    }