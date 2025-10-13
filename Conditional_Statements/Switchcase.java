/*import java.util.*;
public class Switchcase
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String dayname;
        switch (n)
        {
            case 1:
                dayname="mon";
                break;
            case 2:
                dayname="tue";
                break;
            case 3:
                dayname="wed";
                break;
            case 4:
                dayname="thur";
                break;
            case 5:
                dayname="fri";
                break;
            case 6:
                dayname="sat";
                break;
            case 7:
                dayname="sun";
                break;
            default:
                dayname="invalid";
            
        }
        System.out.print(dayname);
    }
}*/



import java.util.*;
public class Switchcase
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String dayname;
        dayname = switch (n) {
            case 1 -> "mon";
            case 2 -> "tue";
            case 3 -> "wed";
            case 4 -> "thur";
            case 5 -> "fri";
            case 6 -> "sat";
            case 7 -> "sun";
            default -> "invalid";
        };
        System.out.print(dayname);
    }
}