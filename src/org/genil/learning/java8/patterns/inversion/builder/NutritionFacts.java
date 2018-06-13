package org.genil.learning.java8.patterns.inversion.builder;

/**
 * Created by genil on 6/13/18 at 11 51
 **/
public class NutritionFacts {

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.sodium = builder.sodium;
        this.fat = builder.fat;
    }
    public static class Builder {

        private final int servingSize;
        private final int servings;

        //optional parameters
        private int fat = 0;
        private int sodium = 0;


        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }


    private  int servingSize;
    private  int servings;
    private int sodium;
    private int fat;


    public static void main(String[] args) {
        //Demo

        NutritionFacts cocoCola = new NutritionFacts.Builder(20,10).fat(0).sodium(20).build();
    }

}
