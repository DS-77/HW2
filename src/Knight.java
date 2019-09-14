public class Knight implements Observer {
//    Class properties.
    private Subject watchman;

    /**
     * This method is the default constructor for the Knight class.
     * @param watchman is the Subject Object to be observed.
     */
    public Knight(Subject watchman) {
        this.watchman = watchman;
    }

    /**
     * This method displays a unique message depending on the number of warnings issued.
     * @param warning is the int value to represent the waning level given.
     */
    @Override
    public void update(int warning) {
        if (warning == 1) {
            System.out.println("Knight: Helps everyone get home safe");
        } else if (warning == 2) {
            System.out.println("Knight: Prepares for battle");
        } else {
            return;
        }
    }
}
