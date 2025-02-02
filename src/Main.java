public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Supermarket POS Line!");
        POSLine pl = new POSLine("ID1", true);
        Cart c1 = new Cart(1);
        pl.joinLine(c1);
        Cart c2 = new Cart(4);
        pl.joinLine(c2);
        Cart c3 = new Cart(99);
        pl.joinLine(c3);
        Cart c4 = new Cart(42);
        pl.joinLine(c4);

        pl.leaveLine(4);
        pl.printCart();
        System.out.println(pl.getNumOfCarts());
        // Hello World
    }
}
