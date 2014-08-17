package Bridge;

/**
 * Created by Sungho on 2014-08-18.
 */
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times) {
        open();
        for (int i=0; i < times; i++) {
            print();
        }
        close();
    }
}
