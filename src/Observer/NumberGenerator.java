package Observer;

import java.util.ArrayList;
import java.util.Iterator;

/** Subject */
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();
    // 옵저버 등록
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    // 옵저버 제거
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator it = observers.iterator();      
        while (it.hasNext()) {                 
            Observer o = (Observer)it.next();  
            o.update(this);     // notify
        }
    }

    // subject의 상태 반환
    public abstract int getNumber();
    public abstract void execute();
}
