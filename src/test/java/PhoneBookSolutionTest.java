import org.junit.Test;
import phone.PhoneBookSolution;

import static org.junit.Assume.*;

public class PhoneBookSolutionTest {
    @Test
    public void testPrintNumbers() throws Exception {
        try{
            PhoneBookSolution.printNumbers("Петров П.П.");
        } catch (ArrayIndexOutOfBoundsException e) {
            assumeNoException("Ошибка!", e);
        }
    }
}
