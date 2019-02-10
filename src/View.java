public class View {
        Integer[] listOfUserAttempts;

        // Text's constants
        public static final String INPUT_RANGE = "Please, input digit between next values ";
        public static final String LIST_OF_PREVOUS_ATTEMPTS = "Your previous attempt(s): ";
        public static final String CONGRATULATION = "You have guessed the digit!!! Yes, it was: ";
        public static final String WRONG_INPUT = "Wrong input! Try again.";

        public void printMessage(String message){
            System.out.println(message);
        }
        public void printArray(Integer[] listOfUserAttempts){
                StringBuilder list = new StringBuilder();
                this.listOfUserAttempts = listOfUserAttempts;
                for (Integer attempts : listOfUserAttempts)
                        if (attempts!= null)    list.append(attempts + " ");
                System.out.println(list);
        }

}
