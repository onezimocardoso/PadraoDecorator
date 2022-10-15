package cafeteria;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        /*Beverage cafe = new HouseBlend();
        CondimentDecorator beverage;
        beverage = new Soy(cafe); */

        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription()
        +" $ "+beverage.cost());
    }
}
