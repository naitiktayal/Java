
public class string_methods_2 {
    public static void main(String[] args) {
        String name = "Harry";
        // System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Harry     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("r", "ier"));

        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("dd"));

        System.out.println(name.charAt(4));

        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry", 4));
        System.out.println(modifiedName.lastIndexOf("rry", 7));

        System.out.println(name.equals("Harry"));

        System.out.println(name.equalsIgnoreCase("HarRY"));

        System.out.println("I am escape sequence\tdouble quote");




    }
}

/*Class and Main Method The program defines a public class string_methods_2 with a main method, which is the entry point of the program.

String Operations

1. The program performs various operations on strings using different methods:

2. Length: name.length() returns the length of the string "Harry", which is 5.

3. ToLowercase and ToUppercase: name.toLowerCase() and name.toUpperCase() convert the string "Harry" to lowercase and uppercase, respectively.

4. Trim: nonTrimmedString.trim() removes leading and trailing whitespace characters from the string " Harry ", resulting in "Harry".

5. Substring: name.substring(1) returns a substring starting from the 1st index (inclusive) to the end of the string, which is "arry". name.substring(1, 5) returns a substring starting from the 1st index (inclusive) to the 5th index (exclusive), which is "arr".

6. Replace: name.replace('r', 'p') replaces all occurrences of the character 'r' with 'p', resulting in "Hapry". name.replace("r", "ier") replaces all occurrences of the substring "r" with "ier", resulting in "Haiery".

7. StartsWith and EndsWith: name.startsWith("Har") checks if the string starts with "Har", which is true. name.endsWith("dd") checks if the string ends with "dd", which is false.

8. CharAt: name.charAt(4) returns the character at the 4th index, which is 'y'.

9. IndexOf and LastIndexOf: modifiedName.indexOf("rry") returns the index of the first occurrence of the substring "rry", which is 5. modifiedName.indexOf("rry", 4) returns the index of the first occurrence of the substring "rry" starting from the 4th index, which is 5. modifiedName.lastIndexOf("rry", 7) returns the index of the last occurrence of the substring "rry" starting from the 7th index, which is 5.

10. Equals and EqualsIgnoreCase: name.equals("Harry") checks if the string is equal to "Harry", which is true. name.equalsIgnoreCase("HarRY") checks if the string is equal to "HarRY" ignoring case, which is true.

11. Escape Sequence The program also demonstrates an escape sequence \t in the string "I am escape sequence\tdouble quote", which represents a tab character.

    __Note that the program has duplicate code, which is not necessary. The second occurrence of the string_methods_2 class and its main method is redundant and can be removed.*/


