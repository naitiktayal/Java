public class String_method {
    public static void main(String[] args) {
        String str = "Hello World";

        int a = 5;
        System.out.println(a);
        //1.
        System.out.println(str.length()); // returns the length of the string
        //2.
        System.out.println(str.toUpperCase());
        //3.
        System.out.println(str.toLowerCase());
        //4.
        System.out.println(str.toCharArray());
        //5.
        System.out.println(str.substring(1,10));
        //6.
        System.out.println(str.substring(6));
        //7.
        System.out.println(str.replace("l","o"));
        //8.
        System.out.println(str.startsWith("Wo"));
        //9.
        System.out.println(str.endsWith("d"));
        //10.
        System.out.println(str.charAt(10));
        //11.
        System.out.println(str.indexOf("H"));
        //12.
        System.out.println(str.lastIndexOf("o"));
        //13.
        System.out.println(str.equals("Hello Word"));
        //14.
        System.out.println(str.equalsIgnoreCase("hello world"));
        //15.
        System.out.println(str.concat(" Java"));
        //16.
        System.out.println(str.contains("World"));
        //17.
        System.out.println(str.isEmpty());
        //18.
        System.out.println(str.codePointBefore(3));
        //19.
        System.out.println(str.codePointCount(0,10));
        //20.
        System.out.println(str.compareTo("Hello World"));
        //21.
        System.out.println(str.compareToIgnoreCase("hello world"));
        
    }
}
