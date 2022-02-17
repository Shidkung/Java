public class Stock{
    private String symbol;
    private String name;

    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {

        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void previousClosingPrice(double previouscurrentPrice) {
        this.previousClosingPrice = previouscurrentPrice;
        
    }

    
    public void setCurrentPrice(double currentPrice) {
    
        this.currentPrice = currentPrice;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getChangePercent() {
        return (this.currentPrice - this.previousClosingPrice) * 100 / this.previousClosingPrice;
    }
}
