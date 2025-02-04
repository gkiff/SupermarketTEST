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
    boolean joinLine(Cart newCart){
        for(int i = 0; i < 20; i++){
            if(this.line[i] == null){
                this.line[i] = newCart;
                return true;
            }
        }
        return false;
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
    public Cart leaveLine(int n){// given in the stem
        Cart result = this.line[n];
        for (int i = n; i < 19; i++){
            this.line[i] = this.line[i + 1];
        }
        this.line[19] = null;
        return result;
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
