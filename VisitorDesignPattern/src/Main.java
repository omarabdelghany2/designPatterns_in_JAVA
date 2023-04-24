// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        TaxVisitor taxVisitor =new TaxVisitor();
        TaxHolidayVisitor taxHolidayVisitor=new TaxHolidayVisitor();

        Necessity milk =new Necessity(3.47);
        Liquor vodka =new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);
        System.out.println(milk.accept(taxVisitor));
        System.out.println(vodka.accept(taxVisitor));
        System.out.println(cigars.accept(taxVisitor));

        System.out.println(milk.accept(taxHolidayVisitor));
        System.out.println(vodka.accept(taxHolidayVisitor));
        System.out.println(cigars.accept(taxHolidayVisitor));
    }
}