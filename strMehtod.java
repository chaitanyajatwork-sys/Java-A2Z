import java.util.*;

public class strMehtod {
    public static void main(String[] args) {
        String a= "Chaitanya Jain";
        System.out.println("String methods below:");
        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.trim());
        System.out.println(a.substring(4));
        System.out.println(a.substring(4,11 ));
        System.out.println(a.replace('a','x'));
        System.out.println(a.startsWith("Ch"));
        System.out.println(a.endsWith("Nm"));
        System.out.println(a.charAt(4));
        System.out.println(a.indexOf("a"));
        System.out.println(a.indexOf("a", 3));
        System.out.println(a.lastIndexOf("a"));
        System.out.println(a.equals("Chaitanya Jain"));
        System.out.println(a.equalsIgnoreCase("chaitanya jain"));
    }

    
}
