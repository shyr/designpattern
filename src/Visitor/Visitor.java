package Visitor;

/**
 * Created by Sungho on 2014-08-29.
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
