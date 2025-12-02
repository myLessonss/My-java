package stock;
public class StockCalculationImplementation implements StockCalculations{

    @Override
    public double calculateVat(double turnoverAmount) {
        double vat=(turnoverAmount*18/100);
        return vat;
    }

    @Override
    public double markupProfit(double sellingPrice, double buyingPrice) {
        double markup=sellingPrice-buyingPrice;
        return markup;
    }

    @Override
    public double totalStockValue(int quantity, double sellingPrice) {
        double value=quantity*sellingPrice;
        return value;
    }

    @Override
    public double restockingFee(double buyingPrice) {
        double restock=buyingPrice*5/100;
        return restock;
    }



    
}
