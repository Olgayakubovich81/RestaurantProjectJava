public class Pizza extends Food{

    private String sizeRange;

    private int price;

    public String getSizeRange() {
        return sizeRange;
    }

    public void setSizeRange(String sizeRange) {
        this.sizeRange = sizeRange;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Pizza(String cheese, String vegetables, String sausage) {
        super(cheese, vegetables, sausage);
    }

    @Override
    public int calculatePrice() {
        if (sizeRange == "small") {
            price= 30;

                   }
        else if(sizeRange == "medium") {
            price= 45;
        }
        else {
            price=50;
        }
      return price;
    }
}
