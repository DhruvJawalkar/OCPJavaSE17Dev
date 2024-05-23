package section15.beyond_classes;

public class Store {
    abstract class Sale {
        abstract int discount();
    }
    public int newPrice(int oldPrice) {
        Sale sale = new Sale () {
            int discount() { return 2; }
        };
        return oldPrice - sale.discount();
    }
}

// exam trick: "empty interface"
class Dog {
    interface Eats {};
    //Eats eating = new Eats{};
}
// eating is not an instance of the interface (not allowed!),
// but the instance of the anonymous class {}; implementing the interface