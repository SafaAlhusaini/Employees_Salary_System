import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {

//        create salary management system
//        you have employees in data
//        every employee has salary
//        you must show a message with 2 choices
//        The choice one is to create a new employee and assign his salary to the system
//        The choice two is to show all salaries with names of employees


        System.out.println("---- Employee Salary Management ----");

        Scanner read = new Scanner(System.in);

        Employees e = new Employees();
        e.employee = "Safa Alhusaini";
        e.sal = 500;

        Employees e2 = new Employees();
        e2.employee = "Marwa Alhusaini";
        e2.sal = 500;

        List<Employees> ee = new ArrayList<>();
        ee.add(e);
        ee.add(e2);
        while (true)
        {
            System.out.println("1. Create new Employee / assign Employee salary\n2. Show all Employee details  ");
            int ch1 = read.nextInt();
            if (ch1 == 1)
            {
                Employees e3 = new Employees();
                System.out.print(" Employee name : ");
                e3.employee = read.next();

                System.out.print(" Employee Salary : ");
                e3.sal = read.nextInt();
                ee.add(e3);

            }
            else if(ch1 == 2)
            {
               System.out.println(" Employee Name " + " Salary ");
               for (int i = 0; i < ee.size() ; i++)
               {
                   System.out.println(i + 1 + "."+ee.get(i));
               }

            }
            else
            {
                break;
            }

        }

    }
}
                                               //-----3 --- Aug --- 2023
