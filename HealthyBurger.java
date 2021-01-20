public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye roll");
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }
    // REVIEW: the Override Method called. the super.itemizehamburger() is NOW passed into the local variable.
    // double hamburgerPrice = super.itemizehamburger(); handles the price of the burger after/if additional items are added from the Parent Class.
    // before taking into account additional items from the "Healthy Burger" Class.
    @Override
    public double itemizehamburger() {
        double totalPrice = super.itemizehamburger();
        if(healthyExtra1Name != null){
            totalPrice +=healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if(healthyExtra2Name != null){
            totalPrice +=healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + "for an extra " + this.healthyExtra2Price);
        }
        return totalPrice;
    }
}
