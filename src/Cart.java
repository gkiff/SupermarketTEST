import java.util.ArrayList;
public class Cart {
    int cartID;
    ArrayList<CartItems> items;
    public Cart(int cartID) {
        this.cartID = cartID;
        this.items = new ArrayList<CartItems>();
    }
    public int getID() {
        return this.cartID  ;
    }
    @Override
    public String toString() {
        return "Cart{ID=" + cartID + "}";
    }
}
