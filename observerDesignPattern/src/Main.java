// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        StockGrabber publisher = new StockGrabber();
        stockObserver firstObserver = new stockObserver(publisher);
        stockObserver secondObserver = new stockObserver(publisher);

        publisher.setApplePrice(100);
//        publisher.unregister(firstObserver);
        publisher.setGooglePrice(50);


    }
}