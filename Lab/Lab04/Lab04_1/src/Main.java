public class Main {
    public static void main(String[] args) throws Exception {
        Stock stock = new Stock("ORCL","Oracle Coperation");
        stock.setpreviousClosingPrice(34.5);
        stock.setcurrentPrice(34.35);
        System.out.println("Symbol: "+stock.symbol);
        System.out.println("Name: "+stock.name);
        System.out.println("Previous Closing Price: "+stock.previousClosingPrice);
        System.out.println("Current Price: "+stock.currentPrice);
        System.out.println("Price Change: "+stock.getChangePercent());
    }
}
