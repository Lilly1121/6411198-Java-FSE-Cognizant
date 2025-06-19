public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStockPrice(1500.75);
        market.setStockPrice(1580.20);

        market.removeObserver(mobile);
        market.setStockPrice(1625.60);
    }
}
