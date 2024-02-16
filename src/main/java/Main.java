import ru.netology.HomeWorkArrays.services.StatsService;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 4, 14, 18
        };
        System.out.println(service.sumSales(sales));
        System.out.println(service.averageSumSales(sales));
        System.out.println(service.maxMonthSales(sales));
        System.out.println(service.minMonthSales(sales));
        System.out.println(service.belowAverageSales(sales));
        System.out.println(service.aboveAverageSales(sales));
    }


}