public class Main {
    public static void main(String[] args) {
        MonthCalculationService service = new MonthCalculationService();
        int count = service.monthsCalculation(10_000, 3_000, 15_000, 0, 0);
        System.out.println(count);
    }
}
