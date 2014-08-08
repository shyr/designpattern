package Singleton;

public class SingletonMain {
    public static void main(String[] args){
        System.out.println("Start.");
//        Singleton1 obj1 = Singleton1.getInstance();
//        Singleton1 obj2 = Singleton1.getInstance();
        Singleton6 obj1 = Singleton6.INSTANCE;
        Singleton6 obj2 = Singleton6.INSTANCE;
        if (obj1 == obj2) {
            System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
        } else {
            System.out.println("obj1과 obj2는 다른 인스턴스입니다.");
        }
        System.out.println("End.");
    }
}
