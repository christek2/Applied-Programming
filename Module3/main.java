import java.util.Scanner;

public class main 
{
    public static void main(String[] args)
    {
        int age = 23;
        int year = 0;

        Scanner reader = new Scanner(System.in);
        System.out.print("How many years do you want to pass? ");
        int years_passed = reader.nextInt();
        reader.close();
        age = age + years_passed;
        year = year + years_passed;
        System.out.println(String.format("%2d years old in the year %2d", age, year));
    }
    
}
