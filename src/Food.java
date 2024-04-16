//Поля для класса Food и Salade /Pizza  придумываем сами (нужны конструктор геттры сеттеры)
//        Food нельзя создать  - объект
//        Если пицца большая - цена 50 / средняя - 45 / маленькая 30
//        Салат из овощей - 30 / фруктов 20


public abstract class Food implements PriceSet {
    private String cheese;
    private String vegetables;
    private String sausage;
    private int price;

    protected Food(String cheese, String vegetables, String sausage) {
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.sausage = sausage;
    }


    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getSausage() {
        return sausage;
    }

    public void setSausage(String sausage) {
        this.sausage = sausage;
    }
}
