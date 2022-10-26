package factory;
import factory.com.computer.*;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory fm = new OperatingSystemFactory();
        // For Rich people
        OS obj1 = fm.getInstance("rich");
        obj1.description();
        // For Poor people
        OS obj2 = fm.getInstance("poor");
        obj2.description();
        // For Confused people
        OS obj3 = fm.getInstance("");
        obj3.description();
    }
}
