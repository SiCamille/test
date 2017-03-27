package org.camille.mytest.mylove;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoveTime {

    public static void main(String[] args) throws Exception {
        System.out.println("\t郭凯和周雅楠已经在一起了:");
        while(true) {
            Thread.sleep(999);
            String line = "2015 06 02 20 57 44 4444";
            String line2 = "1970 1 1 08 00 00 0000";
            Date d3 = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH mm ss SSSS");
            Date d = sdf.parse(line);
            Date d2 = sdf.parse(line2);
            long l = d3.getTime() - d.getTime();
            String s1 = sdf.format(l);
            String[] arr = s1.split(" ");
            int[] newArr = new int[arr.length];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = Integer.parseInt(arr[i]);
            }
            newArr[0] = newArr[0] - 1970;
            if(newArr[3] - 8 < 0) {
                newArr[2] = newArr[2] - 1;
                if(newArr[2] == 0) {
                    if(newArr[1] == 1 || newArr[1] == 3 || newArr[1] == 5 || newArr[1] == 7 || newArr[1] == 8 || newArr[1] == 10 || newArr[1] == 12) {
                        if(newArr[1] == 1) {
                            newArr[1] = 12;
                            newArr[0]--;
                        }
                        newArr[2] = 31;
                    } else {
                        newArr[2] = 30;
                    }
                }
                newArr[3] = 24 + newArr[3] - 8;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(newArr[0]).append("年零").append(newArr[1]).append("个月").append(newArr[2]).append("天 ").append(newArr[3]).append("小时").append(newArr[4]).append("分钟").append(newArr[5]).append("秒").append(newArr[6]).append("毫秒");
            System.out.println("\t\t" + sb);
            System.gc();
        }

    }

}
