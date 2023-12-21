import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthCalculationServiceTest {
    @Test
    public void firstCaseTest (){
        MonthCalculationService service = new MonthCalculationService();
        int expected = 3;
        int actual = service.monthsCalculation(10_000, 3_000, 15_000, 0, 0);
        Assertions.assertEquals(expected,actual);
    }
}
