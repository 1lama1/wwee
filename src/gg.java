import java.util.StringJoiner;

public class gg {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",");
        int[] arry = new int[3];
        arry[0] = 1;
        arry[1] = 2;
        arry[2] = 3;
        for (int i = 1; i <= arry.length; i++) {
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner.toString());


        double[] arry1 = {1.57, 7.654, 9.986};
        StringJoiner ass = new StringJoiner(",");
        StringJoiner ass1 = new StringJoiner(",");
        for (double v : arry1) {
            ass.add(String.valueOf(v));
        }
        System.out.println(ass.toString());


        int[] ayyy3 = {123, 234, 12345, 2354, 24555};
        StringJoiner kiss = new StringJoiner(",");
        for (int i : ayyy3) {
            kiss.add(String.valueOf(i));
        }
        System.out.println(kiss.toString());

        StringJoiner joiner1 = new StringJoiner(",");
        int[] ary = new int[3];
        ary[0] = 1;
        ary[1] = 2;
        ary[2] = 3;
        for (int a = ary.length-1;a>=0; a--) {
            joiner1.add(String.valueOf(a));
        }
        System.out.println(joiner1.toString());


        double[] aqq = {1.57, 7.654, 9.986};
        StringJoiner asss1 = new StringJoiner(",");
        for (int s = aqq.length-1;s>=0; s--) {
            asss1.add(String.valueOf(s));
        }
        System.out.println(ass.toString());


        int[] ayy3 = {123, 234, 12345, 2354, 24555};
        StringJoiner kiss23 = new StringJoiner(",");
        for (int d = ayy3.length-1;d>=0; d--) {
            kiss23.add(String.valueOf(d));
        }
        System.out.println(kiss.toString());


    }
}
