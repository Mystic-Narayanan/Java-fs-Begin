import java.util.Scanner;
public class Main {
    static int a = 10, b = 15;

    public static void main(String[] args) {
        //operators();
       // nestedCondition();
      //  switchStatement();
       // forLoop();
        whileLoop();
    }

    // public static void operators(){
    //  System.out.println("a + b ="+ (a + b)); //Sum
    //  System.out.println("a - b ="+ (a - b)); //Diff
    // System.out.println("a * b ="+ (a * b)); //Product
    //   System.out.println("a / b ="+ (a / b)); //Quotient

    /*public static void nestedCondition() {
        int a = 18;
        if (a >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }

    }


    public static void switchStatement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        //int day = scanner.nextInt();
        String day = scanner.nextLine();
        String dayName;
        switch (day) {
            case "1":
                dayName = "Monday";
                break;
            case "2":
                dayName = "Tuesday";
                break;
            case "3":
                dayName = "Wednesday";
                break;
            case "4":
                dayName = "Thursday";
                break;
            case "5":
                dayName = "Friday";
                break;
            case "6":
                dayName = "Saturday";
                break;
            case "7":
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day number";
                break;
        }

        System.out.println("The day is " + dayName);
    }

    public static void forLoop() {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "X" + i + "=" + (n * i));
        }

    }*/
public static void whileLoop(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number");
    int number = scanner.nextInt();

    int reversed = 0;
    while(number!=0){
        int digit = number%10;
        reversed = reversed*10+digit;
        number = number/10;

    }
    System.out.println("Reversed number is "+reversed);
    }
}