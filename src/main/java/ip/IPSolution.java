package ip;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IPSolution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstIP = reader.readLine();
        String secondIP = reader.readLine();
        printIpRange(firstIP, secondIP);
        reader.close();
    }

    private static void printIpRange(String startIp, String endIp) {
        long start = ipToLong(startIp);
        long end = ipToLong(endIp);
        for (long i = start + 1; i < end; i++) {
            System.out.println(longToIp(i));
        }
    }

    public static long ipToLong(String IpAddress) {
        long result = 0;
        String[] ipArray = IpAddress.split("\\.");
        for (int i = 3; i >= 0; i--) {

            long ip = Long.parseLong(ipArray[3 - i]);

            result |= ip << (i * 8);
        }

        return result;
    }

    public static String longToIp(long ip) {
        StringBuilder result = new StringBuilder(15);

        for (int i = 0; i < 4; i++) {

            result.insert(0, Long.toString(ip & 0xff));

            if (i < 3) {
                result.insert(0, '.');
            }

            ip = ip >> 8;

        }
        return result.toString();
    }
}
