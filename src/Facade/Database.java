package Facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Sungho on 2014-09-01.
 */
public class Database {
    private Database() {}   // new에서 인스턴스 생성을 막음

    // 데이터베이스 이름에서 Properties를 얻는다
    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e){
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
