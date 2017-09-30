package calcV1;

import java.util.Scanner;

class CalcV1Tester{
    public static void main(String[] args){
        CalcV1 c = new CalcV1();
        Scanner num = new Scanner(System.in);
        for(;;){
            System.out.println(" ");
            System.out.println("Prosze podać pierwszą liczbe: ");
            String fNum = num.nextLine();
            System.out.println("Prosze podać drugą liczbe: ");
            String sNum = num.nextLine();
            c.setNumbers(fNum, sNum);
            c.action();
            System.out.println("Wybierz akcje: ");
            String chosen = num.nextLine();
            c.calculation(chosen);
        }
    }
}
class CalcV1 {
    int a, b;

    public void action(){
        System.out.println(" Dostępne działania: ");
        System.out.println("1. Dodawanie.");
        System.out.println("2. Odejmowanie.");
        System.out.println("3. Mnożenie.");
        System.out.println("4. Dzielenie.");
    }

    public void setNumbers(String number1, String number2){
        String x = number1;
        String y = number2;
        a = Integer.parseInt(x);
        b = Integer.parseInt(y);
    }

    public void calculation(String chose){
        int choseNum = Integer.parseInt(chose);

        int c;
        switch (choseNum){
            case 1: c = a + b;
                System.out.println("Suma " + a + " oraz " + b +" wynosi: " + c);
                break;
            case 2: c = a - b;
                System.out.println("Różnica " + a + " oraz " + b +" wynosi: " + c);
                break;
            case 3: c = a * b;
                System.out.println("Iloczyn " + a + " oraz " + b +" wynosi: " + c);
                break;
            case 4: if (b==0){
                System.out.println("O ty cholero nie dziel przez '0' Zero!");
                break;
            }else {
                c = a / b;
                System.out.println("Iloraz " + a + " oraz " + b +" wynosi: " + c);
                break;
            }
            default: System.exit(0);
        }
    }

}
