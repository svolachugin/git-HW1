public class Main {
    public static void main(String[] args) {
        int[] sales = {500, 1000, 3, 5000, 1, 0, 0, 2000};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());
        System.out.println(salesManager.sum());
        System.out.println(salesManager.cutAverage());


    }
}
