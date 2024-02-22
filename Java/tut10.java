
// func overloading
// Two or more methods can have same name but different parameters.
// Such methods are called overload methods.
// <|Important note|> Method overloading cannot performed by changing the return type of the methods.

public class tut10 {

    static void joke() {
        System.out.println("I invented a new joke \n" + "Plagiarism");
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    static void rnd() {
        System.out.println("Good morning students.");
    }

    static void rnd(int a) {
        System.out.println("Good morning " + a + " Students");
    }

    public static void main(String args[]) {

        joke();

        int[] marks = { 5, 356, 76, 65, 55, 78 };
        change2(marks);
        System.out.println("The value of x after running change is " + marks[0]);
        // <|Important note|> Incase of arrays, the reference is passed. Same is the
        // case for object
        // passing to methods.

        // Method overlaoding :-

        rnd();
        rnd(10);

    }
}