import java.util.ArrayList;

public class StockGrabber implements Subject{

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private ArrayList <Observer> observers;


    public StockGrabber(){
        observers = new ArrayList<>();
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyAllobservers();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyAllobservers();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyAllobservers();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int index=observers.indexOf(o);
        System.out.println("observer :"+index+"is deleted");
        observers.remove(index);
    }

    @Override
    public void notifyAllobservers() {
        for(Observer observer :observers) {
            observer.update(ibmPrice,applePrice,googlePrice);
        }
    }

}
