package factory.com.computer;

public class OperatingSystemFactory{
    public OS getInstance(String desc){
        if (desc.equals("rich")) return new MacOs();
        else if (desc.equals("poor")) return new Windows();
        else return new Chrome();
    }
}
