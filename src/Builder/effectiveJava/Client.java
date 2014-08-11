package Builder.effectiveJava;

/**
 * Created by Naver on 2014-08-11.
 */
public class Client {
    public static void main(String[] args) {
        NutritionFacts cocoalCola = new NutritionFacts.Builder(240,8).calories(100).sodium(35).carbohydrate(27).build();

        System.out.println(cocoalCola);
    }
}
