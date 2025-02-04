public class POSLine {
    String id;
    boolean active;
    Cart[] line;
    int numOfCarts;
    public POSLine(String id, boolean active) {
        this.id = id;
        this.active = active;
        this.line = new Cart[20];
        this.numOfCarts = 0;
    }
    public Cart getLine(int n){
        return this.line[n];
    }
    void joinLine(Cart newCart){
        boolean placed = false;
        for(int i = 0; i < this.numOfCarts; i++){
            if(this.line[i] == null){
                this.line[i] = newCart;
                placed = true;
            }
        }
        if(!placed){
            System.out.println(this.id + " can't be placed");
        }
    }
    public void checkoutCart(){
        line[0] = null;
    }
    public void printCart(){
        for (int i = 0; i < numOfCarts; i++){
            if (line[i] != null){
                System.out.println(line[i].toString());
            }
        }
    }
    public Cart leaveLine(int ID){
        for(int i = 0; i < this.numOfCarts; i++)
            if (this.line[i].getID() == ID) {
                Cart leavingCart = this.line[i];
                this.line[i] = null;
                return leavingCart;
            }
        return null;
    }
    public int getNumOfCarts(){
        return this.numOfCarts;
    }
    public String getId(){
        return this.id;
    }
    public String getID(){
        return this.id;
    }
}
