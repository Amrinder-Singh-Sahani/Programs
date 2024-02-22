import java.net.Socket;
import java.util.Scanner;

/* Question 3 :- A large company pays its salespole on a 
commission basis. The salespole receive $200 per week plus
9% of their gross sales for that week. For example, a salesperson
who sell $5000 worth of merchandise in a week receives $200
plus 9% of $5000, of a total of $650. You've been supplied with a 
list of the items sold by each salesperson. The value of these
items are shown. Develop a java application that inputs one
salesperson's items sold for last week and calculates and 
displays that salesperson's earnings. There's no limit to
the number of items that can be sold.

        item        Value
        1           239.99
        2           129.75
        3           99.95
        4           350.89
*/

class itemSold {
    int itemNo = 1;
    float itemPrice, totalPrice = 0f;

    Scanner input = new Scanner(System.in);

    itemSold() {

        while (itemPrice != -1) {
            System.out.printf("Enter the price of item no %d: ", itemNo);
            itemPrice = input.nextFloat();
            if (itemPrice < 0) {
                break;
            } else {
                totalPrice = itemPrice + totalPrice;
                itemNo++;
            }

        }

        float earnings = 200f + (totalPrice * 0.09f);
        System.out.println("Total earnings of the salesperson is: $" + earnings);

    }

}

public class cw3_3_SalesCommission {
    public static void main(String args[]) {

        itemSold sales = new itemSold();

    }
}