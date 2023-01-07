import java.util.Scanner;

public class DatesClass {
    public int day;
    public int month;
    public int year;

    public DatesClass(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void  americanFormat (int month,int day, int year) {

        System.out.println(month + "/" + day + "/" + year);
    }

    public void europeanFormat (int day, int month, int year) {

        System.out.println(day + "/" + month + "/" + year);
    }

//    public void convertation (){
////        public void convertation (int americanFormat, int europeanFormat){
//        if ((americanFormat()) == true) {
//            System.out.println(europeanFormat());
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Please enter day: ");
        int day = Integer.valueOf(scanner.nextInt());

        System.out.println("Please enter month: ");
        int month = Integer.valueOf(scanner.nextInt());

        System.out.println("Please enter year: ");
        int year = Integer.valueOf(scanner.nextInt());

        System.out.println("Please enter date format: american or european: ");
        String userInput = scanner.nextLine();

        System.out.println("The opposite format will be: ");




    }

}
