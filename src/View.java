import java.util.ArrayList;

public class View {

        // Text's constants
        public static final String SET_RANGE_BOTTOM = "Please, set value of bottom border: ";
        public static final String SET_RANGE_TOP = "Please, set value of top border: ";

        public static final String INPUT_RANGE = "Please, input digit within next range: ";
        public static final String LIST_OF_PREVOUS_ATTEMPTS = "Your previous attempt(s): ";
        public static final String CONGRATULATION = "You have guessed the digit!!! Yes, it was: ";
        public static final String WRONG_INPUT = "Wrong input! Try again.";

       //Methods

        public void printMessage(String message){
            System.out.println(message);
        }

        public void printArray(ArrayList<Integer> listOfUserAttempts){
                StringBuilder list = new StringBuilder();

                for (Integer number : listOfUserAttempts) {
                        list.append(number.toString() + " ");
                }

                System.out.println(list);
        }

}
