import java.util.Scanner;

public class DatesClass {
    public Integer day;
    public Integer month;
    public Integer year;


    public DatesClass(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }


    public void americanFormat(int month, int day, int year) {
        System.out.println(month + "/" + day + "/" + year);
        System.out.println(day + "/" + month + "/" + year);
    }

    public void europeanFormat(int day, int month, int year) {

        System.out.println(day + "/" + month + "/" + year);
        System.out.println(month + "/" + day + "/" + year);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter day: ");
        int day = Integer.valueOf(scanner.nextInt());

        System.out.println("Please enter month: ");
        int month = Integer.valueOf(scanner.nextInt());

        System.out.println("Please enter year: ");
        int year = Integer.valueOf(scanner.nextInt());

        System.out.println("Please enter date format: american or european: ");
        Scanner scanner1 = new Scanner(System.in);
        String userInput = scanner1.nextLine();

        DatesClass amFormat = new DatesClass(0, 0, 0);
        DatesClass euFormat = new DatesClass(0, 0, 0);



        if (userInput.equals("american")) {
            amFormat.americanFormat(month, day, year);

        } else {
            euFormat.europeanFormat(day, month, year);
        }





    }

}
