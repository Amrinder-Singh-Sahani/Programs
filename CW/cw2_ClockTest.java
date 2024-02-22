// Question 3 :- Create a class called Clock that includes three
// instance vaiables -- an hour(int), a minute(int) and a second(int).
// Provide a constructor that initializes the three instance variables
// and assumes that the values provided are correct. Provide a set and
// a get method for each instance variable. The set method should set the 
// value of all three variables to 0 if the value of hour is more than
// 23, the value of minute is more than 59 and the value of second is more than
// 59. Provide a method displayTime that display the time in an
// "hh:mm:ss" format. Write a test app named ClockTest that 
// demonstrates class Clock's capabilities.

class clock {
    int hour, minute, second;

    clock() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    void sethour(int hour) {
        if (hour > 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    void setminute(int minute) {
        if (minute > 59) {
            this.minute = 0;

        } else {
            this.minute = minute;
        }
    }

    void setsecond(int second) {
        if (second > 59) {
            this.second = 0;

        } else {
            this.second = second;
        }
    }

    int gethour() {
        return hour;
    }

    int getminute() {
        return hour;
    }

    int getsecond() {
        return second;
    }

    void displayTime() {
        System.out.printf("%d:%d:%d", hour, minute, second);
    }

}

public class cw2_ClockTest {
    public static void main(String args[]) {

        clock time = new clock();
        time.sethour(4);
        time.setminute(45);
        time.setsecond(33);
        time.displayTime();
    }
}