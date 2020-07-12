
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

import java.math.BigDecimal;

/**
 * @author dmj1161859184@126.com mjduan 2018-06-29 17:10
 * @version 1.0
 * @since 1.0
 */
public class JOLSample_12_ThinLocking {

    private static String s= "we";
    public static void main(String[] args) throws Exception {
        System.out.println(VM.current().details());

//        final BigDecimal a = new BigDecimal(1);196
        //long 9*24 Integer6*16
        String a = s;
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
    }

    public static class A {
        // no fields
    }
}