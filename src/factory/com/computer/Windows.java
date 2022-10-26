package factory.com.computer;

public class Windows implements OS {
    @Override
    public void description() {
        System.out.println("This is windows and use me if you are not rich like Bill Gates");
    }
}
