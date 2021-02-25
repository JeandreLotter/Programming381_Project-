package Business_Logic_Layer;

/**
 * Person
 */
public abstract class Person {

    String fName, lName, contactNum, password, NotifyMssge;
    Boolean notify;

    public abstract void notifyUser();
}