public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }


    public int cutAverage() {
        SalesManager salesManager = new SalesManager(sales);
        int cutAverage = (salesManager.sum() - salesManager.max() - salesManager.min()) / (sales.length - 2);
        return cutAverage;
    }

}




