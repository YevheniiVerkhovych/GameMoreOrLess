import java.util.*;


    public class Controller {

        //Variables
        private Model model;
        private View view;

        // Constructor

        public Controller(Model model, View view) {
            this.model  = model;
            this.view   = view;
        }

        // The Work method

        public void processUser(){

            Scanner sc = new Scanner(System.in);

            setInitialBorders(sc);

            model.setSecretDigit();

            while (!model.checkUserAnswer(checkUserInput(sc)));

            view.printMessage(View.LIST_OF_PREVOUS_ATTEMPTS);

            view.printArray(model.getListOfUserAttempts());

            view.printMessage(view.CONGRATULATION + model.getValueOfSecretDigit());
        }

        // The Utility methods

        public void setInitialBorders(Scanner sc) {
            Integer inputDigit = null;
            view.printMessage(View.SET_RANGE_BOTTOM);

                while (!sc.hasNextInt()) {
                    view.printMessage(View.WRONG_INPUT);
                    sc.next();
                }

                model.setMinValue(sc.nextInt());
                view.printMessage(View.SET_RANGE_TOP);

                do {
                    if (inputDigit!=null)
                        view.printMessage(View.WRONG_INPUT);


                    while (!sc.hasNextInt()) {
                        view.printMessage(View.WRONG_INPUT);
                        sc.next();
                    }
                    inputDigit = sc.nextInt();
                }
                while (inputDigit - 2 < model.getMinValue());

                model.setMaxValue(inputDigit);
        }


        public int checkUserInput(Scanner sc) {
            Integer inputDigit=null;

            do {
                if (inputDigit!=null)
                    view.printMessage(View.WRONG_INPUT);

                    view.printMessage(View.INPUT_RANGE + model.getMinValue() + " to " + model.getMaxValue() + " : ");

                    while (!sc.hasNextInt()) {
                        view.printMessage(View.WRONG_INPUT);
                        sc.next();
                    }
                    inputDigit = sc.nextInt();

                } while (!((inputDigit > model.getMinValue()) && (inputDigit < model.getMaxValue())));

                if (inputDigit < model.getValueOfSecretDigit()) {model.setMinValue(inputDigit);
                } else {
                    model.setMinValue(inputDigit);
                }

            return inputDigit;
        }

    }





