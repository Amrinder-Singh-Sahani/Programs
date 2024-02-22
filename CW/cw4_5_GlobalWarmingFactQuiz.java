/* Create a five a quiz-question multiple choice quiz 
on global warming, each question having four possible answers
(numbered 1 - 4). Be objective and try to fairly represent both
sides of the issue. Next write am application that administers the
quiz, calculates the number of correct (zero through five) and 
returns a message to the user. If the user correctly answers five 
questions, print "Excellent"; if four, print"Very good"; if
three of fewer "Time to brush up on your knowledge of global 
warning," and include a list of some of the websites where you
found your facts.

 */

import java.util.Scanner;

public class cw4_5_GlobalWarmingFactQuiz {
    public static void main(String args[]) {
        int[] answer;
        answer = new int[5];
        int ans[] = { 1, 2, 1, 2, 4 };

        System.out.println("Mainly, Ozonoshphere is depleted by: ");
        System.out.printf("1) CFCs\n2) excess CO2\n3) ozone\n4) excess CO\n");
        Scanner input = new Scanner(System.in);
        answer[0] = input.nextInt();

        System.out.println("This is not a possible adverse effect of global wariming: ");
        System.out.printf("1) sea level rise\n2) an increase in UVB radiation\n");
        System.out.printf("3) retreat of glaciers\n4) extraordinary weather patterns\n");
        answer[1] = input.nextInt();

        System.out.println("Which of the following is not a major greenhouse gas: ");
        System.out.printf("1) ozone\n2) water vapour\n3) methane\n4) carbon dioxide\n");
        answer[2] = input.nextInt();

        System.out.println("Ultraviolet radiations from sunlight cause a reaction producing: ");
        System.out.printf("1) carbon monoxide\n2) ozone\n3) fluorides\n4) sulphur dioxide\n");
        answer[3] = input.nextInt();

        System.out.println("This process is functional in removing carbon dioxide from the atmosphere: ");
        System.out.printf("1) lightning\n2) deforestation\n3) burning of fossil fuels\n4) photosynthesis\n");
        answer[4] = input.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (answer[i] == ans[i]) {
                count++;
            }
        }
        if (count == 5) {
            System.out.println("Excellent");
        } else if (count == 4) {
            System.out.println("Very Good");
        } else {
            System.out.println("Time to brush up on your knowledge of global warning");
        }

    }
}