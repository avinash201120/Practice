import java.util.Scanner;
public class Switch {
    public static void main(String agrs[]){
        System.out.println("\n1.Name \n2.Birth Date \n3.Pointer \n4.Hobbies \n5.Placement \n6.Favorite Color \n7.Favorite Dish:");
        System.out.print("\nSelect your choise (1 to 7). Which you want to konw about Vaishnavi:");

        Scanner sc = new Scanner(System.in);
        int info=sc.nextInt();

        switch(info){

            case 1:
                System.out.println("Cheshmesh");
                break;
            case 2:
                System.out.println("25 jun 2000");
                break;
            case 3:
                System.out.println("10 pointer and university ranker");
                break;
            case 4:
                System.out.println("Shopping"); 
                break; 
            case 5:
                System.out.println("\n1.Qaulity Kiosko \n2.Core Co");
                break;
            case 6:
                System.out.println("\n1.A Black\n2.Light Blue");
                break;
            case 7:
                System.out.println("\n1.Pizza \n2.Badam Shake \n3.kaju kari \n4.All Sweet Dish");
                break; 
            default:
                System.out.println("You enter wrong choice, Please enter correct choice");                
        }
    }
}
