public class stockObserver implements Observer{
    private int observerID;
    private static int countsOfObservers;

    private  double ibmPrice;
    private  double applePrice;
    private  double gooPrice;


    private  Subject stockGrabber;
    public stockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        observerID = ++countsOfObservers;
        //TODO: remove coupling between observer and grabber
        stockGrabber.register(this);
    }

    public void update(double ibmPrice, double applePrice, double gooPrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.gooPrice = gooPrice;
        printThePrices();
    }

    private void printThePrices(){
        System.out.println(observerID);
        System.out.println("ibmPrice " +ibmPrice);
        System.out.println("applePrice " + applePrice);
        System.out.println("googlePrice " +gooPrice);
    }
}
