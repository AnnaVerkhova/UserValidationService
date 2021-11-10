package UserValidationService;

public class UserValidationException {

    //Содержит сообщения с причинами ошибок.
    String firstName;
    static String lastName;
    int age;
    public static final int minLenghtFirstName = 3;
    public static final int maxLenghtFirstName = 15;
    public static final int minLenghtlastName = 3;
    public static final int maxLenghtlastName = 15;
    public static final int minAge = 0;
    public static final int maxAge = 120;

    public static void checkUserFirstName(String firstName) {
        System.out.println("You firstName is not correct!");
    }

    public static void checkUserLastName(String lastName) {
        System.out.println("You lastName is not correct!");
    }

    public static void checkUserAge(int age) {
        System.out.println("You age is not correct");

    }
}

