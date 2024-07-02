package app;

public class main {
    public static void main(String[] args) {
        // Дані для продукту №1 (смартфон)
        String product1 = "smartphone";
        int days1 = 5;
        double totalSales1 = 12153.41;
        double salesPerDay1 = 2430.68;

        // Дані для продукту №2 (ноутбук)
        String product2 = "laptop";
        int days2 = 7;
        double totalSales2 = 10486.85;
        double salesPerDay2 = 1498.12;

        // Виведення результатів у консоль у необхідному форматі
        System.out.println("Product No 1: " + product1 + ",");
        System.out.printf("Total sales for %d days is EUR %.2f,%n", days1, totalSales1);
        System.out.printf("Sales by day is EUR %.2f.%n", salesPerDay1);

        System.out.println("Product No 2: " + product2 + ",");
        System.out.printf("Total sales for %d days is EUR %.2f,%n", days2, totalSales2);
        System.out.printf("Sales by day is EUR %.2f.", salesPerDay2);
    }
}