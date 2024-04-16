public class SimpleObject {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("masdam", "tomatoes", "mushrooms");

        Salad salad = new Salad("mozarella", "cucumber", "beef","fruits");

        pizza.setSizeRange("small");

        pizza.calculatePrice();
        salad.calculatePrice();


        System.out.println(salad.calculatePrice());
        System.out.println(pizza.calculatePrice());
    }

}


