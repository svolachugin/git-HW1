public class Main {
    public static void main(String[] args) {
        long[] sales = {500, 1000, 2000, 0, 0, 6, 18, 158000, 376};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());
        System.out.println(salesManager.sum());
        System.out.println(salesManager.cutAverage());


    }
}