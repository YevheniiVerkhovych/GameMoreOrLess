import java.util.Random;

public class Model {

    Random rand = new Random();

    private int digitToFind = rand.nextInt(100) + 1;
    int userInputValue;


    // Constructor


    public int getValue() {
        return digitToFind;
    }

    //main method

    public boolean checkUserAnswer(int userInputValue) {

       this.userInputValue = userInputValue;

        if (userInputValue == digitToFind) return true;
        return false;
    }
}
