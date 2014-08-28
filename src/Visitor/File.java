package Visitor;

public class File extends Entry {
    public String name;
    public int size;

    @Override public String getName() {
        return name;
    }
    @Override public int getSize() {
        return size;
    }

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    /*@Override protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }*/
}
