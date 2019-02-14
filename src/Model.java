import java.util.ArrayList;
import java.util.Random;

public class Model {

    private  int minValue;
    private  int maxValue;
    private  int userInputValue;
    private  int digitToFind;
    private ArrayList<Integer> listOfUserAttempts = new ArrayList<>();

    Random rand = new Random();


    // Constructor

    public int getValueOfSecretDigit() {
        return digitToFind;
    }

    public ArrayList<Integer> getListOfUserAttempts() {
        return listOfUserAttempts;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }


    //methods

    public void setSecretDigit() {
        digitToFind = rand.nextInt(((maxValue - 1) - (minValue + 1)) + 1 ) + (minValue + 1);
    }

    public boolean checkUserAnswer(int userInputValue) {

       this.userInputValue = userInputValue;

        listOfUserAttempts.add(userInputValue);

        if (userInputValue == digitToFind) return true;

        return false;
    }


}
