package Composite;

public class File extends Entry{
    public String name;
    public int size;

    @Override public String getName() {
        return name;
    }
    @Override public int getSize() {
        return size;
    }
    @Override protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
}
