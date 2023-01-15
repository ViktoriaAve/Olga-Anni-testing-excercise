import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
public class DatesClassTest {

    @Test
    public void testAmericanFormat() {
        DatesClass american = new DatesClass(1, 2, 2023);
        String Date = "2/1/2023";
        assertEquals(Date, american.americanFormat(2,1,2023));
    }

    @Test
    public void testEuropeanFormat() {
        DatesClass european = new DatesClass(2, 1, 2023);
        String Date = "2/1/2023";
        assertEquals(Date, european.europeanFormat(2,1,2023));
    }

    @Test
    public void testMonthIsInteger() {
        DatesClass american = new DatesClass(1, 5, 2023);
        assertTrue(american.month == (int)american.month);
    }

    @Test
    public void testOrder() {
        DatesClass european = new DatesClass(2, 1, 2023);
        String Date = european.year + "/" +  european.month + "/" + european.day;
        assertNotEquals(Date, european.europeanFormat(2,1,2023));
    }

    @Test
    public void testCorrectDayMonth() {
        DatesClass newDate = new DatesClass(15, 1,2023);
        assertTrue(newDate.day <= 32);
        assertTrue(newDate.month <= 12);
    }
}