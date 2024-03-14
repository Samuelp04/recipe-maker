public class Recipe {
    public class Recipe {
        //instance variables
        private String name;
        private String meal;
        private String culture;
        private String ingredients;
        private String allergies;

        /**
         * This is my value contructor below, but right now
         * it doesn't have any parameters, because I'm not 100% sure how I want it
         * to behave, just yet, or if I want more than one value constructor, which is most likely.
         * public Recipe(String name, String meal, String culture, String Allergies) Maybe.
         */
        public Recipe() {
            this.name = name;
            this.meal =meal;
            this.culture = culture;
            this.ingredients = ingredients;
            this.allergies = allergies;

        }

    /*
    We have getters and setters, because we might need some data changed by the
    user or maybe by us. Either way I have included setters in case we need them.
     */

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getMeal() {
            return meal;
        }

        public void setMeal(String meal) {
            this.meal = meal;
        }

        public String getCulture() {
            return culture;
        }

        public void setCulture(String culture) {
            this.culture = culture;
        }

        public String getIngredients() {
            return ingredients;
        }

        public void setIngredients(String ingredients) {
            this.ingredients = ingredients;
        }

        public String getAllergies() {
            return allergies;
        }

        public void setAllergies(String allergies) {
            this.allergies = allergies;
        }



    }
}
