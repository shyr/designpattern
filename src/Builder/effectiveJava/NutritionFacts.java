package Builder.effectiveJava;

/**
 * Created by Naver on 2014-08-11.
 */
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // 필수 매개변수들
        private final int servingSize;
        private final int servings;

        // 선택 매개변수들 - 디폴트 값으로 초기화한다
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            fat = val;
            return this;
        }

        public NutritionFacts build() throws IllegalStateException {
            // 여기서 초기화 또는 불변규칙이 완료되었는지 검사할 수 있다.
            return new NutritionFacts(this);
        }
    }

    public NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString(){
        return "servingSize:"+servingSize+", serving:"+servings+", calories:"+calories+", fat:"+fat+", sodium:"+sodium+", carbohydrate:"+carbohydrate;
    }
}
