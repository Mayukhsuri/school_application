package school;

import java.util.Scanner;

public class School_fund {
    public static Scanner sc=new Scanner(System.in);
   // public   total;
    public static void main(String [] args) {
        String reply = sc.nextLine();

        System.out.println("Please choose the status of the student: commuting or dorm");


            if (reply.equals("dorm")) {
                dorm();
            } else if (reply.equals("commuting")) {
                commuting();
            }

    }
    public static void  allstudents()
    {
        System.out.println("please enter the student name: ");
        String name=sc.nextLine();
        System.out.println("please enter your year: ");
        String year = sc.next();

       // String a = null;

    }
    public static int total()
    {
        System.out.println("What are the cost of supplies: ");
        int cost=sc.nextInt();
        System.out.println("what is the number of credit that you need : ");
        int credits=sc.nextInt();
        System.out.println("what is the cost per hour ");
        int costperhr=sc.nextInt();

        int credit= credits*costperhr;
        int calculation=credit+cost;
        //System.out.println(calculation);
        return calculation;
    }

    public static void dorm()

    {
        allstudents();
        //total();
        System.out.println("what is the duration of stay: ");
        int stay= sc.nextInt();
        System.out.println("what is your weekly expense: ");
        int weekly_expense= sc.nextInt();
        System.out.println("what is the cost of room and board: ");
        int boarding= sc.nextInt();

        int  dom_total=stay*(weekly_expense+boarding);
        int totality=dom_total+total();
        System.out.print("your total expediture is "+totality );

    }
    public static void commuting()
    {
        allstudents();
        //total();
        System.out.println("what is the cost of commuting: ");
        int commute= sc.nextInt();
        System.out.println("what is your weekly expense: ");
        int weekly_expense= sc.nextInt();
        System.out.println("any other miscelaneous expenses: ");
        int misc= sc.nextInt();

        int comm_total=commute*(weekly_expense+misc);
        int totality=comm_total+total();
        System.out.print("your total expeanditure is : "+totality);
        //return comm_total;
       // int a = comm_total+total();

    }

}
