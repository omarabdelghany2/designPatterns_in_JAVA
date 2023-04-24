public class Tobacco implements Visitable{
    public Tobacco(double price) {
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
