public class MonthCalculationService {
    public int monthsCalculation (int income, int expenses, int threshold, int money, int count){
        for (int months = 1; months <= 12; months++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses)/3;
            } else {
                money = money + income - expenses;
            }
        }
       return (count);
    }
}
