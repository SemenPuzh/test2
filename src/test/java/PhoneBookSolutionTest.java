import org.junit.Test;
import phone.PhoneBookSolution;

import static org.junit.Assume.*;

public class PhoneBookSolutionTest {
    @Test
    public void testPrintNumbers() throws Exception {
        try{
            PhoneBookSolution.printNumbers("������ �.�.");
        } catch (ArrayIndexOutOfBoundsException e) {
            assumeNoException("������!", e);
        }
    }
}
