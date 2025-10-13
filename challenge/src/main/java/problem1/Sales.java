package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
         // a final attribute.
        int sum;
        Scanner scan = new Scanner(System.in);
        System.err.print("How many salespeople are there : ");
        int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }

        int max_sales = sales[0];
        int max_salesPersonId = 0;
        int min_sales = sales[0];
        int min_salesPersonId = 0;


        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if (sales[i]>max_sales){
                max_sales = sales[i];
                max_salesPersonId = i;
            }
            if (sales[i]<min_sales){
                min_sales = sales[i];
                min_salesPersonId = i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("The average sales: "+(double) sum/SALESPEOPLE);
        System.err.println("Salesperson "+ (max_salesPersonId+1)+ " had the highest sale with $"+max_sales+".");
        System.err.println("Salesperson "+ (min_salesPersonId+1)+ " had the lowest sale with $"+min_sales+".");

        
        System.err.print("Enter the amount : ");
        int amount = scan.nextInt();
        int num_exceeded = 0;
        System.out.println("the salespeople who have exceeded that amount : ");
        for (int i=0; i<sales.length; i++){
            if (sales[i]>=amount){
                System.out.println("* The salesperson "+(i+1)+" with a sale of "+sales[i]);
                num_exceeded++;
            }
        }
        System.err.println("There number of salespeople who have exceeded that amount : "+num_exceeded);
        scan.close();


    }
}