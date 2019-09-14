import java.util.ArrayList;

public class Watchman implements Subject {

//    Class properties.
    private ArrayList<Observer> observers;
    private int warningNum;

    /**
     * This method is the default constructor for the Watchman class.
     */
    public Watchman() {
        observers = new ArrayList<>();
    }

    /**
     * This method adds an Observer object to an Array list labeled "observers."
     * @param observer is the Observer object that will be register.
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * This method removes an Observer object from an Array list labeled "observers."
     * @param observer is the Observer object that will be removed.
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * This method notifies all of the Observer objects in the array list about
     * the number of warnings issued.
     */
    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(warningNum);
        }
    }

    /**
     * This method assign an int value to the class property "warningNum";
     * then displays a unique message depending on the number of warnings issued.
     * @param warning is the int value to be checked and assigned to the class property
     *                "warningNum."
     */
    public void issueWarning(int warning) {
//        Assigns the int warning value to the class property "warningNum."
        this.warningNum = warning;

//        Checks if "warningNum" is either 1 or 2; otherwise the exit the method.
        if (warningNum == 1) {
            System.out.println("WARNING:  1 trumpet was played!");
        } else if (warningNum == 2){
            System.out.println("WARNING:  2 trumpets were played!");
        } else {
            return;
        }
    }
}
