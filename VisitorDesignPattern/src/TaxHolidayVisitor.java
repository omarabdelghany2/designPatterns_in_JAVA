import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor{
    @Override
    public double visit(Liquor liquoritem) {
        DecimalFormat df =new DecimalFormat("#.##");
        System.out.println("LiquorItem Price with taxess is :");

        return (Double.parseDouble(df.format(liquoritem.getPrice()*0.10)));
    }

    @Override
    public double visit(Tobacco tobacoItem) {
        DecimalFormat df =new DecimalFormat("#.##");
        System.out.println("tobacoItem Price with taxess is :");

        return (Double.parseDouble(df.format(tobacoItem.getPrice()*0.30)));
    }

    @Override
    public double visit(Necessity neccisityItem) {
        DecimalFormat df =new DecimalFormat("#.##");
        System.out.println("neccisityItem Price with taxess is :");

        return (Double.parseDouble(df.format(neccisityItem.getPrice())));
    }
}
