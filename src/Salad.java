public class Salad extends Food {

    private String saladType;
    private int price;


    public Salad(String cheese, String vegetables, String sausage, String saladType) {
        super(cheese, vegetables, sausage);
        this.saladType=saladType;
    }

    @Override
    public int calculatePrice() {
        if (saladType.equals("vegetables")) {
            return 30;
        }
        return 20;


    }
}
