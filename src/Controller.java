import java.util.*;


    public class Controller implements RangeValues{

        //Variables
        private Model model;
        private View view;
        private int[] rangeWithRequiredDigit = {minValue-1,maxValue+1};
        private int attemptNumber = 0;
        private ArrayList<Integer> listOfUserAttempts = new ArrayList<>();

        // Constructor

        public Controller(Model model, View view) {
            this.model  = model;
            this.view   = view;
        }

        // The Work method

        public void processUser(){

            Scanner sc = new Scanner(System.in);

            while (!model.checkUserAnswer(checkUserInput(sc)));

            view.printMessage(view.CONGRATULATION + model.getValue());
        }

        // The Utility methods

        public int checkUserInput(Scanner sc) {
            int inputDigit;

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

                } while (!((inputDigit > rangeWithRequiredDigit[0]) && (inputDigit < rangeWithRequiredDigit[1])));

                if (inputDigit < model.getValue()) {rangeWithRequiredDigit[0]=inputDigit;
                } else {
                    rangeWithRequiredDigit[1]=inputDigit;
                }

                listOfUserAttempts.add(inputDigit);

                attemptNumber++;

            return inputDigit;
        }



    }





