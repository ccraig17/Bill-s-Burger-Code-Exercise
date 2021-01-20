public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat,  double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " with " + this.meat + ", price " + this.price);
    }
    //Create 5 Methods; 4 Methods for handling the additional items added to the burger.
    // Method names should reflect the fields (in the class) and purpose.
    // When these Methods are called, the name of the item being added and the price is added to the object.
    // the addition is the passed on to the 5th Method to
    // determine: 1. IF an additional item was added with a price.
    // determine 2: the final price of the burger with/without additional items added.
    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }
    //Create 5th Method to handle the additions of items and prices added to the burger and which is changed in Hamburger Price (new local variable created).
    // new (local) variable created to assume the change in price as the price of the new items are added to the original price of the burger.
    //Method name to reflect what's taking place. Method Name "itemizehamburger."
    public double itemizehamburger(){
        // new(local) variable to handle the change in price as new items are added.
        // IF NO ITEMS are added, them hamburger price will equal the standard/original price.
        double totalPrice = this.price;
        System.out.println("Added " + addition1Name + " for and extra " + addition1Price);
        if(addition1Name !=null) {
        totalPrice += addition1Price;
        }
        if(addition2Name !=null){
            totalPrice +=addition2Price;
            System.out.println("Added " + addition2Name + " for and extra " + addition2Price);
        }
        if(addition3Name !=null){
            totalPrice +=addition3Price;
            System.out.println("Added " + addition3Name + " for and extra " + addition3Price);
        }
        if(addition4Name !=null){
            totalPrice +=addition4Price;
            System.out.println("Added " + addition4Name + "for and extra " + addition4Price);
        }
        return totalPrice;
    }
}
