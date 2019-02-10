import java.util.Scanner;


    public class Controller {

        // Constructor
        private Model model;
        private View view;
        private int[] rangeWithRequiredDigit = {1,100};
        private Integer[] listOfUserAttempts = new Integer[100];


        public Controller(Model model, View view) {
            this.model  = model;
            this.view   = view;
        }

        // The Work method
        public void processUser(){


            Scanner sc = new Scanner(System.in);

            checkUserInput(sc);

            view.printMessage(view.CONGRATULATION + model.getValue());


        }

        // The Utility methods

        public void checkUserInput(Scanner sc) {
            int inputDigit;
            int attemptNumber = 0;

            do {
               do {

                   if (attemptNumber != 0) {
                       view.printMessage(View.LIST_OF_PREVOUS_ATTEMPTS);
                       view.printArray(listOfUserAttempts);
                   }

                   view.printMessage(View.INPUT_RANGE + rangeWithRequiredDigit[0] + " - " + rangeWithRequiredDigit[1] + " : ");

                    while (!sc.hasNextInt()) {
                        view.printMessage(View.WRONG_INPUT);
                        sc.next();
                    }
                  inputDigit = sc.nextInt();

                } while ((inputDigit <= rangeWithRequiredDigit[0]) | (inputDigit >= rangeWithRequiredDigit[1]));

                if (inputDigit < model.getValue()) {rangeWithRequiredDigit[0]=inputDigit;}
                        else {rangeWithRequiredDigit[1]=inputDigit;}

                listOfUserAttempts[attemptNumber] = inputDigit;

                attemptNumber++;


            } while (!model.checkUserAnswer(inputDigit));

        }



    }





