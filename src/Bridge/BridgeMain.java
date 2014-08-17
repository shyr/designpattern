package Bridge;

/**
 * Created by Sungho on 2014-08-18.
 */
public class BridgeMain {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        d1.display();
        d2.display();
        d3.display();
    }
}
