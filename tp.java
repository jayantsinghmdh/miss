import java.util.*;

public class tp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tag = sc.nextLine().trim();

        if (isValidTag(tag)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

    private static boolean isValidTag(String tag) {
    
        if (tag.length() != 9 || tag.charAt(6) != '-') {
            return false;
        }

        
        String digits1 = tag.substring(0, 2);
        char letter = tag.charAt(2);
        String digits2 = tag.substring(3, 6);
        String digits3 = tag.substring(7, 9);

        if (!digits1.matches("[0-9]{2}") ||
            !digits2.matches("[0-9]{3}") ||
            !digits3.matches("[0-9]{2}")) {
            return false;

        if (!Character.isUpperCase(letter)) {
            return false;
        }
        String allDigits = digits1 + digits2 + digits3;
        for (int i = 0; i < allDigits.length() - 1; i++) {
            int sum = (allDigits.charAt(i) - '0') + (allDigits.charAt(i + 1) - '0');
            if (sum % 2 != 0) {
                return false;
            }
        }
        return true; 
    }
    }

