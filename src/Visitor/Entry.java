package Visitor;

public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    // protected abstract void printList(String prefix);

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    /*public void printList(){
        printList("");
    }*/
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
