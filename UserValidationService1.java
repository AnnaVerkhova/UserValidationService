package UserValidationService;

public class UserValidationService1 {
    public static void main(String[] args) {
        //Минимальная длина имени / фамилии пользователя - 3 символа;
        //Максимальная длина имени / фамилии пользователя - 15 символов;
        //Допустимый возраст пользователя: от 0 до 120 лет включительно;
        String firstName;
        String lastName;
        int age;
        public static final int minLenghtFirstName = 3;
        public static final int maxLenghtFirstName = 15;
        public static final int minLenghtlastName = 3;
        public static final int maxLenghtlastName = 15;
        public static final int minAge = 0;
        public static final int maxAge = 120;

        UserValidationException exception = new UserValidationException();
        if ((firstName.length() <= minLenghtFirstName && (firstName.length() >= maxLenghtFirstName))) {
            UserValidationException.checkUserFirstName(String firstName);
        }
        if ((lastName.length() >= minLenghtlastName && (lastName.length() >= maxLenghtlastName))) {
            UserValidationException.checkUserLastName(String lastName);
        }
        if ((age <= minAge && age >= maxAge)) {
            UserValidationException.checkUserAge( int age);
        }
    }
}


