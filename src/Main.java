public class Main {
    public static void main(String[] args) {
        Base basic = new Base(new Bread_Normal(20));
        basic.addIngredient(new Onion(4));
        basic.addIngredient(new Tomato(4));

        System.out.println("This burger: " + basic.getClass().getSimpleName() +
                            " has " + basic.getBurgerPrice() +
                            "\nIngredients used are: " + basic.getBread() +
                            "\n" + basic.getAd_1() +
                            "\n" + basic.getAd_2() +
                            "\n" + basic.getAd_3() +
                            "\n" + basic.getAd_4() +
                            "\nPrice is: " + basic.getBurgerPrice() + "\n\n");

        Base healthy = new Healthy(20);
        System.out.println("This burger: " + healthy.getClass().getSimpleName() +
                " has " + healthy.getBurgerPrice() +
                "\nIngredients used are: " + healthy.getBread() +
                "\n" + healthy.getAd_1() +
                "\n" + healthy.getAd_2() +
                "\n" + healthy.getAd_3() +
                "\n" + healthy.getAd_4() +
                "\nPrice is: " + healthy.getBurgerPrice());

    }
}
