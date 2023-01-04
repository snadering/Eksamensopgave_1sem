public class Main {

    public static void main(String[] args) {
        PasswordValidater pv = new PasswordValidater(3, 10, true);
        PasswordValidater pv2 = new PasswordValidater(3, 10, false);

        System.out.println("Numbers required:");
        //Numbers required.
        System.out.println(pv.isValid("42")); // False
        System.out.println(pv.isValid("12345")); // False
        System.out.println(pv.isValid("HALLO")); // False
        System.out.println(pv.isValid("Hallo12")); // True
        System.out.println(pv.isValid("Hallo")); // False
        System.out.println(pv.isValid("HalloWorld123")); //False

        System.out.println("No numbers required:");
        //No numbers required.
        System.out.println(pv2.isValid("42")); // False
        System.out.println(pv2.isValid("12345")); // False
        System.out.println(pv2.isValid("HALLO")); // False
        System.out.println(pv2.isValid("Hallo12")); // True
        System.out.println(pv2.isValid("Hallo")); // True
        System.out.println(pv2.isValid("HalloWorld123")); // False



    }

}