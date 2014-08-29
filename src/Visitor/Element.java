package Visitor;

/**
 * Created by Sungho on 2014-08-29.
 */
public interface Element {
    public abstract void accept (Visitor v);
}
