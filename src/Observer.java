public interface Observer {

    /**
     * This method will be implement by the children classes.
     * @param warning is the int value to represent the waning level given.
     */
    void update(int warning);
}
