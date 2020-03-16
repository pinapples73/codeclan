import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Test
    public void testNumberOfSheets(){
        printer = new Printer(0, 0);
        assertEquals(20, printer.paperCheck());
    }

    @Test
    public void testAmountOfToner(){
        printer = new Printer(0, 0);
        assertEquals(30, printer.tonerCheck());
    }

    @Test
    public void testPrint(){
        printer = new Printer(5, 2);
        assertEquals(true, printer.print());
        System.out.println(printer.paperCheck());
    }
}
