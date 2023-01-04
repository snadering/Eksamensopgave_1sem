public class PasswordValidater {

    private int minLength;
    private int maxLength;
    private boolean numbersRequired;

    public PasswordValidater(int minLength, int maxLength, boolean numbersRequired) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numbersRequired = numbersRequired;
    }

    public boolean isValid(String password) {
        //Checking if passwords has the right length.
        if (password.length() < minLength || password.length() > maxLength) {
            return false;
        }
        //Checking if password has both upper- and lowercase.
        if (!hasUpperAndLowerCase(password)) {
            return false;
        }
            //If password needs numbers, then check if the passwords contains any.
        if (!numbersRequired) {
            return true;
        }
        return hasNumbers(password);
    }

    private boolean hasUpperAndLowerCase(String password){
        boolean isUpper = false;
        boolean isLower = false;

        for (int i = 0; i < password.length(); i++) {
            //Checking if password has uppercase letters.
            if (Character.isUpperCase(password.charAt(i))) {
                isUpper = true;
            }
            //Checking if password has lowercase letters.
            if (Character.isLowerCase(password.charAt(i))) {
                isLower = true;
            }
        }
        return isUpper && isLower;
    }

    private boolean hasNumbers(String password){
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                //If it did, returning true
                return true;
            }
        }
        return false;
    }

}
