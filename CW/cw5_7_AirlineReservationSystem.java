/* Write an application to assign seats on 
each flight of the airline's only plane(capacity: 10 seats)
Your application should display the following alternatives:
Please type 1 for First Class and Please type 2 for Economy.
If the user types 1, your application should assign a seat in 
the first class session(seats 1-5). If the user types 2, your
application should assign a seat in the economy section 
(seats 6-10). Your application should then display a boarding
pass indicating the person's seat number and whether it's in the
first class or economy section of the plane.
Use a one dimensional array of primitive type boolean to 
represent the seating chart of the plane. Initialize all the
elements of the array to false to indicate that all the seats are
empty. As each seat is assigned, set the corresponding element of 
the array to true to indicate that the seat is no longer available.
Your application should never assign a seat that has already been
assigned. When the economy section is full, your application should
ask the person if it's acceptable to be placed in the first class 
section (and vice versa). If yes, make the appropriate seat assignment.
If no, display the message "Next flight leaves in three hours."

 */

// import java.util.Random;
import java.util.Scanner;

public class cw5_7_AirlineReservationSystem {
    public static void main(String args[]) {
        // Random random = new Random();
        boolean seatnumber[] = new boolean[10];

        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        byte count1 = 0, count2 = 5, end = 0;

        do {
            System.out.println("Please type 1 for First Class\nPlease type 2 for Economy");
            byte seatSection = input.nextByte();

            if (count1 == 5 && count2 == 10) {
                System.out.println("All the seats are booked");
                seatSection = 0;
                System.out.println("Enter (-1) to exit.");
                end = input.nextByte();
            } else {
                if (count1 == 5 && seatSection == 1) {

                    System.out.println("All seats in the first class are booked");
                    System.out.println("Would you like to be placed in the economy class?");
                    System.out.println("YES\tNO");
                    String option = stringInput.next();
                    if (option.equalsIgnoreCase("Yes")) {
                        seatSection = 2;
                    } else {
                        System.out.println("The next flight will leave in three hours");
                        seatSection = 0;
                    }

                } else if (count2 == 10 && seatSection == 2) {
                    System.out.println("All seats in the economy class are booked");
                    System.out.println("Would you like to be placed in the first class?");
                    System.out.println("YES\tNO");
                    String option = stringInput.next();
                    if (option.equalsIgnoreCase("Yes")) {
                        seatSection = 1;
                    } else {
                        System.out.println("The next flight will leave in three hours");
                        seatSection = 0;
                    }
                }
            }

            switch (seatSection) {
                case 1: {
                    seatnumber[count1] = true;
                    System.out.println("Seat Number: " + (count1 + 1));
                    System.out.println("Type: First Class");
                    count1 += 1;
                    break;
                }
                case 2: {
                    seatnumber[count2] = true;
                    System.out.println("Seat Number: " + (count2 + 1));
                    System.out.println("Type: Economy Class");
                    count2 += 1;
                    break;
                }
            }

        } while (end != -1);
    }
}