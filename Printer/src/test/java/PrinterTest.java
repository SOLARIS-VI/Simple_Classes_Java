import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void testPrintEnoughPaper() {
        Printer printer = new Printer(50, 100);
        printer.print(5, 10);
        assertEquals(50 - (5 * 10), printer.getSheetsLeft());
    }

    @Test
    public void testPrintNotEnoughPaper() {
        Printer printer = new Printer(10, 50);
        printer.print(5, 10);
        assertEquals(10, printer.getSheetsLeft());
    }

    @Test
    public void testReduceToner() {
        Printer printer = new Printer(50, 100);
        printer.print(5, 10);
        assertEquals(100 - (5 * 10), printer.getTonerVolume());
    }
}
