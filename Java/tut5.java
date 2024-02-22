public class tut5 {
    public static void main(String args[]) {

        String name = "Harry";

        System.out.println(name.length());

        int value = name.length(); // .length func returns the length() of the string.
                                   // The number of letters in the string.

        System.out.println(value);

        String name2 = "JErrY";

        System.out.println(name2.toLowerCase());

        String value2 = name2.toLowerCase(); // .toLowerCase func converts all the uppercase
                                             // letters to lowercase letters.

        System.out.println(value2);

        String name3 = "jerry";

        System.out.println(name3.toUpperCase());

        String value3 = name3.toUpperCase(); // .toUpperCase func converts all the lowercase
                                             // letters to uppercase letters.

        System.out.println(value3);

        String newname = "   hello    ";

        System.out.println(newname);

        System.out.println(newname.trim());

        String newvalue = newname.trim(); // .trim func removes the whitespace which is before a word.

        System.out.println(newvalue);

        System.out.println(name.substring(2));
        // .substring func returns the including character and the ones
        // succeeding the number of index you have written in the func.

        System.out.println(name.substring(2, 4));
        // When you provide two numbers it begins with the starting index you
        // provided
        // but excludes the last index given. So if you want to include the last
        // character in the
        // output you need to enter the index number succeeding the number of the last
        // character.

        System.out.println(name.replace('r', 'p'));
        // in .replace func when you enter a letter to be replaced with a new letter
        // all the
        // letters of same type are replaced with the new one.

        System.out.println(name.replace("rry", "ier"));
        // If you use double quote you can change n number of letters in a string.

        System.out.println(name.replace("rry", "nd"));
        // You can do it in this way too.

        System.out.println(name.replace("r", "and"));
        // When you enter only one letter for replacement all the letters of same type
        // will
        // be changed to its replacement provided. In this case the letter "r"
        // appears twice in our string so all the "r" are replaced with the replacement
        // provided
        // "and".

        System.out.println(name.startsWith("Har"));

        System.out.println(name.endsWith("ry"));
        // The .startsWith() and .endsWith() funcs returns boolean values.
        // Here our string starts with "Har" hence it will return "true" in the terminal
        // and same
        // for the .endsWith() func. If one of the condition is false then it will
        // simply return
        // "false" in the terminal for the respective condition.

        System.out.println(name.charAt(2));
        // .charAt() func returns the character at the provided index.

        String modifiedname = "Harryrry";

        System.out.println(modifiedname.lastIndexOf("r"));
        // .lastIndexOf() func returns the last index number of a character where it
        // appears.
        // In this case the letter 'r' appears for the last time at the index 6, hence
        // the output will
        // be 6. For if we provide the char as 'a' it will return the index number as 2
        // where it appears.

        System.out.println(name.equals("Harry"));
        System.out.println(name.equals("harry"));
        // The func .equals() compares the string with the provided string, if the
        // provided string has
        // any one character from the provided string does not match with the original
        // string then
        // the func returns "false" in the terminal.

        System.out.println(name.equalsIgnoreCase("hARry"));
        // For .equalsIgnoreCase() func it checks only the characters irrespective of
        // their cases.
        // It does not matter whether the cases of the respective characters matches or
        // not as long as
        // the entered string has the same characters as that of the original string.

    }

}