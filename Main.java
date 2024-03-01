public class Sigma {
    private static final String specialSymbols = ",.:;-=+@";
    static boolean validatepass(String passwordtovalidate){
        if (passwordtovalidate == null ||
                passwordtovalidate.length() < 8) {
            return false;
    }
        int upper = 0;
        int lower = 0;
        int digits = 0;
        int special = 0;
        for (int i = 0; i < passwordtovalidate.length(); i++){
            char ch = passwordtovalidate.charAt(i);
            if(Character.isDigit(ch)) digits++;
            if(Character.isUpperCase(ch)) upper++;
            if(Character.isLowerCase(ch)) lower++;
            if(specialSymbols.contains(ch+ ""));
        }
        if (lower < 1){
            System.out.println("Password" +
                    " must contain at" +
                    " least one lowercase letter");
            return false;

        }
        if (upper < 1){
            System.out.println("Password" +
                    " must contain at" +
                    " least one uppercase letter");
            return false;

        }
        if (digits < 1){
            System.out.println("Password" +
                    " must contain at" +
                    " least one digit letter");
            return false;


        }
        if (special  < 1){
            System.out.println("Password" +
                    " must contain at" +
                    " least one special letter");
            return false;

        }

    }

