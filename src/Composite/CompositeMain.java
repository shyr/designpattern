package Composite;


/**
 * Created by Sungho on 2014-08-25.
 */
public class CompositeMain {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add((new File("latex", 20000)));
            rootdir.printList();

            System.out.println(" ");
            System.out.println("Making user entries...");
            Directory Kim = new Directory("Kim");
            Directory Lee = new Directory("Lee");
            Directory Moon = new Directory("Moon");
            usrdir.add(Kim);
            usrdir.add(Lee);
            usrdir.add(Moon);
            Kim.add(new File("diary.html", 1000));
            Kim.add(new File("Composite.java", 200));
            Lee.add(new File("memo.text", 300));
            Moon.add(new File("game.doc", 400));
            Moon.add(new File("junk.mail", 500));

            rootdir.printList();
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
