package Project3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Investment Earnings Project from Begin Coding Fast youtube channel.
 * The example code keeps track of the change in stock price after each trading day.
 * A user enters the buying price and the closing price on subsequent trading days.
 * Then the earnings are evaluated. The process stops when a negative closing price is entered.
 */
public class InvestmenEarnings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your buying price per share:");
        double buyingPrice = scanner.nextDouble();
        int day=1;
        double closingPrice = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");

        while(true)
        {
            System.out.println("Enter the closing price for day "+ day + "(any negative value to leave : ");

            closingPrice = scanner.nextDouble();
            if(closingPrice <0.0)
            {
                break;
            }

            double earnings = closingPrice - buyingPrice;
            if (earnings > 0.0)
            {
                System.out.println("After day "+ day + " , you earned "+ df.format(earnings) + " per share.");
            }else if (earnings < 0.0){
                System.out.println("After day "+ day + " , you lost "+ df.format(-earnings) + " per share.");
            }else{

                System.out.println("After day" + day+ ", you have " + " no earnings per share" );
            }
            day ++;
        }
        scanner.close();
    }
}
