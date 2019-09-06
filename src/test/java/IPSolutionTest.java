import ip.IPSolution;
import org.junit.Test;
import static org.junit.Assert.*;

public class IPSolutionTest {
    @Test
    public void testIpToLong() throws Exception {
        assertEquals("��������� 3232235778", 3232235778L, IPSolution.ipToLong("192.168.1.2"));
    }

    @Test
    public void testLongToIp() throws Exception {
       assertEquals("��������� 192.168.1.2", "192.168.1.2", IPSolution.longToIp(3232235778L));
    }
}
