/*  Write an application that displays a table of the
binary, octal and hexadecimal equivalent of the decimal
numbers in the range 1 through 256.

 */

public class cw4_17_TableofBinOctHex {
    public static void main(String args[]) {

        // System.out.println(Math.ceil(1 / 2));
        for (int i = 1; i <= 256; i++) {
            int c = i;
            int b = 0;
            int d = 1;

            do {
                if ((int) (c % 2) == 1) {

                    b = b + d;
                    d = d * 10;
                    c = c / 2;
                } else {
                    d = d * 10;
                    c = c / 2;

                }

            } while (c != 0);

            int oct_num = 0, oct_mul = 1, oct_counter = i;
            do {
                oct_num = oct_num + ((oct_counter % 8) * oct_mul);
                oct_mul = oct_mul * 10;
                oct_counter = oct_counter / 8;
            } while (oct_counter != 0);

            System.out.println(i + "\t" + b + "\t" + oct_num);
        }

    }
}