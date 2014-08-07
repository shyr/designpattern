package Builder;

/**
 * Created by Sungho on 2014-08-08.
 */
public class TextBuilder extends Builder{
    private StringBuffer buffer = new StringBuffer();
    public void makeTitle(String title) {
        buffer.append("======================");
        buffer.append("「" + title + "」\n");
        buffer.append("\n");
    }
    public void makeString(String str) {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
    }
    public void makeItems(String[] items) {
        for(int i=0; i < items.length; i++) {
            buffer.append(" ＊" + items[i] + "\n");
        }
        buffer.append("\n");
    }
    public void close() {
        buffer.append("===================\n");
    }
    public String getResult() {
        return buffer.toString();
    }
}
