public class Liquor implements Visitable{
    public Liquor(double price) {
        this.price = price;
    }

    private double price ;
    public double getPrice() {
        return price;
    }



    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
