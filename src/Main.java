public class Main {
    public static void main(String[] args) {
        long[] sales = {500, 1000, 2000};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());


    }
}