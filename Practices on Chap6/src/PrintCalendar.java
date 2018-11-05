import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year you want:");
        int year = scanner.nextInt();
        System.out.println("Enter the month you want:");
        int month = scanner.nextInt();
        PrintUpperHalf(year,month);
        PrintLowerHalf(year,month);
    }

    private static void PrintUpperHalf(int year,int month){
        System.out.print("\t\t"+year+"\t");
        switch (month) {
            case 1: System.out.println("JAN");break;
            case 2: System.out.println("FEB");break;
            case 3: System.out.println("MAR");break;
            case 4: System.out.println("APR");break;
            case 5: System.out.println("MAY");break;
            case 6: System.out.println("JUN");break;
            case 7: System.out.println("JUL");break;
            case 8: System.out.println("AUG");break;
            case 9: System.out.println("SEP");break;
            case 10: System.out.println("OCT");break;
            case 11: System.out.println("NOV");break;
            case 12: System.out.println("DEC");break;
            default:{
                System.out.println("ERROR:MONTH");
                return;
            }
        }
        System.out.println("- - - - - - - - - - - - - - - -");
    }
    private static void PrintLowerHalf(int year,int month){
        System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        int first_day = (DayCount(year, month) + 3) % 7;
        int i;
        for (i=1;i<=first_day;i++)
            System.out.print("\t");
        int WeekFlag = i;
        for (i=1;i<=day_of_month(year, month);i++,WeekFlag++){
            System.out.print(i+"\t");
            if (WeekFlag==7){
                System.out.print("\n");
                WeekFlag = 0;
            }
        }
    }
    private static int isLeapyear(int year){
        if ((year % 4 ==0 && year % 100 != 0)|| year % 400 ==0)
            return 1;
        else
            return 0;
    }
    private static int day_of_month(int year,int month){
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            return  31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            return  30;
        else if (isLeapyear(year)==1)
            return  29;
        else
            return  28;
    }

    private  static  int DayCount(int year, int month){
        int Day_sum=0;
        for(int i=1800;i<year;i++){
            if (isLeapyear(i)==1)
                Day_sum += 366;
            else
                Day_sum +=365;
        }
        for(int i=1;i<month;i++) {
            Day_sum += day_of_month(year,i);
        }
        return Day_sum;
    }
}
