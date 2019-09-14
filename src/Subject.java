public interface Subject {

    /**
     * This method will be implement by the children class that implements this interface.
     * @param observer is the Observer object that will be register.
     */
    public void registerObserver(Observer observer);

    /**
     * This method will be implement by the children class that implements this interface.
     * @param observer is the Observer object that will be removed.
     */
    public void removeObserver(Observer observer);

    /**
     * This method will notify all observers of changes that occur on the
     * children object classes that implements this class.
     */
    public void notifyObserver();
}
