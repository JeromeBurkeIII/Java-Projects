
package Project2;
import java.util.Scanner;

    /*
      The program adds a time to a given time.
    * It handles the issue of carry digits arising from adding seconds, minutes, and hours by using if statements.
    *
    */


public class TimeAdder {

    public class Main {
        public static void main(String[] args) {

            int currentHour = 0, currentMinute=0, currentSecond=0;

            int forwardHour = 0, forwardMinute=0, forwardSecond=0;

            int answerHour=0 ,  answerMinute=0, answerSecond=0;

            int carrySecond=0, carryMinute=0;

            boolean isNextDay = false;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter current hour:");
            currentHour = scanner.nextInt();

            System.out.println("Enter current Minute:");
            currentMinute = scanner.nextInt();

            System.out.println("Enter current second:");
            currentSecond = scanner.nextInt();

            System.out.println("Enter hour to go forward: ");

            forwardHour = scanner.nextInt();

            System.out.println("Enter minute to go forward: ");
            forwardMinute = scanner.nextInt();

            System.out.println("Enter seconds to go forward: ");
            forwardSecond = scanner.nextInt();

            answerSecond = currentSecond + forwardSecond;

            if (answerSecond >= 60)
            {
                answerSecond  = answerSecond - 60;
                carrySecond = 1;
            }



            answerMinute = currentMinute + forwardMinute + carrySecond;

            if (answerMinute >= 60)
            {
                answerMinute  = answerMinute - 60;
                carryMinute = 1;
            }



            answerHour = currentHour + forwardHour + carryMinute;

            if (answerHour >= 24)
            {
                answerHour  = answerHour - 24;
                isNextDay = true;
            }

            if (isNextDay)
            {
                System.out.println("The answer is " + answerHour + ":" + answerMinute + ":" + answerSecond + " on the next day");
            }
            else {
                System.out.println("The answer is " + answerHour + ":" + answerMinute + ":" + answerSecond );
            }
        }
    }
}
