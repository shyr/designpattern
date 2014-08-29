package Composite.wiki;

/**
 * Created by Sungho on 2014-08-25.
 */
import java.util.List;
import java.util.ArrayList;

/** "Component" */
interface Graphic {

    // 그래픽을 출력함
    public void print();

}

/** "Composite" */
class CompositeGraphic implements Graphic {

    // 자식 그래픽들의 컬렉션
    private List<Graphic> mChildGraphics = new ArrayList<Graphic>();

    // 그래픽을 출력함
    @Override public void print() {
        for (Graphic graphic : mChildGraphics) {
            graphic.print();
        }
    }

    // 해당 그래픽을 컬렉션에 추가함
    public void add(Graphic graphic) {
        mChildGraphics.add(graphic);
    }

    // 해당 그래픽을 컬렉션에서 제거함
    public void remove(Graphic graphic) {
        mChildGraphics.remove(graphic);
    }

}


/** "Leaf" */
class Ellipse implements Graphic {

    // 그래픽을 출력함
    public void print() {
        System.out.println("Ellipse");
    }

}


/** Client */
public class CompositeProgram {

    public static void main(String[] args) {
        // 4개의 ellipses 객체를 초기화함
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        // 3개의 composite 그래픽들을 초기화함
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        // 그래픽들을 구성함
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);

        // 전체 그래픽들을 출력함("Ellipse"가 4번 출력됨)
        graphic.print();
    }
}
