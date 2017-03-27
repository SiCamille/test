package org.camille.mytest.test;

import org.camille.mytest.io.单例的Dir操作工具类;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Data {

    int val;
}

public class CamilleTest {

    public static void main(String[] args) throws Exception {
        // demo1();
        // demo2();
        // demo3();
        // demo4();
        // demo5();
        // demo6();
        // demo7();
        // demo8();
        // demo9();
        // demo10();
        // demo11();
        // demo12();
        // demo13();
        // demo14();
        // demo15();
        // demo16();
        // demo17();
        // demo18();
        // demo19();
        // demo20();
        // demo21();
        // demo22();
        // demo23();
        // demo24();
        // demo25();
        // demo26();
        // demo27();
        // demo28();
        // demo29();
        // demo30();
        // demo31();
        // demo32();
        // demo33();
        // demo34();
        // demo35();
        // demo36();
        // demo37();
        // demo38();
        // demo39();
        // demo40();
        // demo41();
        // demo42();
        // demo43();
        // demo44();
        // demo45();
        // demo46();
        // demo47();
        // demo48();
        // demo49();
        // demo50();
        // demo51();
        // demo52();
        // demo53();
        // demo54();
        // demo55();
        // demo56();
        // demo57();
        // demo58();
        // demo59();
        // demo60();
        // demo61();
        // demo62();
        // demo63();
        // demo64();
        // demo65();
        // demo66();
        // demo67();
        // demo68();
        // demo69();
        // demo70();
        // demo71();
        // demo72();
        // demo73();
        // demo74();
        // demo75();
        // demo76();
        // demo77();
        // demo78();
        // demo79();
        // demo80();
        // demo81();
        // demo82();
        // demo83();
        // demo84();
        // demo85();
        // demo86();
        // demo87();
        // demo88();
        // demo89();
        // demo90();
        // demo91();
        // demo92();
        // demo93();
        // demo94();
        // demo95();
        // demo96();
        // demo97();
        // demo98();
        // demo99();
        // demo100();
        // demo101();
        // demo102();
        // demo103();
        // demo104();
        // demo105();
        // demo106();
        // demo107();
        // demo108();
        // demo109();
        // demo110();
        // demo111();
        // demo112();
        // demo113();
        // demo114();
        // demo115();
        // demo116();
        // demo117();
        // demo118();
        // demo119();
        // demo120();
        // demo121();
        // demo122();
        // demo123();
        // demo124();
        单例的Dir操作工具类.tf.run();
    }

    private static void demo124() {
        /*
         * 3、假设迟到两次以内不扣款，从第三次开始依次扣10,20,30………编写一个方法传入迟到的次数返回所扣的金额
         * 
         * PS：比如说一个人迟到了5次那么所扣的金额是：0+0+10+20+30=60元
         */
        int num = getNum(3);
        System.out.println(num);
    }

    private static int getNum(int i) {
        if(i == 1 || i == 2) {
            return 0;
        }
        return  (i - 2) * 10 + getNum(i - 1);
    }

    private static void demo123() {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size() < 5) {
            int num = r.nextInt(13) + 1;
            list.add(num);
        }
        sort(list);
        System.out.println(list);
    }

    private static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    private static void demo122() throws IOException {
        FileInputStream fis = new FileInputStream("exercise.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] arr = new byte[5];
        int len;
        while ((len = fis.read(arr)) != -1) {
            baos.write(arr, 0, len);
        }
        System.out.println(baos);
        fis.close();
    }

    private static void demo121() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            int num = 0;
            String regex = "[\\d]{4}";
            if (line.matches(regex)) {
                num = Integer.parseInt(line);
                int ge = num % 10;
                int shi = num / 10 % 10;
                int bai = num / 10 / 10 % 10;
                int qian = num / 10 / 10 / 10 % 10;
                num = ge * 1000 + shi * 100 + bai * 10 + qian;
            } else {
                System.out.print("输入的数字有误,请输入四位数字:");
                continue;
            }
            System.out.println("输入的数字是:" + line);
            System.out.println("加密后:" + num);

        }
    }

    private static void demo120() {
        int num = 100;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            list.add(i);
        }
        int knife = 1;
        for (int i = 1; list.size() != 1; i++) {
            if (i == list.size()) {
                i = 0;
            }
            if (knife % 14 == 0) {
                list.remove(i--);
            }
            knife++;
        }
        System.out.println(list.get(0));
    }

    private static void demo119() {
        /*
         * 7、海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。
         * 第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，
         * 问海滩上原来最少有多少个桃子
         */
        // double num = 0;
        // int i = 1000;
        // while(true) {
        // for(int j = 0 ; j < 5 ; j++) {
        // num = (i - 1) / 5 * 4;
        // }
        // if(num / 4 == 1) {
        // return (int)i;
        // }
        // i++;
        // System.out.println(i);
        // }

        for (int i = 1; i < 100000; i++) {
            int count = i;
            int num = 0;
            for (int j = 1; j <= 5; j++) {
                if (count == 0) {
                    break;
                }
                if (num == 5) {
                    break;
                }
                if ((count - 1) % 5 == 0) {
                    count = ((count - 1) / 5) * 4;
                    num++;
                } else {
                    num = 0;
                    break;
                }
            }
            if (count != 0 && num == 5) {
                System.out.println(i);
                break;
            }
        }

    }

    private static void demo118() {
        Data data = new Data();
        ArrayList<Data> list = new ArrayList<Data>();

        for (int i = 100; i < 103; i++) {
            data.val = i;
            list.add(data);
        }

        for (Data d : list) {
            System.out.println(d.val);
        }
    }

    // private static void demo117() {
    // /*
    // *
    // aaa是文件夹,里面有bbb.txt,ccc.txt,ddd.txt这些文件,有eee这样的文件夹,eee中有fff.txt和ggg.txt,打印出层级来
    // aaa
    // bbb.txt
    // ccc.txt
    // ddd.txt
    //
    // eee
    // fff.txt
    // ggg.txt
    // */
    // show(new File("E:\\文档"),0);
    // }
    //
    // private static void show(File file, int num) {
    // File[] subFile = file.listFiles();
    // for(File file2 : subFile) {
    // if(file2.isHidden() || !file2.canRead()) {
    // continue;
    // }
    // for(int i = 0 ; i < num ; i++) {
    // System.out.print("\t");
    // }
    // System.out.println(file2.getName());
    // if(file2.isDirectory()) {
    // show(file2,num + 1);
    // }
    // }
    // }
    //
    // private static void demo116() {
    // /*
    // * 小明的妈妈每天会给他20元林花钱，小明每天会花掉一半，
    // 把另一半存起来，每到周日小明拿到钱就花掉所有钱的一半，
    // 小明要攒够100元需要多少天？
    // */
    //// double sum = 0;
    //// int everyDay = 20;
    //// for(int i = 1; ;i++) {
    //// sum += everyDay;
    //// System.out.println(sum);
    //// if(i % 7 == 0) {
    //// sum /= 2;
    //// }
    //// sum -= everyDay / 2;
    //// System.out.println(sum);
    //// System.out.println("------------");
    //// if(sum >= 100) {
    //// System.out.println(i);
    //// System.out.println(sum);
    //// break;
    //// }
    //// }
    //// int gd = 20;//每天固定给20元
    //// int sy = 0;//每天累计的钱
    //// int days = 0;//总天数
    //// while(true) {
    //// //小明每天会花掉一半， 把另一半存起来
    //// sy+=(gd/2);
    //// days++;
    //// //每到周日小明拿到钱就花掉所有钱的一半
    //// if(days%6==0) {
    //// sy/=2;
    //// }
    //// //小明要攒够100元需要多少天
    //// if(sy>=100)
    //// break;
    //// }
    //// System.out.println("小明要攒"+sy+"元需要"+days+"天");
    // int de = 20;//每天20
    // int ze = 0;//总钱数0
    // int days = 0;
    // while(true) {
    // days++;
    // if(days%7==0) {
    // ze=(ze+de)/2;
    // } else {
    // ze += (de/2);
    // }
    // if(ze==100)
    // break;
    // }
    // System.out.println("要攒"+ze+"需要:"+(days+1)+"天");
    // }
    //
    // private static void demo115() {
    // //设计一个方法,用于获取一个字符串中指定子串出现的次数，比如说“hanbasdnbafllgnbahjnbakqqqqlnbaxi”中有几个nba？
    // String line = "hanbasdnbafllgnbahjnbakqqqqlnbaxi";
    // String regex = "nba";
    // int count = 0;
    // while(line.contains(regex)) {
    // int num = line.indexOf(regex);
    // line = line.substring(num + regex.length());
    // count++;
    // }
    // System.out.println(count);
    // }

    // private static void demo114() {
    // Person p = new Person();
    // Thread t1 = new MyThread3("A");
    // Thread t2 =new MyThread3("B");
    // t1.start();
    // t2.start();
    //
    // }
    //
    // class MyThread3 extends Thread {
    //
    // private static Person p = new Person();
    // private static int times = 0;
    //
    // public MyThread3() {
    // super();
    // }
    //
    // public MyThread3(String name) {
    // super(name);
    // }
    //
    // public void run() {
    // while(true) {
    // synchronized(MyThread3.class) {
    // if(times > 10) {
    // break;
    // }
    // try {
    // this.sleep(100);
    // } catch (InterruptedException e) {
    //
    // e.printStackTrace();
    // }
    // if("A".equals(this.getName())) {
    // p.setWeight(p.getWeight() + 1);
    // }
    // times++;
    // if(times == 10) {
    // System.out.println(p.getWeight());
    // }
    // }
    // }
    // }
    // }

    // private static void demo113() {
    // Scanner sc = new Scanner(System.in);
    // String line = sc.nextLine();
    // char[] c = line.toCharArray();
    // if(c[0] != c[c.length - 1]) {
    // char temp = c[0];
    // c[0] = c[c.length - 1];
    // c[c.length - 1] = temp;
    // }
    // for(int i = 0 ; i < c.length ; i++) {
    // if(i % 2 == 0) {
    // c[i] = '*';
    // }
    // System.out.print(c[i]);
    // }
    // }
    //
    // class MyThread3 extends Thread {
    //
    // private static String[] arr = {"爬山","游泳","羽毛球","乒乓球","网球"};
    // private static int num = 0;
    //
    // public MyThread3() {
    // super();
    //
    // }
    //
    // public MyThread3(String name) {
    // super(name);
    //
    // }
    //
    // public void run() {
    // while(true) {
    // synchronized(MyThread3.class) {
    // if(num >= 6) {
    // break;
    // }
    // try {
    // this.sleep(10);
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    //
    // Random r = new Random();
    // int i = r.nextInt(arr.length);
    // System.out.println(this.getName() + "要去" + arr[i]);
    // num++;
    // }
    // }
    // }
    // }

    // private static void demo112() throws IOException {
    // Scanner sc = new Scanner(System.in);
    // BufferedWriter bw = new BufferedWriter(new FileWriter("number.txt"));
    // while(true) {
    // String line = sc.nextLine();
    // if("quit".equals(line)) {
    // break;
    // }
    // try {
    // bw.write(line);
    // } catch (NumberFormatException e) {
    // System.out.println("输入的必须是数字,请重新输入");
    // }
    // bw.newLine();
    // }
    // bw.close();
    // test(new File("number.txt"));
    // }
    //
    // private static void test(File file) throws IOException {
    // BufferedReader br = new BufferedReader(new FileReader(file));
    // ArrayList<Integer> list = new ArrayList<>();
    // String line;
    // String regex = "[\\d]+";
    // while((line = br.readLine()) != null) {
    // if(line.matches(regex)) {
    // list.add(Integer.parseInt(line));
    // }
    // }
    // System.out.println(list);
    // HashSet<Integer> hs = new HashSet<>();
    // hs.addAll(list);
    // list.clear();
    // list.addAll(hs);
    // Integer[] arr = list.toArray(new Integer[0]);
    // for (int i = arr.length - 1; i >= 0; i--) {
    // System.out.println(list.get(i));
    // }
    // System.out.println("-------------");
    // for (Integer i : list) {
    // System.out.println(i);
    // }
    // }
    //
    // private static void demo111() throws IOException {
    // BufferedWriter bw = new BufferedWriter(new FileWriter(new
    // File("E:\\a.txt")));
    // bw.write("abcd123456efg");
    // bw.newLine();
    // bw.write("12345abcd6789");
    // bw.close();
    // copy(new File("E:\\a.txt"));
    // }
    //
    // private static void copy(File file) throws IOException {
    // BufferedReader br = new BufferedReader(new FileReader(file));
    // BufferedWriter bw = new BufferedWriter(new FileWriter(new
    // File("D:\\b.txt")));
    // String line;
    // int num = 1;
    // while((line = br.readLine()) != null) {
    // char[] c = line.toCharArray();
    // if(num % 2 == 1) {
    // for(char ch : c) {
    // if(ch >= 97 && ch <= 123) {
    // bw.write(ch);
    // }
    // }
    // } else {
    // for(char ch : c) {
    // if(ch >= 48 && ch <= 57) {
    // bw.write(ch);
    // }
    // }
    // }
    // bw.newLine();
    // num++;
    // }
    // br.close();
    // bw.close();
    // }
    //
    // private static void demo110() {
    // Scanner sc = new Scanner(System.in);
    // while(true) {
    // try {
    // System.out.print("请输入一个手机号码:");
    // String line = sc.nextLine();
    // String regex = "[1][3578][\\d]{9}";
    // if(line.length() != 11) {
    // System.out.println("注册用户失败");
    // } else if(line.matches(regex)){
    // String i = line.substring(line.length() - 4, line.length());
    // System.out.println("您输入的手机号是:" + line + "\n您的验证码为:" + i);
    // break;
    // } else {
    // System.out.println("注册用户失败");
    // }
    // } catch (Exception e) {
    // System.out.println("注册用户失败");
    // }
    //
    // }
    // }
    //
    // private static void demo109() {
    // Thread t1 = new MyThread3("zs");
    // Thread t2 = new MyThread3("ls");
    // t1.setPriority(1);
    // t2.setPriority(10);
    // t1.start();
    // t2.start();
    // }
    //
    // private static void demo108() {
    // Scanner sc = new Scanner(System.in);
    // int num = 1;
    // TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
    // @Override
    // public int compare(Student o1, Student o2) {
    // int num = o2.getScore() - o1.getScore();
    // return num == 0 ? 1 : num;
    // }
    // });
    //
    // while(ts.size() < 5) {
    // System.out.println("请输入第" + num + "位学生信息(格式:姓名,年龄,分数):");
    // String line = sc.nextLine();
    // String regex = ".{1,}[,][\\d]{1,3}[,][\\d]{1,3}";
    // if(line.matches(regex)) {
    // String[] arr = line.split("\\,");
    // if(Integer.parseInt(arr[1]) == 0 || Integer.parseInt(arr[2]) > 100) {
    // System.out.println("分数或年龄输入有误,请重新输入");
    // } else {
    // ts.add(new
    // Student(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2])));
    // num++;
    // }
    // } else {
    // System.out.println("格式输入有误,请重新输入");
    // }
    // }
    // for (Student s : ts) {
    // System.out.println(s.getName() + ":" + s.getAge() + ":" + s.getScore());
    // }
    // }
    //
    // private static void demo107() throws IOException {
    // String[] str = {"奶昔","加多宝","啤酒","白酒"};
    // TreeMap<Person, String> tm = new TreeMap<>(new Comparator<Person>() {
    //
    // @Override
    // public int compare(Person o1, Person o2) {
    // int num = o1.getAge() - o2.getAge();
    // return num == 0 ? 1 : num;
    // }
    // });
    // ArrayList<Person> list = new ArrayList<>();
    // list.add(new Person("小李", 17));
    // list.add(new Person("王麻子", 23));
    // list.add(new Person("美", 15));
    // int num = 0;
    // for(int i = 0 ; tm.size() < 3 ; i++) {
    // Random r = new Random();
    // int temp = r.nextInt(str.length);
    // if(list.get(i).getAge() < 18 && (str[temp].equals("啤酒") ||
    // str[temp].equals("白酒"))) {
    // i--;
    // continue;
    // }
    // tm.put(list.get(i), str[temp]);
    // }
    // BufferedWriter bw = new BufferedWriter(new
    // FileWriter("peron_info.txt",true));
    // for (Entry<Person, String> p : tm.entrySet()) {
    // System.out.println(p.getKey().getName() + ":" + p.getKey().getAge() + ":"
    // + p.getValue());
    // bw.write(p.getKey().getName() + ":" + p.getKey().getAge() + ":" +
    // p.getValue());
    // bw.newLine();
    // }
    // bw.close();
    // }

    // private static void demo106() {
    // new MyThread3("安检口A").start();
    // new MyThread3("安检口B").start();
    // }
    //
    // class MyThread3 extends Thread {
    //
    // private static int people = 300;
    // private static ArrayList<Integer> list = new ArrayList<>();
    // private static int num1 = 0;
    // private static int num2 = 0;
    //
    // static {
    // for(int i = 1 ; i <= people ; i++) {
    // list.add(i);
    // }
    // }
    //
    //
    //
    // public MyThread3() {
    // super();
    //
    // }
    //
    //
    //
    // public MyThread3(String name) {
    // super(name);
    //
    // }
    //
    //
    //
    // public void run() {
    // while(true) {
    // synchronized(MyThread3.class) {
    // if(list.size() <= 0) {
    // break;
    // }
    // try {
    // this.sleep(10);
    // } catch (InterruptedException e) {
    //
    // e.printStackTrace();
    // }
    // Random r = new Random();
    // int num = 0;
    // if(list.size() > 1) {
    // num = r.nextInt(list.size() - 1);
    // }
    // System.out.println(list.get(num) + "号人员正在通过" + this.getName());
    // list.remove(num);
    // if(this.getName().equals("安检口A")) {
    // num1++;
    // } else {
    // num2++;
    // }
    // if(list.size() == 0) {
    // System.out.println("从安检口A通过的人数有:" + num1);
    // System.out.println("从安检口B通过的人数有:" + num2);
    // }
    // }
    // }
    // }
    // }
    //
    // private static void demo105() {
    // int ge,shi,bai,qian;
    // ge = shi = bai = qian = 0;
    // int count = 0;
    // for(int i = 1000 ; i < 10000 ; i++) {
    // ge = i % 10;
    // shi = i / 10 % 10;
    // bai = i / 10 / 10 % 10;
    // qian = i / 10 / 10 / 10 % 10;
    // if(((ge + bai) == (shi + qian) && (i % 2 == 0) && (ge % 2 == 0) && (qian
    // % 2 == 1))) {
    // System.out.print(i);
    // count++;
    // if(count % 5 == 0) {
    // System.out.println();
    // continue;
    // }
    // System.out.print("\t");
    // }
    // }
    // System.out.println("共有" + count + "个");
    // }

    // private static void demo104() throws IOException {
    // LinkedHashMap<String, Double> hm = new LinkedHashMap<>();
    // hm.put("香蕉", 5.6);
    // hm.put("樱桃", 25.0);
    // hm.put("桃子", 5.6);
    // hm.put("苹果", 2.3);
    // int key = 0;
    // for (String s : hm.keySet()) {
    // System.out.println(s + ":" + hm.get(s));
    // key++;
    // }
    // System.out.println("-------------------------");
    // for(Entry<String, Double> en :hm.entrySet()) {
    // System.out.println(en.getKey() + ":" + en.getValue());
    // }
    // System.out.println("-------------------------");
    // System.out.println("共有" + key + "种水果");
    // System.out.println("-------------------------");
    // hm.put("香蕉", 10.9);
    // System.out.println("香蕉的价格已修改为" + hm.get("香蕉") + "元");
    // System.out.println("-------------------------");
    // hm.remove("桃子");
    // BufferedWriter bw = new BufferedWriter(new FileWriter(new
    // File("info.txt")));
    // for (String s : hm.keySet()) {
    // bw.write(s + "=" + hm.get(s));
    // bw.newLine();
    // }
    // bw.close();
    // }

    // private static void demo103() {
    // new GetMoney("玩家4").start();
    // new GetMoney("玩家1").start();
    // new GetMoney("玩家2").start();
    // new GetMoney("玩家3").start();
    // new GetMoney("玩家5").start();
    // }

    // class GetMoney extends Thread {
    //
    // private static int money;
    // private static int time;
    //
    //
    // public GetMoney() {
    // super();
    //
    // }
    //
    // public GetMoney(String name) {
    // super(name);
    //
    // }
    //
    // public void run() {
    // while(true) {
    // synchronized(GetMoney.class) {
    // if(time++ >= 5) {
    // break;
    // }
    // Random r = new Random();
    // money = r.nextInt(10) + 1;
    // try {
    // this.sleep(300);
    // } catch (InterruptedException e) {
    //
    // e.printStackTrace();
    // }
    // System.out.println(this.getName() + "抢了" + money + "元");
    // }
    // }
    // }
    // }

    // private static void demo102() {
    // getClientIn();
    // }
    //
    // private static void getClientIn() {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("请输入一个身份证号:");
    // while (true) {
    // String line = sc.nextLine();
    // if(line.length() == 16 || line.length() == 18) {
    // String regex = "[\\d]+";
    // if(line.substring(0, line.length()-1).matches(regex)) {
    // String newLine = line.substring(6,14);
    // String newRegex = "[199][\\d]+";
    // if(newLine.matches(newRegex)) {
    // System.out.println("身份证号是" + line + ",您的生日是" + newLine);
    // break;
    // } else {
    // System.out.println("您输入的身份证有误,请重新输入");
    // }
    // } else {
    // System.out.println("您的身份证内容有误,请重新输入");
    // }
    // } else {
    // System.out.println("您的身份证号长度输入有误,请重新输入");
    // }
    // }
    // }

    // private static void demo101() {
    // // 1.假设有300个人（从1-300编号）要过地铁安检，地铁站有两个安检口（用两个线程表示，设置安检口名称"安检口A和安检口B"），
    // //用多线程模拟该过程，打印"XX号人员正在通过安检口X
    // new MyThread3("安检口A").start();
    // new MyThread3("安检口B").start();
    // }
    //
    // class MyThread3 extends Thread {
    //
    // private static int people = 300;
    // private static ArrayList<Integer> list = new ArrayList<>();
    //
    // static {
    // for (int i = 1; i <= people; i++) {
    // list.add(i);
    // }
    // }
    //
    //
    //
    // public MyThread3() {
    // super();
    //
    // }
    //
    // public MyThread3(String name) {
    // super(name);
    //
    // }
    //
    // public void run() {
    // while(true) {
    // synchronized(MyThread3.class) {
    // if(list.size() <= 0) {
    // break;
    // }
    // try {
    // this.sleep(10);
    // } catch (InterruptedException e) {
    //
    // e.printStackTrace();
    // }
    // Random r = new Random();
    // int num = r.nextInt(list.size());
    // System.out.println(list.remove(num) + "号人员正在通过" + this.getName());
    // }
    // }
    // }
    // }

    // private static void demo100() throws IOException {
    // //3. 编写程序，获取指定目录下 所有的.java 结尾的文件(包含
    // 子文件夹中的.java文件)，并把这些文件复制到d盘的javaee3期这个文件夹下面。
    // File dir = getDir();
    // File newDir = new File("D:\\java3期");
    // newDir.mkdir();
    // copy(dir,newDir);
    // }
    //
    // private static void copy(File dir, File newDir) throws IOException {
    // File[] subFile = dir.listFiles();
    // for (File file : subFile) {
    // if(file.isHidden() || !file.canRead() || file.equals(null)) {
    // continue;
    // }
    // if(file.isFile()) {
    // if(file.getName().endsWith(".java")) {
    // File temp = new File(newDir,file.getName());
    // BufferedInputStream bis = new BufferedInputStream(new
    // FileInputStream(file));
    // BufferedOutputStream bos = new BufferedOutputStream(new
    // FileOutputStream(temp));
    // int b;
    // while((b = bis.read()) != -1) {
    // bos.write(b);
    // }
    // bis.close();
    // bos.close();
    // }
    // } else {
    // copy(file,newDir);
    // }
    // }
    // }
    //
    // private static File getDir() {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("请输入一个文件夹路径:");
    // while(true) {
    // File dir = new File(sc.nextLine());
    // if(!dir.exists()) {
    // System.out.println("您输入的不是文件夹路径,请重新输入");
    // } else if(dir.isFile()) {
    // System.out.println("您输入的是文件路径,请重新输入");
    // } else {
    // return dir;
    // }
    // }
    // }

    // private static void demo99() {
    // showJava(new File("E:\\文档"));
    // }
    //
    // private static void showJava(File file) {
    // File[] subFile = file.listFiles();
    // for (File file2 : subFile) {
    // if(file2.isHidden() || !file2.canRead() || file2.equals(null)) {
    // continue;
    // }
    // if(file2.isFile()) {
    // if(file2.getName().endsWith(".java")) {
    // System.out.println(file2.getAbsolutePath());
    // }
    // } else {
    // showJava(file2);
    // }
    // }
    // }
    //
    // private static void demo98() {
    // File file = new File("E:\\文档");
    // int[] arr = {0};
    // get(file,".jpg",arr);
    // System.out.println(arr[0]);
    // }
    //
    // private static void get(File file, String s,int[] arr) {
    // File[] subFile = file.listFiles();
    // for (File file2 : subFile) {
    // if(file2.isHidden() || !file2.canRead() || file2.equals(null)) {
    // System.out.println(file2.getAbsolutePath() + "无法访问");
    // continue;
    // }
    // if(file2.isFile()) {
    // if(file2.getName().endsWith(s)) {
    // System.out.println(file2.getAbsolutePath());
    // arr[0]++;
    // }
    // } else {
    // get(file2,s,arr);
    // }
    // }
    // }
    //
    // private static void demo97() throws IOException {
    // /*2.
    // 编写一个程序，将d:\java目录下的所有.java文件复制到d:\jad目录下，并将原来文件的扩展名从.java改为.jad。(单级目录)*/
    // File file = new File("E:\\文档");
    // File newFile = new File("E:\\jad");
    // newFile.mkdir();
    // copy(file,newFile);
    // }
    //
    // private static void copy(File file, File newFile) throws IOException {
    // File[] subFile = file.listFiles();
    // for (File file2 : subFile) {
    // if(file2.isHidden() || !file2.canRead() || file2.equals(null)) {
    // System.out.println(file2.getAbsolutePath() + "无法访问");
    // continue;
    // }
    // if(file2.isFile()) {
    // if(file2.getName().endsWith(".java")) {
    // File temp = new File(newFile,file2.getName().substring(0,
    // file2.getName().length() - 4).concat("jad"));
    // BufferedInputStream bis = new BufferedInputStream(new
    // FileInputStream(file2));
    // BufferedOutputStream bos = new BufferedOutputStream(new
    // FileOutputStream(temp));
    // int b;
    // while((b = bis.read()) != -1) {
    // bos.write(b);
    // }
    // bis.close();
    // bos.close();
    // }
    // } else {
    // copy(file2,newFile);
    // }
    // }
    // }
    //
    // private static void demo96() throws IOException {
    // File file = getFile();
    // BufferedInputStream bis = new BufferedInputStream(new
    // FileInputStream(file));
    // BufferedOutputStream bos = new BufferedOutputStream(new
    // FileOutputStream(new File("new" + file.getName())));
    // int b;
    // while((b = bis.read()) != -1) {
    // bos.write(b);
    // }
    // bis.close();
    // bos.close();
    // }
    //
    // private static File getFile() {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("请输入一个文件的地址值:");
    // while(true) {
    // File file = new File(sc.nextLine());
    // if(!file.exists()) {
    // System.out.println("您输入的不是文件的地址值,请重新输入");
    // } else if(file.isDirectory()){
    // System.out.println("您输入的是文件夹地址值,请重新输入");
    // } else {
    // return file;
    // }
    // }
    // }
    //
    // private static void demo95() {
    // Scanner sc = new Scanner(System.in);
    // ArrayList<String> list = new ArrayList<>();
    // while(list.size() < 5) {
    // list.add(sc.nextLine());
    // }
    // for(int i = 0 ; i < list.size() ; i++) {
    // if(list.get(i).length() < 3) {
    // list.remove(i--);
    // }
    // if(list.get(i).endsWith("a")) {
    // String newString = list.get(i).substring(0,list.get(i).length() -
    // 1).concat("0");
    // list.set(i, newString);
    // }
    // }
    // for (String s : list) {
    // System.out.println(s);
    // }
    // }

    // private static void demo94() {
    // //3.HashMap集合存储元素并遍历。
    // HashMap<String, Integer> hm = new HashMap<>();
    // hm.put("abc", 123);
    // hm.put("def", 123);
    // for (String s : hm.keySet()) {
    // System.out.println(s + ":" + hm.get(s));
    // }
    // }
    //
    // private static void demo93() {
    // //2.TreeSet集合存储字符串并遍历，要求按照字符串的长度从长到短或者从短到长输出。
    // TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
    //
    // @Override
    // public int compare(String o1, String o2) {
    // int num = o1.length() - o2.length();
    // return num == 0 ? o1.compareTo(o2) : num;
    // }
    // });
    // ts.add("abc");
    // ts.add("abcd");
    // ts.add("12");
    // for (String string : ts) {
    // System.out.println(string);
    // }
    // }

    // private static void demo92() {
    // //1.ArrayList存储字符串并遍历
    // ArrayList<String> list = new ArrayList<>();
    // list.add("abc");
    // list.add("123");
    // for (String string : list) {
    // System.out.println(string);
    // }
    // }
    //
    // private static void demo91() {
    // String line = "91 27 -45 46 38 50";
    // String[] num = line.split("[\\s]+");
    // Arrays.sort(num);
    // StringBuilder sb = new StringBuilder();
    // for (String s : num) {
    // sb.append(s + " ");
    // }
    // System.out.println(sb.toString());
    // }

    // private static void demo90() {
    // int num = (int) ((Math.random() * 100) + 1);
    // Scanner sc = new Scanner(System.in);
    // System.out.print("猜数字小游戏,请输入一个数字:");
    // while(true) {
    // try {
    // String line = sc.nextLine();
    // int client = Integer.parseInt(line);
    // if(client > num) {
    // System.out.println("大了");
    // } else if(client < num) {
    // System.out.println("小了");
    // } else {
    // System.out.println("对了");
    // break;
    // }
    // } catch (NumberFormatException e) {
    // System.out.println("您的输入有误,请重新输入");
    // }
    // }
    // }
    //
    // private static void demo89() {
    // /*1.汽车租赁公司有客车和货车，不同的类型有不同的租借费用，租借规则如下：（客车是前两天租赁费每天100元，超过两天租赁费每天为150元，
    // * 货车前两天租赁费每天300元，超过3天租赁费每天为400元）请用学过的面向对象知识实现。
    // */
    // KeChe kc = new KeChe(2);
    // HuoChe hc = new HuoChe(5);
    // kc.getMoney();
    // hc.getMoney();
    // }
    //
    // private static void demo88() {
    // //九九乘法表
    // for(int i = 1 ; i <= 9 ; i++) {
    // for(int j = 1 ; j <= i ; j++) {
    // System.out.print(j + "*" + i + "=" + (i*j) + "\t");
    // }
    // System.out.println();
    // }
    // }

    // private static void demo87() {
    // //编写程序，要求输出1至100的数字中，既是偶数，又不能被5和3整除的数字。
    // showNum(100);
    // }
    //
    // private static void showNum(int num) {
    // for(int i = 1 ; i <= num ; i++) {
    // if((i % 2 == 0) && (i % 5 != 0) && (i % 3 != 0)) {
    // System.out.print(i + "\t");
    // }
    // }
    // }

    // private static void demo86() {
    // File file = new File("E:\\文档");
    // TreeMap<String, Integer> tm = new TreeMap<>();
    // getFile(file,tm);
    // System.out.println("------------------");
    // for (String s : tm.keySet()) {
    // System.out.println(s + ":" + tm.get(s));
    // System.out.println("-----");
    // }
    // }
    //
    // private static void getFile(File file, TreeMap<String, Integer> tm) {
    // File[] subFile = file.listFiles();
    // for (File file2 : subFile) {
    // if(file2.isFile()) {
    // if(file2.getName().contains(".")) {
    // String[] line = file2.getName().split("\\.");
    // String newLine = "." + line[line.length - 1];
    // tm.put(newLine, tm.containsKey(newLine) ? tm.get(newLine) + 1 : 1);
    // System.out.println(file2.getAbsolutePath());
    // }
    // } else {
    // if(file2.isHidden() || !file2.canRead() || file2.equals(null)){
    // System.out.println(file2.getAbsolutePath() + "文件夹不可访问");
    // continue;
    // }
    // getFile(file2,tm);
    //
    // }
    // }
    // }

    // private static void demo85() throws InterruptedException {
    // Thread.currentThread().wait();
    // }
    //
    // private static void demo84() throws NoSuchMethodException,
    // InstantiationException, IllegalAccessException,
    // InvocationTargetException, NoSuchFieldException {
    // Class clazz = Student.class;
    //
    // Constructor c = clazz.getConstructor();
    // Student s = (Student) c.newInstance();
    // Field f = clazz.getDeclaredField("name");
    // f.setAccessible(true);
    // f.set(s, "李四");
    // System.out.println(s);
    // }

    // private static void demo83() {
    // Scanner sc = new Scanner(System.in);
    // int key = sc.nextInt();
    // int num = get3(key);
    // System.out.println(num);
    // }
    //
    // private static int get3(int key) {
    // int num = 1;
    // ArrayList<Integer> list = new ArrayList<>();
    // if(key < 3 && key > -3) {
    // System.out.println("由于输入小于3大于-3的数,没有能被3整除的数");
    // return 0;
    // }
    // while(key % 3 != 0) {
    // if(key > 0) {
    // key--;
    // } else {
    // key++;
    // }
    // }
    // list.add(key);
    // while(true) {
    // if(key < 0) {
    // key += 3;
    // } else {
    // key -= 3;
    // }
    // num++;
    // list.add(key);
    // if(key == 3 || key == -3) {
    // break;
    // }
    // }
    // Collections.reverse(list);
    // System.out.println(list);
    // return num;
    // }

    // private static void demo82() throws IOException {
    // File copyDir = new File("C:\\新建文件夹");
    // copyDir.mkdir();
    // File dir = getDir();
    // if(dir.getAbsolutePath().contains(copyDir.getAbsolutePath())) {
    // System.out.println("录入的文件夹不能为源文件夹或源文件的子文件夹.");
    // return;
    // }
    // txt2Java(dir,copyDir);
    // }
    //
    // private static void txt2Java(File dir, File copyDir) throws IOException {
    // File[] subFile = dir.listFiles();
    // for (File file : subFile) {
    // if(checkPower(file)) {
    // System.out.println(file.getAbsolutePath() + "文件或文件夹不可访问");
    // continue;
    // }
    // if(file.isFile()) {
    // if(file.getName().endsWith(".txt")) {
    // File newFile = new File(copyDir,file.getName().substring(0,
    // file.getName().length() - 3).concat("java"));
    // BufferedInputStream bis = new BufferedInputStream(new
    // FileInputStream(file));
    // BufferedOutputStream bos = new BufferedOutputStream(new
    // FileOutputStream(newFile));
    // int b;
    // while((b = bis.read()) != -1) {
    // bos.write(b);
    // }
    // bis.close();
    // bos.close();
    // System.out.println(file.getName() + "已转换为" + newFile.getName() + "文件存入" +
    // copyDir.getAbsolutePath() + "文件夹下");
    // }
    // } else {
    // txt2Java(file,copyDir);
    // }
    // }
    // }
    //
    // private static boolean checkPower(File file) {
    // return file.isHidden() || !file.canRead() || file.equals(null);
    // }
    //
    // private static File getDir() {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("请输入一个文件夹地址:");
    // while(true) {
    // File dir = new File(sc.nextLine());
    // if(!dir.exists()) {
    // System.out.println("您输入的不是文件或文件夹,请重新输入.");
    // } else if(dir.isFile()) {
    // System.out.println("您输入的不是文件夹,请重新输入");
    // } else {
    // return dir;
    // }
    // }
    // }

    // private static void demo81() throws IOException {
    // String clientIn = getString();
    // TreeMap<Character, Integer> tm = getChar(clientIn);
    // for (char c : tm.keySet()) {
    // System.out.print(c + "(" + tm.get(c) + ")" + " ");
    // }
    // }
    //
    // private static TreeMap<Character, Integer> getChar(String clientIn) {
    // TreeMap<Character, Integer> tm = new TreeMap<>(new
    // Comparator<Character>() {
    //
    // @Override
    // public int compare(Character o1, Character o2) {
    // return o1 - o2;
    // }
    // });
    // char[] ch = clientIn.toCharArray();
    // for (char d : ch) {
    // tm.put(d, tm.containsKey(d) ? tm.get(d) + 1 : 1);
    // }
    // for (char c : tm.keySet()) {
    // System.out.print(c + "(" + tm.get(c) + ")" + " ");
    // }
    // System.out.println();
    // return tm;
    // }
    //
    // private static String getString() throws IOException {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // return br.readLine();
    // }

    // private static void demo80() throws FileNotFoundException, IOException {
    // FileOutputStream fos = new FileOutputStream("b.txt",true);
    // fos.write(97);
    // fos.write(98);
    // fos.write(99);
    // fos.close();
    // }

    // private static void demo79() {
    // int[] arr = {11,22,33,44,55};
    // int num = getNum(arr,45);
    // System.out.println(num);
    // }
    //
    // private static int getNum(int[] arr, int i) {
    // int min = 0;
    // int max = arr.length - 1;
    // int mid = (min + max) / 2;
    // while(min <= max) {
    // if(arr[mid] > i) {
    // max = mid - 1;
    // } else if(arr[mid] < i) {
    // min = mid + 1;
    // } else {
    // return mid;
    // }
    // mid = (min + max) / 2;
    // }
    // return -(min + 1);
    // }

    // private static void demo78() {
    // String line =
    // "heimaheimawoaiheima,heimabutongyubaima,bulunheimahaishibaima,zhaodaogongzuojiushihaoheima";
    // String regex = "heima";
    // int num = getNum(line,regex);
    // System.out.println(num);
    // }
    //
    // private static int getNum(String line, String regex) {
    // int num = 0;
    // while(line.contains(regex)) {
    // int index = line.indexOf(regex);
    // line = line.substring(index + regex.length(), line.length());
    // num++;
    // }
    // return num;
    // }

    // private static void demo77() throws IOException {
    // 单例的Dir操作工具类.tf.run();
    // }

    // private static void demo76() {
    // /*8899 9708 8800
    // * 题目：809*??=800*??+9*??+1
    // * 其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。
    // */
    // int num = 809;
    // for(int i = 10 ; i < 100 ; i++) {
    // if((num * i == ((num - 9) * i) + ((num % 10) * i) + 1)) &&
    // (((num / 100) * i) >= 10 && (num / 100) * i <= 100) &&
    // (((num % 10) * i) >= 100 && (num % 10) * i <= 1000)) {
    // System.out.println(i);
    // System.out.println(num * i);
    // }
    // }
    // }

    // private static void demo75() {
    // /*
    // * 题目：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。
    // * 第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，
    // * 问海滩上原来最少有多少个桃子？
    // */
    // int sum = getTaoZi(1,1);
    // System.out.println(sum);
    // }
    //
    // private static int getTaoZi(int num,int i) {
    // if(i == 6) {
    // return num;
    // }
    // return getTaoZi(5*(num + 1),++i);
    // }
    //
    // private static void demo74() {
    // //
    // 编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)
    // Scanner sc = new Scanner(System.in);
    // double key = sc.nextInt();
    // double d = 0;
    // if (key % 2 == 0) {
    // for (double num = 2; num <= key; num += 2) {
    // d += 1 / num;
    // }
    // } else {
    // for (double num = 1; num <= key; num += 2) {
    // d += 1 / num;
    // }
    // }
    // System.out.println(d);
    // }

    // private static void demo73() {
    // //题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
    // Scanner sc = new Scanner(System.in).useDelimiter("\\s");
    // int key = sc.nextInt();
    // ArrayList<Integer> list = new ArrayList<>();
    // for(int i = 1 ; i <= key ; i++) {
    // list.add(i);
    // }
    // System.out.println(list);
    // int luckyBoy = getLucky(list);
    // System.out.println(luckyBoy);
    // }
    //
    //
    // private static int getLucky(ArrayList<Integer> list) {
    // int knife = 1;
    // for(int i = 0 ; list.size() != 1 ; i++) {
    // if(i >= list.size()) {
    // i = 0;
    // }
    // if(knife % 3 == 0) {
    // list.remove(i--);
    // }
    // knife++;
    // }
    // return list.get(0);
    // }
    //
    //
    // private static void demo72() {
    // //题目：打印出杨辉三角形（要求打印出10行如下图）
    // /* 1
    // 1 1
    // 1 2 1
    // 1 3 3 1
    // 1 4 6 4 1
    // 1 5 10 10 5 1
    // */
    // int[][] n = new int[10][21];
    // n[0][10] = 1;
    // for(int i=1;i<10;i++) {
    // for(int j=10-i;j<10+i+1;j++)
    // n[i][j] = n[i-1][j-1]+n[i-1][j+1];
    // }
    // for(int i=0;i<10;i++){
    // for(int j=0;j<21;j++){
    // if(n[i][j]==0)
    // System.out.print(" ");
    // else{
    // if(n[i][j]<10)
    // System.out.print(" "+n[i][j]);//空格为了美观需要
    // else if(n[i][j]<100)
    // System.out.print(" "+n[i][j]);
    // else
    // System.out.print(n[i][j]);
    // }
    // }
    // System.out.println();
    // }
    // }

    // private static void demo71() throws IOException {
    // //取一个整数a从右端开始的4～7位
    // int num = getNum();
    // get47(num);
    // }
    //
    // private static void get47(int num) {
    // String line = Integer.toString(num);
    // int newNum = Integer.parseInt(line.substring(line.length() - 7,
    // line.length() - 3));
    // System.out.println(newNum);
    // }
    //
    // private static int getNum() throws NumberFormatException, IOException {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //
    // return Integer.parseInt(br.readLine());
    // }

    // private static void demo70() {
    // BigInteger bi = getDiGui(new BigInteger(5000 + ""),1);
    // System.out.println(bi);
    // }
    //
    // private static BigInteger getDiGui(BigInteger bigInteger,int num) {
    // BigInteger bi1 = new BigInteger(1 + "");
    // if(bi1.equals(bigInteger)) {
    // return bigInteger;
    // }
    //
    // System.out.println("算到" + num + "了");
    // return bigInteger.multiply(getDiGui(bigInteger.subtract(bi1),++num));
    // }

    // private static void demo69() {
    // // 求一个3*3矩阵对角线元素之和
    // int sum = getSum(4);
    // System.out.println(sum);
    // }
    //
    // private static int[] insert(int a, int[] A) {
    // int[] B = new int[A.length + 1];
    // for (int i = A.length - 1; i > 0; i--)
    // if (a > A[i]) {
    // B[i + 1] = a;
    // for (int j = 0; j <= i; j++)
    // B[j] = A[j];
    // for (int k = i + 2; k < B.length; k++)
    // B[k] = A[k - 1];
    // break;
    // }
    // return B;
    // }
    //
    // private static int getSum(int num) {
    // Random r = new Random();
    // int[][] arr = new int[num][num];
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // arr[i][j] = r.nextInt(100) + 1;
    // System.out.print(arr[i][j] + "\t");
    // }
    // System.out.println();
    // System.out.println();
    // }
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (i == arr.length / 2 && arr.length % 2 == 1) {
    // sum += arr[i][i];
    // continue;
    // }
    // sum += arr[i][i] + arr[i][arr.length - 1 - i];
    // }
    // return sum;
    // }

    // private static void demo68() {
    // int[] arr = {11,22,33,44,55};
    // //abc(arr);
    // int num = erfen(arr,44);
    // System.out.println(num);
    // }
    //
    // private static int erfen(int[] arr,int key) {
    // int min = 0;
    // int max = arr.length - 1;
    // int mid = (min + max) / 2;
    // while(min <= max) {
    // if(arr[mid] > key) {
    // max = mid - 1;
    // }
    // if(arr[mid] < key) {
    // min = mid + 1;
    // } else {
    // return mid;
    // }
    // mid = (min + max) / 2;
    // }
    // return -(min + 1);
    // }
    //
    // private static void abc(int[] arr) {
    // for(int i = 0 ; i < arr.length - 1 ; i++) {
    // for(int j = 0 ; j < arr.length - 1 - i ; j++) {
    // if(arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // System.out.println(Arrays.toString(arr));
    // }

    // private static void demo67() {
    // /*
    // * 1 2 3 4 5
    // * 16 17 18 19 6
    // * 15 24 25 20 7
    // * 14 23 22 21 8
    // * 13 12 11 10 9
    // */
    // int num = 9;
    // int[][] arr = getArr(num);
    // for(int i = 0 ; i < num ; i++) {
    // for(int j = 0 ; j < num ; j++) {
    // System.out.print(arr[i][j] + "\t");
    // }
    // System.out.println();
    // System.out.println();
    // }
    // }
    //
    // private static int[][] getArr(int num) {
    // int[][] arr = new int[num][num];
    // if(num % 2 == 1) {
    // arr[num/2][num/2] = num*num;
    // }
    // int i = 0;
    // int j = 0;
    // int number = 1;
    // while(true) {
    //
    // while(j < num && arr[i][j] == 0) {
    // arr[i][j] = number++;
    // j++;
    // }
    // i++;
    // j--;
    // while(i < num && arr[i][j] == 0) {
    // arr[i][j] = number++;
    // i++;
    // }
    // i--;
    // j--;
    // while(j >= 0 && arr[i][j] == 0) {
    // arr[i][j] = number++;
    // j--;
    // }
    // j++;
    // i--;
    // while(i > 0 && arr[i][j] == 0) {
    // arr[i][j] = number++;
    // i--;
    // }
    // i++;
    // j++;
    // if(i == num / 2) {
    // break;
    // }
    // }
    // return arr;
    // }

    // class MyRunnable implements Runnable {
    //
    // @Override
    // public void run() {
    // for(int i = 1 ; i<= 1000 ; i++) {
    // System.out.println(Thread.currentThread().getName() + "..." + i);
    // }
    // }
    //
    // }
    //
    // private static void demo66() {
    // ExecutorService e = Executors.newFixedThreadPool(2);
    // e.submit(new MyRunnable());
    // e.submit(new MyRunnable());
    // e.shutdown();
    // }
    //
    // private static void demo65() {
    // MyRunnable mr = new MyRunnable();
    // ThreadGroup tg = new ThreadGroup("线程组");
    // Thread t1 = new Thread(tg, mr, "1");
    // Thread t2 = new Thread(tg, mr, "2");
    // System.out.println(t1.getThreadGroup().getName());
    // System.out.println(t2.getThreadGroup().getName());
    // }

    // class Demo {
    //
    // private int lock = 1;
    // private ReentrantLock r = new ReentrantLock();
    //
    // private Condition c1 = r.newCondition();
    // private Condition c2 = r.newCondition();
    // private Condition c3 = r.newCondition();
    //
    // public void print1() throws InterruptedException {
    // r.lock();
    // if(lock != 1) {
    // c1.await();
    // }
    // System.out.println("1锁了");
    // lock = 2;
    // c2.signal();
    // r.unlock();
    // }
    //
    // public void print2() throws InterruptedException {
    // r.lock();
    // if(lock != 2) {
    // c2.await();
    // }
    // System.out.println("2锁了");
    // lock = 3;
    // c3.signal();
    // r.unlock();
    // }
    //
    // public void print3() throws InterruptedException {
    // r.lock();
    // if(lock != 3) {
    // c3.await();
    // }
    // System.out.println("3锁了");
    // lock = 1;
    // c1.signal();
    // r.unlock();
    // }
    // }
    //
    // private static void demo64() {
    // final Demo d = new Demo();
    //
    // new Thread() {
    // public void run() {
    // while(true) {
    // try {
    // d.print1();
    // } catch (InterruptedException e) {
    //
    // e.printStackTrace();
    // }
    // }
    // }
    // }.start();
    //
    // new Thread() {
    // public void run() {
    // while(true) {
    // try {
    // d.print2();
    // } catch (InterruptedException e) {
    //
    // e.printStackTrace();
    // }
    // }
    // }
    // }.start();
    //
    // new Thread() {
    // public void run() {
    // while(true) {
    // try {
    // d.print3();
    // } catch (InterruptedException e) {
    //
    // e.printStackTrace();
    // }
    // }
    // }
    // }.start();
    // }

    // class Demo {
    //
    // private int lock = 1;
    //
    // public void print1() throws InterruptedException {
    // synchronized(this) {
    // while(lock != 1) {
    // this.wait();
    // }
    // System.out.println("1锁了");
    // lock = 2;
    // this.notifyAll();
    // }
    // }
    //
    // public void print2() throws InterruptedException {
    // synchronized(this) {
    // while(lock != 2) {
    // this.wait();
    // }
    // System.out.println("2锁了");
    // lock = 3;
    // this.notifyAll();
    // }
    // }
    //
    // public void print3() throws InterruptedException {
    // synchronized(this) {
    // while(lock != 3) {
    // this.wait();
    // }
    // System.out.println("3锁了");
    // lock = 1;
    // this.notifyAll();
    // }
    // }
    // }
    //
    // private static void demo63() {
    // Demo d = new Demo();
    // new Thread() {
    // public void run() {
    // while(true) {
    // try {
    // d.print1();
    // } catch (InterruptedException e) {
    //
    // e.printStackTrace();
    // }
    // }
    // }
    // }.start();
    //
    // new Thread() {
    // public void run() {
    // while(true) {
    // try {
    // d.print2();
    // } catch (InterruptedException e) {
    //
    // e.printStackTrace();
    // }
    // }
    // }
    // }.start();
    //
    // new Thread() {
    // public void run() {
    // while(true) {
    // try {
    // d.print3();
    // } catch (InterruptedException e) {
    //
    // e.printStackTrace();
    // }
    // }
    // }
    // }.start();
    // }

    // class Demo {
    //
    // private int lock = 1;
    //
    // public void print1() throws InterruptedException {
    // synchronized(this) {
    // if(lock != 1) {
    // this.wait();
    // }
    // System.out.println("1锁了");
    // lock = 2;
    // this.notify();
    // }
    // }
    //
    // public void print2() throws InterruptedException {
    // synchronized(this) {
    // if(lock != 2) {
    // this.wait();
    // }
    // System.out.println("2锁了");
    // lock = 1;
    // this.notify();
    // }
    // }
    // }

    // private static void demo62() {
    // Demo d = new Demo();
    // new Thread() {
    // public void run() {
    //
    // while(true) {
    // try {
    // d.print1();
    // } catch (InterruptedException e) {
    //
    // e.printStackTrace();
    // }
    // }
    // }
    // }.start();
    //
    // new Thread() {
    // public void run() {
    //
    // while(true) {
    // try {
    // d.print2();
    // } catch (InterruptedException e) {
    //
    // e.printStackTrace();
    // }
    // }
    // }
    // }.start();
    // }

    // class MyTimerTask extends TimerTask {
    //
    // public void run() {
    // System.out.println("我要敲一万行代码");
    // }
    // }

    // private static void demo61() {
    // Timer r = new Timer();
    // r.schedule(new MyTimerTask(), new Date(), 3000);
    //// while(true) {
    //// System.out.println(new Date());
    //// Thread.sleep(1000);
    //// }
    // }

    // private static void demo60() {
    // new Thread() {
    // public void run() {
    // while(true) {
    // synchronized(lock1) {
    // System.out.println("拿到筷子1等待筷子2");
    // synchronized(lock2) {
    // System.out.println("拿到筷子2");
    // }
    // }
    // }
    // }
    // }.start();
    //
    // new Thread() {
    // public void run() {
    // while(true) {
    // synchronized(lock2) {
    // System.out.println("拿到筷子2等待筷子1");
    // synchronized(lock1) {
    // System.out.println("拿到筷子1");
    // }
    // }
    // }
    // }
    // }.start();
    // }

    // private static void demo59() {
    // //使用synchronized关键字修饰一个方法, 该方法中所有的代码都是同步的
    // Ticket t1 = new Ticket("窗口1");
    // Ticket t2 = new Ticket("窗口2");
    // Ticket t3 = new Ticket("窗口3");
    // Ticket t4 = new Ticket("窗口4");
    // t1.start();
    // t2.start();
    // t3.start();
    // t4.start();
    // }
    //
    // class Ticket extends Thread {
    //
    // private String lock = "";
    //
    // private static int ticket = 100;
    //
    // public Ticket() {}
    //
    // public Ticket(String name) {
    // this.setName(name);
    // }
    //
    // public void run() {
    // while(true) {
    // synchronized(lock) {
    // if(ticket <= 0) {
    // break;
    // }
    // try {
    // Thread.sleep(10);
    // } catch (InterruptedException e) {
    //
    // e.printStackTrace();
    // }
    // System.out.println(this.getName() + "第" + ticket-- + "张票卖出去了");
    // }
    // }
    // }
    // }

    // private static void demo58() {
    // /*
    // * ###23.08_集合练习(约瑟夫环)
    // * 幸运数字
    // */
    // int key = getLucky(8);
    // System.out.println(key);
    // }
    //
    // private static int getLucky(int num) {
    // ArrayList<Integer> list = new ArrayList<>();
    // for(int i = 1 ; i <= num ; i++) {
    // list.add(i);
    // }
    // int knife = 1;
    // for(int i = 0 ; list.size()!= 1 ; i++) {
    // if(i == list.size()) {
    // i = 0;
    // }
    // if(knife % 3 == 0) {
    // list.remove(i--);
    // }
    // knife++;
    // }
    // return list.get(0);
    // }

    // private static void demo57() {
    // /*
    // * ###23.07_递归练习(1000的阶乘尾部零的个数)
    // * 需求:求出1000的阶乘尾部零的个数,用递归做
    // */
    // int num = getZero();
    // System.out.println(num);
    // }
    //
    // private static int getZero() {
    // BigInteger bi = getX(new BigInteger(1000 + ""));
    // String line = new StringBuilder(bi.toString()).reverse().toString();
    // int num = 0;
    // for(int i = 0 ; i < line.length() ; i++) {
    // if('0' != line.charAt(i)) {
    // break;
    // }
    // num++;
    // }
    // return num;
    // }
    //
    //
    // private static BigInteger getX(BigInteger bigInteger) {
    // BigInteger bi2 = new BigInteger(1 + "");
    // if(bigInteger.equals(bi2)) {
    // return bigInteger;
    // }
    // return bigInteger.multiply(getX(bigInteger.subtract(bi2)));
    // }

    // private static void demo56() {
    // /*
    // * ###23.06_递归练习(1000的阶乘所有零和尾部零的个数)
    // * 需求:求出1000的阶乘所有零和尾部零的个数,不用递归做
    // */
    // int[] arr = getZero();
    // System.out.println(arr[0]);
    // System.out.println(arr[1]);
    // }
    //
    // private static int[] getZero() {
    // int[] arr = {0,0};
    // BigInteger bi1 = new BigInteger(1 + "");
    // for(int i = 1 ; i <= 1000 ; i++) {
    // BigInteger bi2 = new BigInteger(i + "");
    // bi1 = bi1.multiply(bi2);
    // }
    // String line = bi1.toString();
    // char[] c = line.toCharArray();
    // for (char d : c) {
    // if('0' == d) {
    // arr[0]++;
    // }
    // }
    // StringBuilder sb = new StringBuilder(line);
    // sb.reverse();
    // for(int i = 0 ; i < sb.length() ; i++) {
    // if('0' != sb.charAt(i)) {
    // break;
    // }
    // arr[1]++;
    // }
    // return arr;
    // boolean b = true;
    // int num = 0;
    // String line = new StringBuilder(bi1.toString()).reverse().toString();
    // for (int i = 0; i < line.length() ; i++) {
    // if('0' == line.charAt(i)) {
    // arr[0]++;
    // }
    // if('0' != line.charAt(i)) {
    // if(b) {
    // num = arr[1];
    // b = false;
    // }
    // }
    // arr[1]++;
    // }
    // arr[1] = num;
    // return arr;
    // }

    // private static void demo55() {
    // /*
    // * ##23.05_递归练习(斐波那契数列)
    // * 不死神兔
    // * 故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
    // *
    // 在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，一年内没有发生死亡，
    // * 问：一对刚出生的兔子，一年内繁殖成多少对兔子?
    // * 1 1 2 3 5 8 13
    // * 第一个月一对小兔子 1
    // * 第二个月一对大兔子 1
    // * 第三个月一对大兔子生了一对小兔子 2
    // * 第四个月一对大兔子生了一对小兔子
    // * 一对小兔子长成大兔子 3
    // * 第五个月两对大兔子生两对小兔子
    // * 一对小兔子长成大兔子 5
    // */
    //
    // //rabbit();
    // System.out.println(getrabbit(12));
    // }
    //
    // private static int getrabbit(int i) {
    // if(i == 1 || i == 2) {
    // return 1;
    // }
    // return getrabbit(i - 1) + getrabbit(i - 2);
    // }
    //
    // private static void rabbit() {
    // int[] month = new int[10];
    // month[0] = 1;
    // month[1] = 1;
    // for(int i = 2 ; i < month.length ; i++) {
    // month[i] = month[i - 1] + month[i - 2];
    // }
    // System.out.println(month[9]);
    // }

    // private static void demo54() {
    // /*
    // * ###23.04_File类递归练习(按层级打印) 需求:4,从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印,
    // * 例如:
    // * aaa是文件夹,里面有bbb.txt,ccc.txt,ddd.txt这些文件,有eee这样的文件夹,eee中有fff.txt和ggg.
    // * txt,打印出层级来 aaa bbb.txt ccc.txt ddd.txt
    // *
    // * eee fff.txt ggg.txt
    // */
    // File dir = getDir();
    // show(dir, 0);
    // }
    //
    // private static void show(File dir, int num) {
    // File[] file = dir.listFiles();
    // for (File file2 : file) {
    // for (int i = 0; i < num; i++) {
    // System.out.print("\t");
    // }
    // System.out.println(file2.getName());
    // if (file2.isDirectory()) {
    // show(file2, num + 1);
    // }
    // }
    // }

    // private static void demo53() throws IOException {
    // /*###23.03_File类递归练习(拷贝)
    // * 需求:3,从键盘接收两个文件夹路径,把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
    // * */
    // System.out.println("请输入需要拷贝的文件夹:");
    // File file1 = getDir();
    // System.out.println("请输入目标文件夹:");
    // File file2 = getDir();
    // copy(file1,file2);
    // }
    //
    // private static void copy(File file1, File file2) throws IOException {
    // File newFile = new File(file2,file1.getName());
    // newFile.mkdir();
    // File[] file = file1.listFiles();
    // for (File file3 : file) {
    // if(file3.isFile()) {
    // if(file3.isHidden() || !file3.canRead()) {
    // System.out.println(file3.getPath() + " 文件含有访问权限,无法访问");
    // continue;
    // }
    // FileInputStream fis = new FileInputStream(file3);
    // FileOutputStream fos = new FileOutputStream(new
    // File(newFile.getAbsolutePath(),file3.getName()));
    // byte[] arr = new byte[8192];
    // int len;
    // while((len = fis.read(arr)) != -1) {
    // fos.write(arr, 0, len);
    // }
    // fis.close();
    // fos.close();
    // System.out.println(file3.getName() + " 文件拷贝完成");
    // } else {
    // if(file3.isHidden() || !file3.canRead()) {
    // System.out.println(file3.getPath() + " 文件夹含有访问权限,无法访问");
    // continue;
    // }
    // copy(file3,newFile);
    // }
    // }
    //
    // }

    // private static void demo52() {
    // /*###23.02_File类递归练习(删除该文件夹)
    // * 需求:2,从键盘接收一个文件夹路径,删除该文件夹
    // */
    // File dir = getDir();
    // long[] arr = {0,0,0};
    // delete(dir,arr);
    // System.out.println("总计删除了" + arr[0] + "字节的数据\n" + arr[1] + "个文件\n" +
    // arr[2] + "个文件夹");
    // }

    // private static void delete(File dir,long[] arr) {
    // File[] file = dir.listFiles();
    // for (File file2 : file) {
    // if(file2.isFile()) {
    // arr[0] += file2.length();
    // arr[1] += 1;
    // file2.delete();
    // System.out.println(file2.getPath() + " 文件已删除");
    // } else {
    // if(file2.isHidden() || !file2.canRead()) {
    // System.out.println(file2.getPath() + "\n含有访问权限,无法访问");
    // continue;
    // }
    // arr[2] += 1;
    // delete(file2,arr);
    // file2.delete();
    // System.out.println(file2.getPath() + " 文件夹已删除");
    // }
    // }
    // dir.delete();
    // System.out.println(dir.getPath() + " 文件夹已删除");
    // }

    // private static void demo51() {
    // /*
    // * ###23.01_File类递归练习(统计该文件夹大小)
    // * 需求:1,从键盘接收一个文件夹路径,统计该文件夹大小
    // */
    // File dir = getDir();
    // long[] arr = {0,0,0};
    // show(dir,arr);
    // System.out.println("占用" + arr[0] + "个字节");
    // System.out.println("共有" + arr[1] + "个文件," + arr[2] + "个文件夹");
    // }
    //
    // private static void show(File dir, long[] arr) {
    // File[] file = dir.listFiles();
    // for (File file2 : file) {
    // if(file2.isFile()) {
    // arr[1]++;
    // arr[0] += file2.length();
    // } else {
    // if(file2.isHidden() || !file2.canRead()) {
    // System.out.println(file2.getPath() + "\n文件夹含有访问权限,无法访问");
    // continue;
    // }
    // arr[2]++;
    // show(file2,arr);
    // }
    // }
    // }

    // private static File getDir() {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("请输入一个文件夹路径:");
    // while (true) {
    // File file = new File(sc.nextLine());
    // if (!file.exists()) {
    // System.out.println("您输入的不是文件夹路径,请重新输入");
    // continue;
    // } else if (file.isFile()) {
    // System.out.println("您输入的是文件路径,请重新输入");
    // continue;
    // } else {
    // return file;
    // }
    // }
    // }
    //
    // private static void demo50() throws FileNotFoundException, IOException {
    // BufferedInputStream bis = new BufferedInputStream(new
    // FileInputStream("shamo.jpg"));
    // BufferedOutputStream bos = new BufferedOutputStream(new
    // FileOutputStream("copy.jpg"));
    // int b;
    // while ((b = bis.read()) != -1) {
    // bos.write(b);
    // }
    // bis.close();
    // bos.close();
    // }

    // private static void demo49() throws FileNotFoundException, IOException {
    // FileInputStream fis = new FileInputStream("b.txt");
    // FileOutputStream fos = new FileOutputStream("a.txt");
    // int b;
    // while((b = fis.read()) != -1) {
    // fos.write(b);
    // }
    // fis.close();
    // fos.close();
    // }

    // private static void demo48() throws IOException {
    // // PrintStream ps = System.out;
    // // ps.println(97);
    // // System.out.println(ps);
    // // ps.println("abc");
    // // System.out.println(ps);
    // // ps.println(new Student("张三",23));
    // // System.out.println(ps);
    // // ps = null;
    // // System.out.println(ps);
    // PrintWriter pw = new PrintWriter(new FileWriter("a.txt"));
    // pw.write(97);
    // pw.println("abc");
    // pw.println('g');
    // pw.println(new Student("张三", 23));
    // pw.close();
    // }

    // private static void demo47() throws IOException, FileNotFoundException,
    // ClassNotFoundException {
    // // ArrayList<Student> list = new ArrayList<>();
    // // list.add(new Student("张三", 23));
    // // list.add(new Student("李四", 24));
    // // list.add(new Student("王五", 25));
    // // list.add(new Student("赵六", 26));
    // // ObjectOutputStream oos = new ObjectOutputStream(new
    // FileOutputStream("e.txt"));
    // // oos.writeObject(list);
    // // oos.close();
    // ObjectInputStream ois = new ObjectInputStream(new
    // FileInputStream("e.txt"));
    // ArrayList list = (ArrayList) ois.readObject();
    // System.out.println(list);
    // }

    // private static void demo46() throws IOException, FileNotFoundException,
    // ClassNotFoundException {
    // ObjectInputStream ois = new ObjectInputStream(new
    // FileInputStream("e.txt"));
    // Object obj1 = ois.readObject();
    // Object obj2 = ois.readObject();
    // System.out.println(obj1);
    // System.out.println(obj2);
    // ois.close();
    // }

    // private static void demo45() throws FileNotFoundException, IOException {
    // //定义一个文件输入流,调用read(byte[] b)方法,将a.txt文件中的内容打印出来(byte数组大小限制为5)
    // FileInputStream fis = new FileInputStream("a.txt");
    // ByteArrayOutputStream baos = new ByteArrayOutputStream();
    // int len;
    // byte[] arr = new byte[5];
    // while((len = fis.read(arr)) != -1) {
    // baos.write(arr, 0, len);
    // }
    // System.out.println(baos);
    // fis.close();
    // }

    // private static void demo44() throws FileNotFoundException, IOException {
    // FileInputStream fis = new FileInputStream("d.txt");
    // ByteArrayOutputStream baos = new ByteArrayOutputStream();
    // int b;
    // while((b = fis.read()) != -1) {
    // baos.write(b);
    // }
    // byte[] arr = baos.toByteArray();
    // System.out.println(Arrays.toString(arr));
    // System.out.println(baos);
    // fis.close();
    // }

    // private static void demo43() throws FileNotFoundException, IOException {
    // FileInputStream fis1 = new FileInputStream("a.txt");
    // FileInputStream fis2 = new FileInputStream("b.txt");
    // FileInputStream fis3 = new FileInputStream("c.txt");
    // Vector<InputStream> v = new Vector<>();
    // v.add(fis1);
    // v.add(fis2);
    // v.add(fis3);
    // Enumeration<InputStream> en = v.elements();
    // SequenceInputStream sis = new SequenceInputStream(en);
    // FileOutputStream fos = new FileOutputStream("d.txt");
    // byte[] arr = new byte[8192];
    // int len;
    // while((len = sis.read(arr)) != -1) {
    // fos.write(arr, 0, len);
    // }
    // sis.close();
    // fos.close();
    // }

    // private static void demo42() throws UnsupportedEncodingException,
    // FileNotFoundException, IOException {
    // /*
    // * * 1.会用BufferedReader读取GBK码表和UTF-8码表的字符
    // * 2.会用BufferedWriter写出字符到GBK码表和UTF-8码表的文件中
    // * 3.会使用BufferedReader从键盘读取一行
    // */
    // //buffered();
    // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new
    // FileOutputStream("i.txt"), "gbk"));
    // bw.write("你好你好");
    // bw.newLine();
    // bw.write("123");
    // bw.close();
    // }
    //
    // private static void buffered() throws UnsupportedEncodingException,
    // FileNotFoundException, IOException {
    // BufferedReader br = new BufferedReader(new InputStreamReader(new
    // FileInputStream("b.txt"), "gbk"));
    // String line;
    // while((line = br.readLine()) != null) {
    // System.out.println(line);
    // }
    // br.close();
    // }

    // private static void demo41() {
    // //* 需求:从键盘输入接收一个文件夹路径,打印出该文件夹下所有的.java文件名
    // File file = getFile();
    // int[] arr = {0};
    // showJava(file,arr);
    // System.out.println("共有" + arr[0] + "个");
    // }
    //
    // private static void showJava(File file, int[] arr) {
    // File[] fileArr = file.listFiles();
    // for (File file2 : fileArr) {
    // if(file2.isFile()) {
    // if(file2.getName().endsWith(".java")) {
    // System.out.println(file2.getPath());
    // arr[0]++;
    // }
    // } else {
    // if(file2.isHidden() || !file2.canRead()) {
    // System.out.println(file2.getPath() + "含有访问权限无法访问");
    // continue;
    // }
    // showJava(file2,arr);
    // }
    // }
    // }
    //
    // private static File getFile() {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("请输入一个文件夹路径,用户获取所有java文件名:");
    // while(true) {
    // File file = new File(sc.nextLine());
    // if(!file.exists()) {
    // System.out.print("您输入的不是文件夹路径,请重新输入:");
    // continue;
    // } else if(file.isFile()) {
    // System.out.print("您输入的文件路径,请重新输入:");
    // continue;
    // } else {
    // return file;
    // }
    // }
    // }
    //
    // private static void demo40() throws FileNotFoundException, IOException {
    // // 当我们下载一个试用版软件,没有购买正版的时候,每执行一次就会提醒我们还有多少次使用机会用学过的IO流知识,模拟试用版软件,试用10次机会
    // // ,执行一次就提示一次您还有几次机会,如果次数到了提示请购买正版
    // BufferedReader br = new BufferedReader(new FileReader("config.txt"));
    // String line = br.readLine();
    // int num = Integer.parseInt(line);
    // if(num > 0) {
    // BufferedWriter bw = new BufferedWriter(new FileWriter("config.txt"));
    // System.out.println("您还有" + num + "次机会");
    // bw.write(--num + "");
    // bw.close();
    // } else {
    // System.out.println("您已用完了所有机会");
    // }
    // br.close();
    // }

    // private static void demo39() throws FileNotFoundException, IOException {
    // //获取一个文本上每个字符出现的次数,将结果写在times.txt上
    // BufferedReader br = new BufferedReader(new FileReader("a.txt"));
    // BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
    // TreeMap<Character, Integer> tm = new TreeMap<>();
    // int i;
    // while((i = br.read()) != -1) {
    // char c = (char)i;
    // tm.put(c, tm.containsKey(c) ? tm.get(c) + 1 : 1);
    // }
    // for (char ch : tm.keySet()) {
    // bw.write(ch + ":" + tm.get(ch));
    // bw.newLine();
    // }
    // br.close();
    // bw.close();
    // }

    // private static void demo38() throws UnsupportedEncodingException,
    // FileNotFoundException, IOException {
    // //* FileReader是使用默认码表读取文件, 如果需要使用指定码表读取, 那么可以使用InputStreamReader(字节流,编码表)
    //// * FileWriter是使用默认码表写出文件, 如果需要使用指定码表写出,
    // 那么可以使用OutputStreamWriter(字节流,编码表)
    // BufferedReader br = new BufferedReader(new InputStreamReader(new
    // FileInputStream("a.txt"), "GBK"));
    // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new
    // FileOutputStream("b.txt"), "UTF-16"));
    // int len;
    // while((len = br.read()) != -1) {
    // bw.write(len);
    // }
    // br.close();
    // bw.close();
    // }

    // private static void demo37() throws FileNotFoundException, IOException {
    // //将一个文本文档上的文本反转,第一行和倒数第一行交换,第二行和倒数第二行交换
    // BufferedReader br = new BufferedReader(new FileReader("a.txt"));
    // BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
    // String line;
    // while((line = br.readLine()) != null) {
    // line = new StringBuilder(line).reverse().toString();
    // bw.write(line);
    // bw.newLine();
    // }
    // br.close();
    // bw.close();
    // }

    // private static void demo66() {
    /*
     * 基本流复制 (1)一次读取单个字节(20.06_IO流(拷贝图片).avi)
     * (2)一次读取多个字节(20.10_IO流(定义小数组的标准格式).avi) 字节缓冲流复制(只需要将对应的基本流换成对应的缓冲流)
     * (1)一次读取单个字节(20.11_IO流(BufferedInputStream和BufferOutputStream拷贝).avi)
     * (2)一次读取多个字节(自己完成)
     */
    // FileInputStream fis = new FileInputStream("E:\\笔记\\20
    // 字节流\\video\\20.06_IO流(拷贝图片).avi");
    // FileOutputStream fos = new FileOutputStream("copy.avi");
    // int b;
    // while((b = fis.read()) != -1) {
    // fos.write(b);
    // }
    // fis.close();
    // fos.close();
    // FileInputStream fis = new FileInputStream("E:\\笔记\\20
    // 字节流\\video\\20.06_IO流(拷贝图片).avi");
    // FileOutputStream fos = new FileOutputStream("E:\\copy.avi");
    // byte[] arr = new byte[8192];
    // int len;
    // while((len = fis.read(arr)) != -1) {
    // fos.write(arr, 0, len);
    // }
    // fis.close();
    // fos.close();
    // BufferedInputStream bis = new BufferedInputStream(new
    // FileInputStream("E:\\笔记\\20 字节流\\video\\20.06_IO流(拷贝图片).avi"));
    // BufferedOutputStream bos = new BufferedOutputStream(new
    // FileOutputStream("F:\\copy.avi"));
    // byte[] arr = new byte[8192];
    // int b;
    // while((b = bis.read(arr)) != -1) {
    // bos.write(arr,0,b);
    // }
    // bis.close();
    // bos.close();
    // //2、用自己能想到的办法实现需求:求5的阶乘(n的阶乘 = n*(n-1)*(n-2)*...*1)！
    // int sum = 1;
    // int num = 5;
    // for(int i = 1 ; i <= num ; i++) {
    // sum *= i;
    // }
    // System.out.println(sum);
    // //System.out.println(show(num));
    // }
    //
    // private static int show(int num) {
    // if(num == 1) {
    // return 1;
    // }
    // return num * show(num - 1);
    // }

    // private static void demo35() {
    // /*
    // * 3,提示用户在控制台输入5个字符串,然后将这5个字符串存入到list集合中(12分) a:将list中的字符串长度小于3的元素删除
    // * b:将list中字符串末尾是a的修改为末尾是0 比如:list中有dfsfa修改为dfsf0
    // * c:将修改后的list中的所有元素打印到控制台上(用两种方式)
    // */
    // start();
    // }
    //
    // private static void start() {
    // ArrayList<String> list = getList();
    // demand(list);
    // }
    //
    // private static void demand(ArrayList<String> list) {
    // for (int i = 0; i < list.size(); i++) {
    // if (list.get(i).length() < 3) {
    // list.remove(i);
    // i--;
    // }
    // }
    // for (int i = 0; i < list.size(); i++) {
    // if (list.get(i).endsWith("a")) {
    // if(list.get(i).length() == 1) {
    // list.set(i, "0");
    // } else {
    // StringBuilder sb = new StringBuilder(list.get(i));
    // list.set(i, sb.replace(sb.length()-1, sb.length(),"0").toString());
    // }
    // }
    // }
    //
    // System.out.println();
    // System.out.println("便利方式1:foreach(增强for)循环:");
    // int num = 1;
    // for (String string : list) {
    // System.out.println(" 字符串 " + num + " : " + string);
    // num++;
    // }
    //
    // num = 1;
    //
    // System.out.println();
    // System.out.println("便利方式2:迭代器Iterator:");
    // Iterator<String> it = list.iterator();
    // while (it.hasNext()) {
    // String s = it.next();
    // System.out.println("字符串 " + num + " : " + s);
    // num++;
    // }
    // System.out.println();
    // System.out.println("已完成需求,感谢您的使用");
    // }
    //
    // private static ArrayList<String> getList() {
    // Scanner sc = new Scanner(System.in);
    // ArrayList<String> list = new ArrayList<>();
    // int count = 1;
    // while (list.size() < 5) {
    // System.out.print("请输入第" + count + "个字符串:");
    // list.add(sc.nextLine());
    // System.out.println("第" + count + "个字符串添加成功.");
    // count++;
    // }
    // return list;
    // }

    // private static void demo34() {
    // /*
    // * 2,编写一个方法:查询用户输入的路径下指定扩展名文件的个数(10分)
    // 方法描述:将用户输入的路径以及指定的扩展名传入该方法中,返回该目录下所有符合该扩展名文件的个数
    // */
    // ArrayList<String> list = getDir();
    // File dir = new File(list.get(0));
    // int[] arr = {0};
    // show(dir,list.get(1),arr);
    // System.out.println("共有" + arr[0] + "个");
    // }
    //
    // private static void show(File dir, String string, int[] arr) {
    // File[] file = dir.listFiles();
    // for (File file2 : file) {
    // if(file2.isFile()) {
    // if(file2.getName().endsWith(string)) {
    // System.out.println(file2.getAbsoluteFile());
    // arr[0]++;
    // }
    // } else {
    // if(file2.isHidden() || !file2.canRead()) {
    // System.out.println(file2.getAbsolutePath() + "含有访问权限,无法访问.");
    // continue;
    // }
    // show(file2.getAbsoluteFile(),string,arr);
    // }
    // }
    // }
    //
    // private static ArrayList<String> getDir() {
    // Scanner sc = new Scanner(System.in);
    // ArrayList<String> list = new ArrayList<>();
    // boolean b = false;
    // while(true) {
    // if(!b) {
    // System.out.print("请输入一个文件夹路径,用于获取指定的后缀名文件:");
    // File dir = new File(sc.nextLine());
    // if(!dir.exists()) {
    // System.out.println("您输入的不是文件夹路径,请重新输入");
    // } else if(dir.isFile()) {
    // System.out.println("您输入的是文件路径,请重新输入");
    // } else {
    // list.add(dir.getAbsolutePath());
    // b = true;
    // }
    // } else {
    // System.out.print("请输入一个后缀名,用于查找(格式: .xxx ):");
    // String clientIn = sc.nextLine();
    // String regex = "[\\.][a-z]+";
    // if(clientIn.matches(regex)) {
    // list.add(clientIn);
    // return list;
    // } else {
    // System.out.println("后缀名输入错误.请重新输入");
    // }
    // }
    //
    // }
    // }

    // 1,假设某小卖铺钱柜仅有1元和5毛的硬币各若干,这时来了一个顾客想兑换一张20元的钞票(8分)
    // private static void demo33() {
    // int money = getMoney();
    // show(money);
    // }

    // private static void show(int money) {
    // int ten = 10;
    // int five = 5;
    // int count = 1;
    // for(int i = 0 ; i <= money ; i += 5){
    // for (int j = 0 ; j <= money ; j += 10) {
    // if(i + j == money) {
    // System.out.print("第" + count + "种情况用了" + (i / 5) + "个五毛硬币.");
    // System.out.print("用了" + (j / 10) + "个一块硬币.");
    // System.out.println();
    // count++;
    // }
    // }
    // }
    // count--;
    // System.out.println("共有" + count + "种情况");
    // }
    //
    // private static int getMoney() {
    // Scanner sc = new Scanner(System.in);
    // while(true) {
    // try {
    // System.out.println("请输入一个金钱数,我们将计算兑换零的共有多少种情况(必须是五毛的倍数.)");
    // String clientIn = sc.nextLine();
    // Double i = Double.parseDouble(clientIn);
    // if(i % 0.5 == 0) {
    // return (int)(i*10);
    // } else {
    // System.out.println("输入的金额有误...请重新输入.");
    // }
    //
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.out.println("亲,可能是输入错误了,请重新输入试试.");
    // }
    // }
    // }

    // private static void demo32() {
    // /*
    // * ###23.01_File类递归练习(统计该文件夹大小)
    // * 需求:1,从键盘接收一个文件夹路径,统计该文件夹大小
    // */
    // File file = getFile2();
    // long[] arr = {0,0,0};
    // getSum(file,arr);
    // System.out.println("字节数为:" + arr[0] + "\n共有" + arr[1] + "个文件\n" + arr[2]
    // + "个文件夹");
    // }
    //
    // private static void getSum(File file,long[] arr) {
    // File[] newArr = file.listFiles();
    // for (File file2 : newArr) {
    // if(file2.isFile()) {
    // arr[0] += file2.length();
    // arr[1] += 1;
    // } else {
    // arr[2] += 1;
    // getSum(file2,arr);
    // }
    // }
    //
    // }
    //
    // public static File getFile2() {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("请输入一个文件夹路径,用于统计大小.");
    // while(true) {
    // File file = new File(sc.nextLine());
    // if(!file.exists()) {
    // System.out.println("您输入的不是一个文件夹路径,请重新输入");
    // } else if(file.isFile()) {
    // System.out.println("您输入的是一个文件路径,请重新输入");
    // } else {
    // return file;
    // }
    // }
    // }
    //
    // private static void demo31() {
    // // 需求：判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
    // File file = new File("E:\\文档");
    // getTxt(file);
    // }
    //
    // private static void getTxt(File file) {
    // File[] arr = file.listFiles();
    // for (File file2 : arr) {
    // if(file2.isFile() && file2.getName().endsWith(".jpg")) {
    // System.out.println(file2);
    // } else if(file2.isDirectory()) {
    // getTxt(file2);
    // }
    // }
    //
    // }
    //
    // private static void demo30() {
    // String aStr = " One ";
    // String bStr = aStr;
    // bStr = aStr.trim();
    // System.out.println("[" + aStr + "," + bStr + "]");
    // }
    //
    // private static void demo29() throws IOException {
    // String s = "aaabbbbbcaszxcwcz";
    // BufferedWriter bw = new BufferedWriter(new FileWriter("config.txt"));
    // bw.write(s);
    // bw.newLine();
    // char[] c= s.toCharArray();
    // TreeMap<Character, Integer> tm = new TreeMap<>();
    // for (char d : c) {
    // tm.put(d, tm.containsKey(d) ? tm.get(d) + 1 : 1);
    // }
    // StringBuilder sb = new StringBuilder();
    // for (Entry<Character, Integer> en : tm.entrySet()) {
    // sb.append(en.getKey() + ":" + en.getValue() + "\n");
    // bw.write(en.getKey() + ":" + en.getValue() + "\n");
    // }
    // System.out.println(sb);
    // bw.close();
    // }
    //
    // private static void demo28() throws UnsupportedEncodingException,
    // FileNotFoundException, IOException {
    // BufferedReader fr = new BufferedReader(new InputStreamReader(new
    // FileInputStream("a.txt"),"Utf-8"));
    // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new
    // FileOutputStream("b.txt"),"utf-8"));
    // int b;
    // while((b = fr.read()) != -1) {
    // bw.write(b);
    // }
    // System.out.println(fr);
    // System.out.println(bw);
    // fr.close();
    // bw.close();
    // }
    //
    // private static void demo27() throws FileNotFoundException, IOException {
    // /*FileInputStream fis1 = new FileInputStream("a.txt");
    // FileInputStream fis2 = new FileInputStream("b.txt");
    // FileInputStream fis3 = new FileInputStream("c.txt");
    // Vector<InputStream> v = new Vector<>();
    // v.add(fis1);
    // v.add(fis2);
    // v.add(fis3);
    // Enumeration<InputStream> en = v.elements();
    // SequenceInputStream sis = new SequenceInputStream(en);
    // FileOutputStream fos = new FileOutputStream("d.txt");
    // int b;
    // while((b = sis.read()) != -1) {
    // fos.write(b);
    // }
    // sis.close();
    // fos.close();*/
    // /*FileInputStream fis = new FileInputStream("a.txt");
    // ByteArrayOutputStream baos = new ByteArrayOutputStream();
    // int b;
    // while((b = fis.read()) != -1) {
    // baos.write(b);
    // }
    // System.out.println(baos);
    // fis.close();*/
    // //FileInputStream fis = new FileInputStream("a.txt");
    // //FileWriter fw = new FileWriter("b.txt");
    // //BufferedInputStream fis = new BufferedInputStream(new
    // FileInputStream("a.txt"));
    // //BufferedWriter fw = new BufferedWriter(new FileWriter("c.txt"));
    // /*FileReader fis = new FileReader("a.txt");
    // FileOutputStream fw = new FileOutputStream("d.txt");
    // int b;
    // while((b = fis.read()) != -1) {
    // fw.write(b);
    // }
    // fis.close();
    // fw.close();*/
    // /*FileInputStream fis = new FileInputStream("a.txt");
    // ByteArrayOutputStream baos = new ByteArrayOutputStream();
    // byte[] b = new byte[5];
    // int len;
    // while((len = fis.read(b)) != -1) {
    // baos.write(b,0,len);
    // }
    // System.out.println(baos);
    // fis.close();*/
    // /*BufferedInputStream fis = new BufferedInputStream(new
    // FileInputStream("a.txt")) ;
    // BufferedOutputStream fos = new BufferedOutputStream(new
    // FileOutputStream("b.txt"));
    // int b;
    // byte[] arr = new byte[3];
    // while((b = fis.read(arr)) != -1) {
    // fos.write(arr,0,b);
    // }
    // fis.close();
    // fos.close();*/
    // /*Person p1 = new Person("张三",23);
    // Person p2 = new Person("李四",24);
    // ObjectOutputStream oos = new ObjectOutputStream(new
    // FileOutputStream("e.txt"));
    // oos.writeObject(p1);
    // oos.writeObject(p2);
    // oos.close();
    // ObjectInputStream ois = new ObjectInputStream(new
    // FileInputStream("e.txt"));
    // Person p3 = (Person)ois.readObject();
    // Person p4 = (Person)ois.readObject();
    // System.out.println(p3);
    // System.out.println(p4);
    // ois.close();*/
    // /*ArrayList<Student> list = new ArrayList<>();
    // Student s1 = new Student("张三",23);
    // Student s2 = new Student("李四",24);
    // Student s3 = new Student("王五",25);
    // Student s4 = new Student("赵六",26);
    // list.add(s1);
    // list.add(s2);
    // list.add(s3);
    // list.add(s4);
    // ObjectOutputStream oos = new ObjectOutputStream(new
    // FileOutputStream("f.txt"));
    // oos.writeObject(list);
    // oos.close();
    // ObjectInputStream ois = new ObjectInputStream(new
    // FileInputStream("f.txt"));
    // ArrayList<Student> list2 = (ArrayList<Student>)ois.readObject();
    // ois.close();
    // for (Student student : list2) {
    // System.out.println(student);
    // }*/
    // /*PrintStream ps = System.out;
    // ps.println(123);
    // ps.write(56);
    // ps.println();
    // ps.println(new Student("张三",23));
    // Person p = null;
    // ps.println(p);
    // ps.close();*/
    // /*PrintWriter pw = new PrintWriter(new FileOutputStream("g.txt"));
    // pw.println(10);
    // pw.println();
    // pw.write(66);
    // pw.close();*/
    // /*System.setIn(new FileInputStream("a.txt"));
    // System.setOut(new PrintStream("b.txt"));
    //
    // InputStream is = System.in;
    // PrintStream ps = System.out;
    //
    // int b;
    // while((b = is.read()) != -1) {
    // ps.write(b);
    // }
    //
    // is.close();
    // ps.close();*/
    // /*System.setIn(new FileInputStream("shamo.jpg"));
    // System.setOut(new PrintStream("copy.jpg"));
    //
    // InputStream is = System.in;
    // PrintStream os = System.out;
    // int len;
    // byte[] arr = new byte[1024 * 8];
    //
    // while((len = is.read(arr)) != -1) {
    // os.write(arr,0,len);
    // }
    //
    // is.close();
    // os.close();*/
    // /*BufferedReader bis = new BufferedReader(new
    // InputStreamReader(System.in));
    // String line = bis.readLine();
    // System.out.println(line);
    // bis.close();*/
    // /*BufferedReader br = new BufferedReader(new
    // InputStreamReader(System.in));
    // System.out.println(br.readLine());
    // br.close();*/
    // /*Scanner sc = new Scanner(System.in);
    // String s = sc.nextLine();
    // System.out.println(s);*/
    // RandomAccessFile raf = new RandomAccessFile("h.txt", "rw");
    // raf.write(99);
    // raf.seek(10);
    // raf.write(97);
    // raf.seek(0);
    // raf.write(1);
    // raf.close();
    // }
    //
    // private static void demo26() throws IOException {
    // System.out.print("请输入目标");
    // File dir = getFile();
    // System.out.print("请输入copy");
    // File newDir = getFile();
    // copyDir(dir,newDir);
    // System.out.println("拷贝成功");
    // }
    //
    // private static void copyDir(File dir, File newDir) throws IOException {
    // File dir2 = new File(newDir, dir.getName());
    // dir2.mkdir();
    // File[] arr = dir.listFiles();
    // for (int i = 0; i < arr.length; i++) {
    // if(arr[i].isFile()) {
    // BufferedInputStream fis = new BufferedInputStream(new
    // FileInputStream(arr[i]));
    // BufferedOutputStream fos = new BufferedOutputStream(new
    // FileOutputStream(new File(dir2,arr[i].getName())));
    // int len;
    // while((len = fis.read()) != -1) {
    // fos.write(len);
    // }
    // fis.close();
    // fos.close();
    // } else {
    // copyDir(arr[i] , dir2);
    // }
    // }
    //
    // }
    //
    // private static File getFile() {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("文件夹地址值:");
    // while(true) {
    // File dir = new File(sc.nextLine());
    // if(!dir.exists()) {
    // System.out.println("您输入的不是文件路径,请重新输入");
    // } else if(dir.isFile()) {
    // System.out.println("您输入的是文件路径,请重新输入");
    // } else {
    // return dir;
    // }
    // }
    // }
    //
    // private static void demo25() throws FileNotFoundException, IOException {
    // FileOutputStream fos = new FileOutputStream("bbb.txt");
    // fos.write(97);
    // fos.write(98);
    // fos.write(99);
    // fos.close();
    // }
    //
    // private static void demo24() throws IOException {
    // ServerSocket server = new ServerSocket(44444);
    // Scanner sc = new Scanner(System.in);
    // while(true) {
    // Socket socket = server.accept();
    // new Thread() {
    // public void run() {
    // try {
    // BufferedReader br = new BufferedReader(new
    // InputStreamReader(socket.getInputStream()));
    // PrintStream ps = new PrintStream(socket.getOutputStream());
    // while(true) {
    // System.out.println(br.readLine());
    // ps.println(sc.nextLine());
    // }
    // } catch (IOException e) {
    //
    // e.printStackTrace();
    // }
    //
    // }
    // }.start();
    // }
    // }
    //
    // private static void demo23() {
    // String regex =
    // "[\u4e00-\u9fa5[a-zA-Z]]{2,5}[,][\\d]{1,3}[,][\\d]{1,3}[,][\\d]{1,3}";
    // System.out.println("张三,20,30,40".matches(regex));
    // }
    //
    // private static void demo22() {
    // HashSet<String> hs = new HashSet<>();
    // hs.add("d");
    // hs.add("a");
    // hs.add("z");
    // hs.add("cc");
    // hs.add("www");
    // System.out.println(hs);
    // }
    //
    // private static void demo21() {
    // ArrayList<Object> list = new ArrayList<>();
    // list.add("a");
    // list.add(123);
    // list.add("b");
    // list.add("a");
    // list.add("A");
    // list.add("a");
    // list.add("a");
    // list.add("a");
    //// ArrayList<Object> newList = new ArrayList<>();
    //// for (int i = 0; i < list.size(); i++) {
    //// if(!newList.contains(list.get(i))) {
    //// newList.add(list.get(i));
    //// }
    //// }
    //// System.out.println(newList);
    // TreeSet<Object> ts = new TreeSet<>(new Comparator<Object>() {
    //
    // @Override
    // public int compare(Object s1, Object s2) {
    // int num = s1.toString().compareTo(s2.toString());
    // return num;
    // }
    // });
    // ts.addAll(list);
    // list.clear();
    // list.addAll(ts);
    // System.out.println(list);
    // }
    //
    // private static void demo20() {
    // // int -> String
    // int i = 123;
    // String s1 = i + ""; //方法1 推荐
    // String s2 = String.valueOf(i); //方法2 推荐
    // Integer i2 = new Integer(i);
    // String s3 = i2.toString(); //方法3 不推荐
    // String s4 = Integer.toString(i); //方法4 不推荐
    // //String -> int
    // String s5 = "123";
    // int i3 = Integer.parseInt(s5); //方法1
    // int i4 = new Integer(s5).intValue();//方法2
    // }
    //
    // private static void demo19() {
    // int[] arr = {11,22,33,44,55};
    // int key = 12;
    // int min = 0;
    // int max = arr.length - 1;
    // int mid = (min + max) / 2;
    // while(min <= max) {
    // if(arr[mid] > key) {
    // max = mid - 1;
    // } else if (arr[mid] < key){
    // min = mid + 1;
    // } else {
    // System.out.println(mid);
    // System.exit(0);
    // }
    // mid = (min + max) / 2;
    // }
    // System.out.println(-(min + 1));
    // }
    //
    // private static void demo18() {
    // int[] arr = {55,22,44,11,33};
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if(arr[i] > arr[j]) {
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // }
    // }
    // }
    // System.out.println(Arrays.toString(arr));
    // }
    //
    // private static void demo17() {
    // int[] arr = {55,22,44,11,33};
    // for(int i = 0 ; i < arr.length - 1 ; i++) {
    // for (int j = 0; j < arr.length - 1 - i; j++) {
    // if(arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // System.out.println(Arrays.toString(arr));
    // }
    //
    // private static void demo16() {
    // //String,不可变的字符序列,下面为字符串缓冲区,可变,需要特别注意的是String类型虽然是引用数据类型,但是作为参数传递时,其值不会被改变,因为
    // // 必须得接收
    // String s = "ab1c";
    // String anotherString = "text";
    // String regex = "[\\d]+";
    // s.equals(anotherString); //boolean 比较两个字符串的值是否相等,常用
    // s.length(); //int 返回字符串的长度,常用
    // s.endsWith(anotherString); //boolean 判断是否以参数结尾
    // s.startsWith(anotherString); //boolean 判断是否以参数开头
    // s.trim(); //String 清楚字符串两端的空格,通常用于清理用户输入的手误
    // s.substring(1, 2); //String 从指定索引开始到指定索引结束截取字符串,字符串本身不改变,包含头不包含尾,
    // s.charAt(1); //char 返回指定索引处对应的字符
    // s.compareTo(anotherString); //int 通过字典顺序比较两个字符串
    // s.getBytes(); //byte[] 获取对应byte数组,网络编程时常用
    // s.toCharArray(); //char[] 获取对应char数组,常用
    // s.concat(anotherString); //String 讲字符串拼接,效果和+相等,不常用
    // s.equalsIgnoreCase(anotherString); //boolean 比较两个字符串值是否相等,不考虑大小写
    // s.hashCode(); //int 获取字符串的哈希码值
    // String.valueOf(new Object()); //String 将任意类型转换为String类型,常用
    // s.indexOf('b'); //int 返回指定字符在字符串中首次出现的位置,不存在则返回-1
    // s.indexOf(97, 1); //int 返回指定字符在字符串中从给定索引开始首次出现的位置,不存在返回-1
    // s.indexOf(anotherString); //int 返回指定字符串在字符串中首次出现的位置,不存在则返回-1
    // s.indexOf(anotherString, 1); //int 返回指定字符串在字符串中从给定索引开始首次出现的位置,不存在返回-1
    // s.compareToIgnoreCase(anotherString);//int 按照字典顺序
    // s.contains(anotherString); //boolean 判断是否包含子字符串,返回布尔类型
    // s.toUpperCase(); //String 将字符串转换为大写
    // s.toLowerCase(); //String 将字符串转换为小写
    // s.split(regex); //String[] 根据给定的正则分割字符串,
    // s.toString(); //String 获取此字符串的副本
    // s.replace('1', 'd'); //String 使用指定的字符替换字符串中的字符,如果字符不存在则返回原字符串
    // s.replaceAll(regex, anotherString); //String 使用指定字符串替换原字符串中匹配正则的子字符串
    // s.isEmpty(); //boolean 判断字符串是否为空
    // s.matches(regex); //boolean 判断字符串是否匹配给定的正则表达式
    //
    // //StringBuffer 线程安全,效率低,引用数据类型,可以改变
    // StringBuffer sb1 = new StringBuffer(); //空参构造
    // StringBuffer sb2 = new StringBuffer("abc"); //有参构造,通过给定的字符串赋值
    // sb1.append(new Object()); //StringBuffer 添加功能,不需要接收,常用 增
    // sb2.insert(1, new Object()); //StringBuffer 将给定的数据插入到索引中 增
    // sb2.replace(1, 2, anotherString); //StringBuffer
    // 使用给定的字符串替换从指定索引开始到指定索引结束,包含头不包含尾 改
    // sb2.delete(1, 2); //StringBuffer 删除从指定索引到指定索引,包含头不包含尾 删
    // sb2.deleteCharAt(1); //StringBuffer 删除指定位置的字符 删
    // sb2.charAt(1); //char 返回指定索引处的char值 查
    // sb2.indexOf(anotherString); //int 返回指定字符串在字符串中首次出现的位置,不存在则返回-1
    // sb2.indexOf(anotherString, 1); //int 返回指定字符串在字符串中从给定索引开始首次出现的位置,不存在返回-1
    // sb2.reverse(); //StringBuffer 反转字符串,常用
    // sb2.length(); //int 获取长度,常用
    // sb2.toString(); //String 转换为String,常用
    // sb2.equals(new Object()); //boolean 比较值是否相等
    //
    // StringBuilder sb6 = new StringBuilder("abc"); //线程不安全,效率高,1.5新特性
    // //方法同上,区别在于线程和效率问题
    // }
    //
    // private static void demo15() {
    // String line = "123abcAbc...你好";
    // int a,A,num,other;
    // a = A = num = other = 0;
    // for (int i = 0; i < line.length(); i++) {
    // char c = line.charAt(i);
    // if(c >= 48 && c <= 57) {
    // num++;
    // } else if(c >= 65 && c <= 91) {
    // A++;
    // } else if(c >= 97 && c <= 123) {
    // a++;
    // } else {
    // other++;
    // }
    // }
    // System.out.println(a + "\t" + A + "\t" + num + "\t" +other);
    // }
    //
    // private static void demo14() {
    // String line =
    // "heimawoaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoheima";
    // String key = "heima{1}";
    // int count = 0;
    //// while(line.contains(key)) { 方法1
    //// int index = line.indexOf(key);
    //// line = line.substring(index + key.length());
    //// count++;
    //// }
    //// System.out.println(count);
    //
    //// String[] arr = line.split(key); 错误方法
    //// if(line.startsWith(key) && line.endsWith(key)) {
    //// count += 2;
    //// } else if(line.startsWith(key) || line.endsWith(key)) {
    //// count += 1;
    //// }
    //// count += arr.length - 1;
    //// System.out.println(count);
    //
    //// while(line.contains(key)) { 错误方法
    //// line.replaceFirst(key, "");
    //// count++;
    //// }
    //// System.out.println(count);
    //
    //// int index = 0;
    //// while(line.) {
    //// index = line.indexOf(key , index);
    //// line += key.length();
    //// count++;
    //// }
    //// System.out.println(count);
    //// Pattern p = Pattern.compile(key);
    //// Matcher m = p.matcher(line);
    //// if(m.find()) {
    //// count++;
    //// m.group();
    //// }
    //// System.out.println(count);
    // }
    //
    // private static void demo13() {
    // int[] arr = {11,22,33,44,55};
    // for(int i = 0 ; i < arr.length / 2 ; i++) {
    // int temp = arr[i];
    // arr[i] = arr[arr.length - 1 - i];
    // arr[arr.length - 1 - i] = temp;
    // }
    // System.out.println(Arrays.toString(arr));
    // }
    //
    // private static void demo12() {
    // //System.out.println(System.getProperties());
    // String s1 = "abc";
    // String s2 = new String("abc");
    // System.out.println(s1==s2);
    // String s3 = "你好吗";
    // String s4 = "你";
    // String s5 = "好吗";
    // System.out.println(s3 == ("你" + "好吗"));
    // }
    //
    // private static void demo11() {
    // long l1 = System.currentTimeMillis();
    // BigInteger num1 = new BigInteger("1");
    // for (int i = 1; i < 50000; i++) {
    // BigInteger i2 = new BigInteger(Integer.toString(i));
    // num1 = num1.multiply(i2);
    // }
    // BigInteger num2 = new BigInteger("1");
    // for (int i = 1; i < 50000; i++) {
    // BigInteger i2 = new BigInteger(Integer.toString(i));
    // num2 = num2.multiply(i2);
    // }
    // long l2 = System.currentTimeMillis();
    // System.out.println(l2 - l1);
    // }
    //
    // private static void demo10() {
    // long l1 = System.currentTimeMillis();
    // new Thread() {
    // public void run() {
    // long l1 = System.currentTimeMillis();
    // BigInteger num1 = new BigInteger("1");
    // for (int i = 1; i < 50000; i++) {
    // BigInteger i2 = new BigInteger(Integer.toString(i));
    // num1 = num1.multiply(i2);
    // }
    // long l2 = System.currentTimeMillis();
    // System.out.println(l2 - l1);
    // }
    // }.start();
    //
    // new Thread() {
    // public void run() {
    // long l1 = System.currentTimeMillis();
    // BigInteger num2 = new BigInteger("1");
    // for (int i = 1; i < 50000; i++) {
    // BigInteger i2 = new BigInteger(Integer.toString(i));
    // num2 = num2.multiply(i2);
    // }
    // long l2 = System.currentTimeMillis();
    // System.out.println(l2 - l1);
    // }
    // }.start();
    // }
    //
    // private static void demo9() {
    // /*
    // * StringBuffer: lang包下
    // * 构造方法:
    // * StringBuffer();
    // * StringBuffer(String s);
    // * StringBuffer(charSequence c);
    // * 方法:
    // * SB append(Object obj);
    // * SB reverse();
    // * SB deleteCharAt(int index);
    // * SB delete(int index , int end); 包含头不包含尾
    // * SB insert(int index , Object obj); 插入,包括基本数据类型和引用数据类型
    // * int indexOf(String , int start) 返回第一次出现的位置索引,从指定位置开始
    // * int length();
    // * int indexOf(String)
    // * char charAt(int index)
    // * SB replace(String newString , int start , int end)
    // * String subString(int index) 从指定位置开始截取字符串，默认到末尾，返回String(重点);
    // * String subString(int index , int end) 从指定位置开始到指定位置结束，包含头不包含尾，返回String
    // *
    // */
    // System.out.println("demo9");
    // }
    //
    // private static void demo8() {
    // /*
    // * String:long包下
    // * 构造方法
    // * 1: String() 空构造
    // * 2: String(String s) 根据指定的字符串生成对象
    // * 3: String(byte[]) 根据给定的byte数组生成字符串
    // * 3: String(char[]) 根据给定的字符数组生成字符串
    // * 4: String(char[] , int start , int end) 根据给定的字符数组和开始结束索引生成字符串(包含头不包含尾)
    // * 4: String(byte[] , int start , int end) 根据给定的字节数组和开始结束索引生成字符串(包含头不包含尾)
    // * 方法
    // * 1: char[] toCharArray()
    // * 2: char charAt(int index)
    // * 3: int length()
    // * 4: boolean equals(anotherString)
    // * 5: boolean equalsIgnoreCase(anotherString)
    // * 6: String subString(int index)
    // * 7: byte[] getBtyes()
    // * 8: boolean endsWith(anotherString)
    // * 9: boolean startWith(anotherString)
    // * 10: String String.valueOf(Object obj)
    // * 11: String concat(anotherString)
    // * 12: int compareTo(anotherString) 按字典顺序比较
    // * 13: boolean contains(anotherString)
    // * 14: int indexOf(int a)
    // * 15: int indexOf(int a , int start)
    // * 16: int indexOf(String s)
    // * 17: int indexOf(String s , int start)
    // * 18: boolean isEmpty()
    // * 19: String replace(old , new) 使用新替代旧 可以是char或者String
    // * 20: String spilt(regex)
    // * 21: boolean matches(regex)
    // * 22: String toLowerCase()
    // * 23: String toUpperCase()
    // * 24: String trim() 删除首尾空白
    // */
    // System.out.println("demo8");
    // }
    //
    // private static void demo7() {
    // /*
    // * Scanner: util包下
    // * 构造方法
    // * 1:Scanner(File()); 生成一个Scanner,他的值是从指定文件读取的
    // * 2:Scanner(InputStream()); 生成一个Scanner,他的值是从用户录入读取的
    // * 方法
    // * 1:nextXxx() 获取下一个用户输入,返回Xxx(基本数据类型,没有char)
    // * 2:hasNextXxx() 判断下一个输入是否是Xxx,返回boolean(主要用于判断)
    // * 3:nextLine() 获取下一个用户输入,存储为字符串(常用方法,需要什么可以转换为什么)
    // * 4:hasNext() 判断是否有下一个输入
    // */
    // Scanner sc = new Scanner(System.in);
    // boolean b = sc.hasNext();
    // String s = sc.next();
    // System.out.println(b);
    // System.out.println(s);
    // }
    //
    // private static void demo6() {
    // /*
    // * Object提供的方法有
    // * 1: Object.hashCode() 返回对象的哈希码值(地址值)
    // * 2: Object.getClass() 返回对象的运行时类名,主要用于反射
    // * 3: Object.toString() 把对象转换为字符串,不重写的话为 对象类名@哈希码值的十六进制
    // * 4: equals()
    // 比较两个对象是否相等,初始比较的是地址值,一般建议重写比较属性值,==号可以实现重写功能,需要注意的是只能比较引用数据类型
    // *
    // * Scanner提供的方法有
    // *
    // */
    // Object obj1 = new Object();
    // Object obj2 = new Object();
    // System.out.println(obj1.hashCode());
    // System.out.println(obj1.hashCode());
    // System.out.println(obj2.hashCode());
    // System.out.println(obj1.getClass());
    // System.out.println(obj1.getClass().getName());
    // System.out.println(obj1.toString());
    // System.out.println(obj1.equals(obj2));
    // }
    //
    // private static void demo5() {
    // String s =
    // "我的手机是18511866260,我曾4859486654用4897875466过18987654321,还用过18812345678";
    // String regex = "[^1]\\d{9,}";
    // String s1 = "(\\D)+";
    // String s3 = s.replaceAll(s1, " ");
    // String s4 = s3.replaceAll(regex, "");
    // String s5 = s3.replace(s4, "");
    // System.out.println(s4);
    // }
    //
    // private static void demo4() {
    // String line = "To be or not to be";
    // StringBuilder sb = new StringBuilder(line);
    // String s = sb.reverse().toString();
    // String[] arr = s.split(" ");
    // StringBuilder sb2 = new StringBuilder();
    // for (int i = arr.length - 1; i >= 0; i--) {
    // if(i == 0) {
    // sb2.append(arr[i]);
    // break;
    // }
    // sb2.append(arr[i]).append(" ");
    // }
    // System.out.println(sb2.toString());
    // }
    //
    // private static void demo3() {
    // /*3：编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
    // “To be or not to be”将变为“oT eb ro ton ot eb”
    // 这个题不使用delet方法能不能做？*/
    // String line = "To be or not to be";
    // String[] arr = line.split(" ");
    // StringBuffer sb = new StringBuffer();
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = reverse(arr[i]);
    // if(i == arr.length - 1) {
    // sb.append(arr[i]);
    // break;
    // }
    // sb.append(arr[i] + " ");
    // }
    // System.out.println(sb.toString());
    // }
    //
    // private static void demo2() {
    // int a = 10;
    // int b = 40;
    // int c = 30;
    // int d = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
    // System.out.println(d);
    // }
    //
    // private static void demo1() {
    // char[] arr = {97,98,99};
    // String s = new String(arr);
    // System.out.println(s);
    // byte a = 97;
    // String s1 = "";
    // s1 = s1.valueOf(a);
    // System.out.println(s1);
    // }
    //
    // private static String reverse(String s) {
    // StringBuffer sb = new StringBuffer(s);
    // sb.reverse();
    // return sb.toString();
    // }

    // package com.Test.MyProgram;
    //
    // import java.io.BufferedInputStream;
    // import java.io.BufferedOutputStream;
    // import java.io.BufferedReader;
    // import java.io.File;
    // import java.io.FileInputStream;
    // import java.io.FileNotFoundException;
    // import java.io.FileOutputStream;
    // import java.io.IOException;
    // import java.io.InputStreamReader;
    // import java.util.ArrayList;
    // import java.util.LinkedHashMap;
    // import java.util.Map.Entry;
    // import java.util.Properties;
    // import java.util.Scanner;
    //
    // public class 单例的Dir操作工具类 {
    //
    // public static final 单例的Dir操作工具类 tf = new 单例的Dir操作工具类();
    // private static int num = 1;
    // private static final Class clazz = 单例的Dir操作工具类.class;
    // private static final File classDir = new File("lock");
    // private static Scanner sc = new Scanner(System.in);
    //
    // private 单例的Dir操作工具类() {}
    //
    // public void run() throws IOException {
    // System.out.println("\t\t\t欢迎调用文件夹工具类.");
    // System.out.println("\t\t\t请选择您需要的功能:");
    // while (true) {
    // classDir.createNewFile();
    // System.out.println("\t\t\t1:获取文件或文件夹大小\n\t\t\t2:打印文件夹下所有文件\n\t\t\t3:拷贝文件或文件夹\n\t\t\t4:删除文件或文件夹");
    // System.out.print("\t\t\t");
    // int num = getIn(4);
    // if (num == 1) {
    // System.out.print("请输入一个文件或文件夹(用于获取大小):");
    // File file = getFile();
    // fileAttribute(file);
    // } else if (num == 2) {
    // System.out.print("请输入需要打印的文件夹地址:");
    // File showDir = getDir();
    // showFile(showDir);
    // } else if (num == 3) {
    // System.out.print("请输入源文件或文件夹地址(需要拷贝的地址):");
    // File sourceFile = getFile();
    // System.out.print("请输入目标文件夹地址(拷贝到的地址):");
    // File targetDir = getDir();
    // if(sourceFile.equals(targetDir)) {
    // System.out.println("文件或文件夹不得相同,请重新开启");
    // break;
    // }
    // file2File(sourceFile,targetDir);
    //
    // } else if (num == 4) {
    // System.out.print("请输入需要删除的文件或文件夹地址:");
    // File deleteFile = getFile();
    // delete(deleteFile);
    // }
    // System.out.print("确认请按回车键");
    // sc.nextLine();
    // System.out.print("请问您是否还需要继续使用,继续使用请按1,退出请按2:");
    // int key = getIn(2);
    // if (key == 1) {
    // continue;
    // } else {
    // classDir.delete();
    // sc.close();
    // System.out.println("感谢您的使用,意见或建议请联系QQ:445011491,再见");
    // return;
    // }
    // }
    //
    // }
    //
    // private LinkedHashMap<String, Long> delete(File deleteFile) throws
    // IOException {
    // while(true) {
    // System.out.println("确认删除 " + deleteFile.getName() + " 吗? 确认请按Y\\返回请按N");
    // String line = sc.nextLine();
    // if("Y".equalsIgnoreCase(line)) {
    // break;
    // } else if("N".equalsIgnoreCase(line)) {
    // return null;
    // } else {
    // System.out.println("您的输入有误,请重新输入");
    // continue;
    // }
    // }
    // LinkedHashMap<String, Long> map = new LinkedHashMap<>();
    // map.put("size", 0L);
    // if(deleteFile.isFile()) {
    // map.put("deleteFile" + deleteFile.getName(), -1L);
    // if(deleteFile(map,deleteFile)) {
    // System.out.println(deleteFile.getPath() + "文件删除成功,总计删除" + map.get("size")
    // + "字节的数据");
    // } else {
    // System.out.println(deleteFile + " 文件删除失败");
    // }
    // } else {
    // map.put("deleteDir" + deleteFile.getName(), -1L);
    // map.put("dir", 0L);
    // map.put("file", 0L);
    // deleteDir(map,deleteFile);
    // }
    // show(map);
    // config(map);
    // return map;
    // }
    //
    // private void deleteDir(LinkedHashMap<String, Long> map, File deleteFile)
    // {
    // File[] file = deleteFile.listFiles();
    // for (File file2 : file) {
    // if(checkPower(file2)){
    // System.out.println(file2.getAbsolutePath() + " 无权访问");
    // continue;
    // }
    // if(file2.isFile()) {
    // map.put("size", map.get("size") + file2.length());
    // map.put("file", map.get("file") + 1);
    // file2.delete();
    // } else {
    // map.put("dir", map.get("dir") + 1);
    // deleteDir(map,file2);
    // }
    // }
    // deleteFile.delete();
    // }
    //
    // private boolean deleteFile(LinkedHashMap<String, Long> map, File
    // deleteFile) {
    // if(checkPower(deleteFile)){
    // System.out.println(deleteFile.getAbsolutePath() + " 无法访问");
    // return false;
    // } else {
    // map.put("size", deleteFile.length());
    // deleteFile.delete();
    // return true;
    // }
    // }
    //
    // private LinkedHashMap<String, Long> file2File(File sourceDir, File
    // targetDir) throws IOException {
    // LinkedHashMap<String, Long> map = new LinkedHashMap<>();
    // map.put("size", 0L);
    // if (sourceDir.isFile()) {
    // map.put("file", 1L);
    // map.put("size", sourceDir.length());
    // copyFile(sourceDir,targetDir);
    // map.put(sourceDir.getName() + " File2File " + targetDir.getName(), -1L);
    // System.out.println(sourceDir.getName() + "文件已拷贝至" + targetDir.getPath() +
    // "文件夹下");
    // System.out.println("总计拷贝了" + sourceDir.length() + "个字节," + 1 + "个文件");
    // } else {
    // map.put("dir", 0L);
    // map.put("file", 0L);
    // map.put(sourceDir.getName() + " Dir2Dir " + targetDir.getName(), -1L);
    // copyDir(map,sourceDir,targetDir);
    // System.out.println(sourceDir.getName() + "文件夹已拷贝至" + targetDir.getPath()
    // + "文件夹下");
    // System.out.println("总计拷贝了" + map.get("size") + "个字节," + map.get("file") +
    // "个文件," + map.get("dir") + "个文件夹");
    // }
    // config(map);
    // show(map);
    // return map;
    // }
    //
    // private void copyDir(LinkedHashMap<String, Long> map, File sourceDir,
    // File targetDir) throws IOException {
    // File newFile = new File(targetDir,sourceDir.getName());
    // newFile.mkdir();
    // map.put("dir", map.get("dir") + 1);
    // File[] file = sourceDir.listFiles();
    // for (File file2 : file) {
    // if(checkPower(file2)) {
    // System.out.println(file2.getPath() + " 无权限访问");
    // continue;
    // }
    // if(file2.isFile()) {
    // BufferedInputStream bis = new BufferedInputStream(new
    // FileInputStream(file2));
    // BufferedOutputStream bos = new BufferedOutputStream(new
    // FileOutputStream(new File(newFile,file2.getName())));
    // int b;
    // while((b = bis.read()) != -1) {
    // bos.write(b);
    // }
    // bis.close();
    // bos.close();
    // map.put("size",map.get("size") + file2.length());
    // map.put("file",map.get("file") + 1);
    // } else {
    // copyDir(map,file2,newFile);
    // }
    // }
    // }
    //
    // private void copyFile(File sourceDir, File targetDir) throws IOException
    // {
    // File newFile = new File(targetDir,sourceDir.getName());
    // BufferedInputStream bis = new BufferedInputStream(new
    // FileInputStream(sourceDir));
    // BufferedOutputStream bos = new BufferedOutputStream(new
    // FileOutputStream(newFile));
    // int b;
    // while((b = bis.read()) != -1) {
    // bos.write(b);
    // }
    // bis.close();
    // bos.close();
    //
    // }
    //
    // private ArrayList<String> showFile(File showDir) throws IOException {
    // ArrayList<String> list = new ArrayList<>();
    // list.add("showDir" + showDir.getName());
    // printFile(list,showDir,0);
    // showFileConflg(list);
    // return list;
    // }
    //
    // private void showFileConflg(ArrayList<String> list) throws IOException {
    // Properties prop = new Properties();
    // String name = list.get(0);
    // prop.setProperty("1", name);
    // for(int i = 1 ; i < list.size() - 1 ; i++) {
    // prop.setProperty(Integer.toString(i + 1), list.get(i));
    // }
    // System.out.println("已生成记录文件,地址为:" + classDir.getAbsolutePath().substring
    // (0, classDir.getAbsolutePath().length() - 4) + name + num +
    // ".properties");
    // classDir.delete();
    // prop.store(new FileOutputStream(name + num++ + ".properties"), null);
    //
    // }
    //
    // private void printFile(ArrayList<String> list , File showDir,int num) {
    // File[] subFile = showDir.listFiles();
    // for (File file : subFile) {
    // StringBuilder sb = new StringBuilder();
    // for(int i = 0 ; i < num ; i++) {
    // sb.append("\t");
    // }
    // sb.append(file.getAbsolutePath());
    // System.out.println(sb);
    // list.add(sb.toString());
    // if(file.isDirectory()) {
    // printFile(list , file,num + 1);
    // }
    // }
    // }
    //
    // private LinkedHashMap<String, Long> fileAttribute(File file) throws
    // IOException {
    // LinkedHashMap<String, Long> map = new LinkedHashMap<>();
    // if (file.isFile()) {
    // map.put(file.getName() + "FileAttribute", -1L);
    // map.put("size", file.length());
    // } else {
    // map.put(file.getName() + "DirAttribute", -1L);
    // map.put("dir", 0L);
    // map.put("file", 0L);
    // map.put("size", 0L);
    // getSum(map, file);
    // }
    // show(map);
    // config(map);
    // return map;
    // }
    //
    // private void getSum(LinkedHashMap<String, Long> map, File file) {
    // File[] subFile = file.listFiles();
    // for (File file2 : subFile) {
    // if (checkPower(file2)) {
    // System.out.println(file2.getAbsolutePath() + " 不可访问");
    // continue;
    // }
    // if (file2.isFile()) {
    // map.put("size",map.get("size") + file2.length());
    // map.put("file",map.get("file") + 1);
    // } else {
    // map.put("dir",map.get("dir") + 1);
    // getSum(map, file2);
    // }
    // }
    // }
    //
    // private File getDir() throws IOException {
    // File file = null;
    // while (true) {
    // file = new File(sc.nextLine());
    // if (!checkFile(file)) {
    // System.out.println("您输入的地址有误,请重新输入:");
    // continue;
    // } else if (file.isFile()) {
    // System.out.println("您输入的是文件地址,请输入一个文件夹地址");
    // continue;
    // } else {
    // break;
    // }
    // }
    // return file;
    // }
    //
    // private File getFile() {
    // File file = null;
    // while (true) {
    // file = new File(sc.nextLine());
    // if (!checkFile(file)) {
    // System.out.println("您输入的不是文件或文件夹,请重新输入");
    // continue;
    // }
    // break;
    // }
    // return file;
    // }
    //
    // private void show(LinkedHashMap<String, Long> map) {
    // for (String key : map.keySet()) {
    // if(map.get(key) == -1) {
    // System.out.println("调用的方法" + ":" + key);
    // continue;
    // }
    // System.out.println(key + ":" + map.get(key));
    // }
    // }
    //
    //
    //
    // private void config(LinkedHashMap<String, Long> map) throws IOException {
    // Properties prop = new Properties();
    // String name = null;
    // for (Entry<String, Long> en : map.entrySet()) {
    // if(en.getValue() == -1) {
    // name = en.getKey();
    // break;
    // }
    // }
    // for (String key : map.keySet()) {
    // if (map.get(key) == -1) {
    // prop.setProperty("调用本记录文件的方法", key);
    // continue;
    // }
    // prop.setProperty(key, Long.toString(map.get(key)));
    // }
    // System.out.println("已生成记录文件,地址为:" + classDir.getAbsolutePath().substring
    // (0, classDir.getAbsolutePath().length() - 4) + name + num +
    // ".properties");
    // classDir.delete();
    // prop.store(new FileOutputStream(name + num++ + ".properties"), null);
    // }
    //
    // private boolean checkDir(File file) {
    // return file.isDirectory();
    // }
    //
    // private boolean checkFile(File file) {
    // return file.exists();
    // }
    //
    // private boolean checkPower(File file) {
    // return file.isHidden() || !file.canRead() || file.equals(null);
    // }
    //
    // private int getIn(int num) {
    // while (true) {
    // try {
    // String line = sc.nextLine();
    // int j = Integer.parseInt(line);
    // for (int i = 1; i <= num; i++) {
    // if (j == i) {
    // return j;
    // }
    // }
    // System.out.println("您输入的数字有误,请重新输入");
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.out.println("您的输入有误,请输入标示数字");
    // }
    // }
    // }
    // }

    // package com.Test.MyProgram;
    //
    // import java.util.*;
    // import java.math.*;
    //
    // class Function {
    // @SuppressWarnings("unchecked")
    // public static void main(String[] args) {
    // selectFunction();
    // }
    //
    // public static void selectFunction() {
    // Scanner sc = new Scanner(System.in);
    // int i = -1;
    // while (true) {
    // try {
    // System.out.println("请选择您需要的功能：");
    // System.out.print("1：计算长方形" + "\n" + "2：获取一个手机并使用" + "\n" + "3：关闭系统。" +
    // "\n");
    // String s = sc.nextLine();
    // i = Integer.parseInt(s);
    // if(i == 1) {
    // RectangleFunction();
    // continue;
    // } else if(i == 2) {
    // PhoneFcunction();
    // continue;
    // } else if(i == 3) {
    // System.out.println("感谢您使用本系统，有什么意见或建议请联系作者，作者QQ:445011491。再见");
    // sc.close();
    // System.exit(0);
    // } else {
    // System.out.println("您输入的数字有误，请重新输入。");
    // continue;
    // }
    // }
    // catch (Exception e) {
    // System.out.println("您输入的是数字吗？我估计。。您需要一副眼睛。请重新输入。");
    // continue;
    // }
    // }
    // }
    //
    // public static void RectangleFunction() {
    // Scanner sc = new Scanner(System.in);
    // boolean camille = false;
    // ArrayList<String> al = new ArrayList<>();
    // WhileTrue wt = new WhileTrue();
    // al = wt.getRectangle();
    // Rectangle r = new Rectangle(al.get(0),al.get(1));
    // while (true) {
    // try {
    // if(camille) {
    // return;
    // }
    // System.out.println("请选择您需要的功能：");
    // System.out.print("1：计算周长。" + "\n" + "2：计算面积。" + "\n" + "3：返回上一层。" +
    // "\n");
    // String s = sc.nextLine();
    // int i = Integer.parseInt(s);
    // if(i == 1) {
    // BigDecimal length = r.getLength();
    // System.out.println("根据您的输入，获得的周长为" + length + "。");
    // System.out.print("请问您还需要继续该使用功能吗？如果需要请输入1，不需要请输入2，我们将为您返回上一层。");
    // String s2 = sc.nextLine();
    // int i2 = Integer.parseInt(s2);
    // if (i2 == 1) {
    // continue;
    // } else if (i2 == 2) {
    // System.out.println("感谢您使用该功能，欢迎下次使用。");
    // camille = true;
    // continue;
    // } else {
    // System.out.println("可能是您输入的数字有误，请重新输入试试。");
    // continue;
    // }
    // } else if(i == 2) {
    // BigDecimal area = r.getArea();
    // System.out.println("根据您的输入，获得的面积为" + area + "。");
    // System.out.print("请问您还需要继续该使用功能吗？如果需要请输入1，不需要请输入2，我们将为您返回上一层。");
    // String s2 = sc.nextLine();
    // int i2 = Integer.parseInt(s2);
    // if (i == 1) {
    // continue;
    // } else if (i == 2) {
    // System.out.println("感谢您使用该功能，欢迎下次使用。");
    // return;
    // } else {
    // System.out.println("可能是您输入的数字有误，请重新输入试试。");
    // continue;
    // }
    // } else if(i == 3) {
    // System.out.println("感谢您使用该功能，欢迎下次使用。");
    // return;
    // } else {
    // System.out.println("可能是您输入的数字有误，请重新输入试试。");
    // continue;
    // }
    // }
    // catch ( Exception e) {
    // System.out.println("可能是输入有误？请重新输入试试。");
    // continue;
    // }
    // }
    // }
    //
    // public static void PhoneFcunction() {
    // System.out.println("欢迎使用手机功能。");
    // Scanner sc = new Scanner(System.in);
    // boolean camille = false;
    // ArrayList<Object> al = new ArrayList<>();
    // String linkmanStr = "隔壁老王+少林寺驻武当山办事处大神父王麻子+大铁棍子医院捅主任+小咖喱黄不辣";
    // String[] arr = linkmanStr.split("\\+");
    // ArrayList<String> linkman = new ArrayList<>();
    // for(int i = 0 ; i < arr.length ; i++) {
    // linkman.add(arr[i]);
    // }
    // WhileTrue wt = new WhileTrue();
    // al = wt.getPhone();
    // Phone p = new Phone(al.get(0),al.get(1));
    // Gongneng: while (true) {
    // try {
    // if(camille) {
    // return;
    // }
    // System.out.println("请输入您需要的功能：");
    // System.out.print("1：发短信。" + "\n" + "2：打电话。" + "\n" + "3：玩游戏。" + "\n" +
    // "4：返回上一层" + "\n");
    // String s = sc.nextLine();
    // int i = Integer.parseInt(s);
    // if(i == 1) {
    // sendMessage: while(true){
    // System.out.println(p.sendMessage());
    // System.out.println("请输入要发送的内容：");
    // String s2 = sc.nextLine();
    // while (true) {
    // try {
    // System.out.println("选择发送给联系人请按1，发送给陌生电话请按2，重新编辑发送内容请按3，退出发短信功能请按4。");
    // String s3 = sc.nextLine();
    // int a = Integer.parseInt(s3);
    // if(a == 1) {
    // while(true) {
    // try {
    // System.out.println("请选择联系人：");
    // for(int b = 0 ; b < linkman.size() ; b++) {
    // System.out.println((b+1) + "：" + linkman.get(b));
    // }
    // String s4 = sc.nextLine();
    // int c = Integer.parseInt(s4);
    // if(c > linkman.size() || c < 0) {
    // System.out.println("您选择了一个不存在的联系人，请重新选择");
    // continue;
    // }
    // System.out.println("已发送：" + "\n" + s2 + "\n" + "给联系人" + linkman.get(c -
    // 1));
    // break;
    // }
    // catch (Exception e) {
    // System.out.println("您可能输入了其他的字符。请重新选择");
    // continue;
    // }
    // }
    // } else if(a == 2) {
    // while(true) {
    // try {
    // System.out.println("请输入您希望发送的电话(8到13位)：");
    // String s5 = sc.nextLine();
    // long l = Long.valueOf(s5);
    // if( l >= 10000000L || l <= 9999999999999L) {
    // System.out.println("已发送：" + "\n" + s2 + "\n" + "给" + l);
    // break;
    // } else {
    // System.out.println("您输入的电话有误，请重新输入");
    // continue;
    // }
    // } catch ( Exception e ) {
    // System.out.println("您输入的电话有误，请重新输入。");
    // continue;
    // }
    // }
    // } else if(a == 3) {
    // break;
    // } else if(a == 4) {
    // break sendMessage;
    // } else {
    // System.out.println("您输入了不存在的数字，请重新选择。");
    // continue;
    // }
    // } catch (Exception e) {
    // System.out.println("您可能输入了一个字母或者不存在的数字，请重新选择");
    // continue;
    // }
    // }
    // }
    // } else if(i == 2) {
    // call: while (true) {
    // try {
    // System.out.println(p.call());
    // System.out.println("您希望给联系人打电话还是给陌生电话打电话呢？");
    // System.out.println("联系人电话请按1" + "\n" + "陌生电话请按2" +"\n" + "返回上一层请按3" +
    // "\n" + "返回主菜单请按4" + "\n" + "关机请按5");
    // String call1 = sc.nextLine();
    // int i8 = Integer.parseInt(call1);
    // if(i8 == 1) {
    // System.out.println("请选择联系人：");
    // for(int b = 0 ; b < linkman.size() ; b++) {
    // System.out.println((b+1) + "：" + linkman.get(b));
    // }
    // String s4 = sc.nextLine();
    // int c = Integer.parseInt(s4);
    // if(c > linkman.size() || c < 0) {
    // System.out.println("您选择了一个不存在的联系人，请重新选择。");
    // continue;
    // }
    // System.out.println("您正在给" + linkman.get(c - 1) + "打电话");
    // System.out.println("(作者留言，这里可以加对话，只是非常非常麻烦，我比较懒就没有设置。)");
    // while (true){
    // try {
    // System.out.println("挂掉电话请按1,继续通话请按2");
    // String s5 = sc.nextLine();
    // int i9 = Integer.parseInt(s5);
    // if(i9 == 1) {
    // continue Gongneng;
    // } else if(i9 == 2) {
    // continue;
    // } else {
    // System.out.println("您输入的数字有误，请重新输入");
    // continue;
    // }
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.out.println("您输入的数字有误，请重新输入。");
    // continue;
    // }
    // }
    // } else if(i8 == 2) {
    // while(true) {
    // try {
    // System.out.println("请输入您希望发送的电话(8到13位)：");
    // String s5 = sc.nextLine();
    // long l = Long.valueOf(s5);
    // if( l >= 10000000L || l <= 9999999999999L) {
    // System.out.println("您正在给" + l + "的用户打电话，继续通话请按1，结束通话请按2");
    // System.out.println("(作者留言，这里可以加对话，只是非常非常麻烦，我比较懒就没有设置。)");
    // while (true){
    // try {
    // System.out.println("挂掉电话请按1,继续通话请按2");
    // String s6 = sc.nextLine();
    // int i9 = Integer.parseInt(s5);
    // if(i9 == 1) {
    // continue Gongneng;
    // } else if(i9 == 2) {
    // continue;
    // } else {
    // System.out.println("您输入的数字有误，请重新输入");
    // continue;
    // }
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.out.println("您输入的数字有误，请重新输入。");
    // continue;
    // }
    // }
    // } else {
    // System.out.println("您输入的电话有误，请重新输入");
    // continue;
    // }
    // } catch ( Exception e ) {
    // System.out.println("您输入的电话有误，请重新输入。");
    // continue;
    // }
    // }
    // } else if(i8 == 3) {
    // continue Gongneng;
    // }else if(i8 == 4) {
    // return;
    // } else if(i8 == 5) {
    // System.out.println("感谢您使用本系统，有什么意见或建议请联系作者，作者QQ:445011491。再见");
    // System.exit(0);
    // } else {
    // System.out.println("可能是输入了别的数字什么的吧。总之，重新输入吧。");
    // continue;
    // }
    // } catch(Exception e) {
    // System.out.println("可能是你输入错误啦，请重新选择吧。");
    // continue;
    // }
    // }
    // } else if(i == 3) {
    // System.out.println(p.playGame());
    // youxi: while(true) {
    // try {
    // System.out.println("请输入您希望玩的游戏：");
    // System.out.println("1：部落冲突。" + "\n" + "2：球球大作战。" + "\n" + "3：皇室战争。" +"\n"
    // + "4：返回上一层。" + "\n" + "5：返回主选择菜单。" + "\n" + "6：关机");
    // String s1 = sc.nextLine();
    // int i11 = Integer.parseInt(s1);
    // if(i11 == 1) {
    // huangshi: while (true) {
    // try {
    // System.out.println("你看着你的11本默默地抽了根烟，欺负小朋友请按1，退出此游戏请按2");
    // String s2 = sc.nextLine();
    // int i12 = Integer.parseInt(s2);
    // if(i12 == 1) {
    // Random r = new Random();
    // byte b = (byte)(r.nextInt(5) + 4);
    // char c = 0;
    // if(b % 2 != 0){
    // c = (char)(r.nextInt(26) + 65);
    // } else {
    // c = (char)(r.nextInt(26) + 97);
    // }
    // System.out.println("轻轻松松的屠了一个开头为" + c + "的" + b + "本玩家。" );
    // while(true) {
    // try {
    // System.out.println("继续玩吗?继续请按1，返回游戏选单请按2");
    // String s3 = sc.nextLine();
    // int i13 = Integer.parseInt(s3);
    // if(i13 == 1) {
    // continue huangshi;
    // } else if(i13 == 2) {
    // continue youxi;
    // } else {
    // System.out.println("不想说话。。");
    // continue;
    // }
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.out.println("又输错了，你懂的。");
    // continue;
    // }
    // }
    //
    // } else if(i12 == 2) {
    // continue youxi;
    // } else {
    // System.out.println("输错了，重新输入吧。");
    // continue;
    // }
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.out.println("1和2都能输错？有没有搞错啊大佬。");
    // continue;
    // }
    // }
    // } else if(i11 == 2) {
    // qiuqiu: while(true) {
    // try {
    // System.out.println("团队/排位请按1" + "\n" + "生存模式请按2" + "\n" + "返回游戏选单请按3" +
    // "\n");
    // String s15 = sc.nextLine();
    // int i16 = Integer.parseInt(s15);
    // if(i16 == 1) {
    // System.out.println("耳边响起了熟悉的音乐。");
    // Random r = new Random();
    // byte b = (byte)(r.nextInt(30));
    // int weight = -1;
    // if(b < 10) {
    // weight = r.nextInt(7000);
    // } else if (b < 20) {
    // weight = r.nextInt(7000) + 10000;
    // } else {
    // weight = r.nextInt(7000) + 20000;
    // }
    // char c = 0;
    // if(b % 2 != 0){
    // c = (char)(r.nextInt(26) + 65);
    // } else {
    // c = (char)(r.nextInt(26) + 97);
    // }
    // System.out.println("您在吃了" + b + "个玩家之后体重达到了" + weight + "kg，然后被千杀的" + c +
    // "开头的玩家吃了");
    // System.out.println("继续玩请按1，退出请按2");
    // while(true) {
    // String s16 = sc.nextLine();
    // int i17 = Integer.parseInt(s16);
    // if(i17 == 1) {
    // continue qiuqiu;
    // } else if(i17 == 2) {
    // continue youxi;
    // } else {
    // System.out.println("您输入的数字有误。请重新输入");
    // continue;
    // }
    // }
    // } else if(i16 == 2) {
    // System.out.println("耳边响起了熟悉的音乐。");
    // Random r = new Random();
    // byte b = (byte)(r.nextInt(30));
    // int weight = -1;
    // if(b < 10) {
    // weight = r.nextInt(7000);
    // } else if (b < 20) {
    // weight = r.nextInt(7000) + 10000;
    // } else {
    // weight = r.nextInt(7000) + 20000;
    // }
    // char c = 0;
    // if(b % 2 != 0){
    // c = (char)(r.nextInt(26) + 65);
    // } else {
    // c = (char)(r.nextInt(26) + 97);
    // }
    // System.out.println("您在吃了" + b + "个玩家之后体重达到了" + weight + "kg，然后被千杀的" + c +
    // "开头的玩家吃了");
    // System.out.println("继续玩请按1，退出请按2");
    // while(true) {
    // String s16 = sc.nextLine();
    // int i17 = Integer.parseInt(s16);
    // if(i17 == 1) {
    // continue qiuqiu;
    // } else if(i17 == 2) {
    // continue youxi;
    // } else {
    // System.out.println("您输入的数字有误。请重新输入");
    // continue;
    // }
    // }
    // } else if(i16 == 3){
    // continue youxi;
    // } else {
    // System.out.println("您输入的数字有误，请重新输入");
    // }
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.out.println("输入的数字有误，请重新输入");
    // continue;
    // }
    // }
    // } else if(i11 == 3) {
    // huangshi: while(true) {
    // try {
    // System.out.println("作为全球五百强5 7 12的男人，每当开始一局就会有一种孤独求败的感觉。");
    // while(true) {
    // System.out.println("按1开始排位，按2开始公会友谊赛，按3退出游戏返回游戏选单。");
    // String s17 = sc.nextLine();
    // int i18 = Integer.parseInt(s17);
    // if(i18 == 1) {
    // Random r = new Random();
    // int i19 = r.nextInt(3) + 1;
    // if(i19 == 1){
    // System.out.println("对局开始了，对方使用了巨球流！！");
    // System.out.println("对于经验丰富的你自然知道怎么应对这种流氓流派");
    // System.out.println("按1打出加农炮加冰法，按2打出猪炮组合");
    // String s18 = sc.nextLine();
    // int i20 = Integer.parseInt(s18);
    // if(i20 == 1) {
    // System.out.println("由于你完美的战术，非常简单的拿下了这局比赛，离全球第一又进了一步。");
    // } else if(i20 == 2) {
    // System.out.println("由于你太过于低估对手巨人的血量，对面轻松了推了你，渣渣");
    // } else {
    // System.out.println("由于你乱打，郁闷的输了比赛，生气的推出了游戏");
    // continue youxi;
    // }
    // } else if(i19 == 2) {
    // System.out.println("对局开始了，对方使用了双冰猪！！");
    // System.out.println("对于经验丰富的你自然知道怎么应对这种流氓流派");
    // System.out.println("按1打出加农炮加火枪，按2打出挖地+毒");
    // String s18 = sc.nextLine();
    // int i20 = Integer.parseInt(s18);
    // if(i20 == 1) {
    // System.out.println("由于你完美的战术，非常简单的拿下了这局比赛，离全球第一又进了一步。");
    // } else if(i20 == 2) {
    // System.out.println("由于你太过于低估对手猪的攻击力，对面轻松了推了你，渣渣");
    // } else {
    // System.out.println("由于你乱打，郁闷的输了比赛，生气的推出了游戏");
    // continue youxi;
    // }
    // } else if(i19 == 3) {
    // System.out.println("对局开始了，对方使用了火箭流！！");
    // System.out.println("对于经验丰富的你自然知道怎么应对这种流氓流派");
    // System.out.println("按1打出哥布林加捅，按2打出猪加三火枪分两路");
    // String s18 = sc.nextLine();
    // int i20 = Integer.parseInt(s18);
    // if(i20 == 1) {
    // System.out.println("由于你完美的战术，非常简单的拿下了这局比赛，离全球第一又进了一步。");
    // } else if(i20 == 2) {
    // System.out.println("由于对面有很多的AOE，可以轻松灭小怪，对面把家都炸烂了，渣渣");
    // } else {
    // System.out.println("由于你乱打，郁闷的输了比赛，生气的推出了游戏");
    // continue youxi;
    // }
    // }
    // } else if(i18 == 2) {
    // System.out.println("你发起了友谊战，公会所有人都知道你是五百强没人敢接，直到会长接了。");
    // Random r = new Random();
    // int i19 = r.nextInt(3) + 1;
    // if(i19 == 1){
    // System.out.println("对局开始了，对方使用了巨球流！！");
    // System.out.println("对于经验丰富的你自然知道怎么应对这种流氓流派");
    // System.out.println("按1打出加农炮加冰法，按2打出猪炮组合");
    // String s18 = sc.nextLine();
    // int i20 = Integer.parseInt(s18);
    // if(i20 == 1) {
    // System.out.println("由于你完美的战术，非常简单的拿下了这局比赛，离全球第一又进了一步。");
    // } else if(i20 == 2) {
    // System.out.println("由于你太过于低估对手巨人的血量，对面轻松了推了你，渣渣");
    // } else {
    // System.out.println("由于你乱打，郁闷的输了比赛，生气的推出了游戏");
    // continue youxi;
    // }
    // } else if(i19 == 2) {
    // System.out.println("对局开始了，对方使用了双冰猪！！");
    // System.out.println("对于经验丰富的你自然知道怎么应对这种流氓流派");
    // System.out.println("按1打出加农炮加火枪，按2打出挖地+毒");
    // String s18 = sc.nextLine();
    // int i20 = Integer.parseInt(s18);
    // if(i20 == 1) {
    // System.out.println("由于你完美的战术，非常简单的拿下了这局比赛，离全球第一又进了一步。");
    // } else if(i20 == 2) {
    // System.out.println("由于你太过于低估对手猪的攻击力，对面轻松了推了你，渣渣");
    // } else {
    // System.out.println("由于你乱打，郁闷的输了比赛，生气的推出了游戏");
    // continue youxi;
    // }
    // } else if(i19 == 3) {
    // System.out.println("对局开始了，对方使用了火箭流！！");
    // System.out.println("对于经验丰富的你自然知道怎么应对这种流氓流派");
    // System.out.println("按1打出哥布林加捅，按2打出猪加三火枪分两路");
    // String s18 = sc.nextLine();
    // int i20 = Integer.parseInt(s18);
    // if(i20 == 1) {
    // System.out.println("由于你完美的战术，非常简单的拿下了这局比赛，离全球第一又进了一步。");
    // } else if(i20 == 2) {
    // System.out.println("由于对面有很多的AOE，可以轻松灭小怪，对面把家都炸烂了，渣渣");
    // } else {
    // System.out.println("由于你乱打，郁闷的输了比赛，生气的推出了游戏");
    // continue youxi;
    // }
    // }
    // } else if(i18 == 3) {
    // continue youxi;
    // } else {
    // System.out.println("您的输入有误，请重新输入");
    // continue;
    // }
    // }
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.out.println("您输入的数字有误，请重新输入。");
    // continue huangshi;
    // }
    // }
    // } else if(i11 == 4) {
    // continue Gongneng;
    // } else if(i11 == 5) {
    // return;
    // } else if(i11 == 6) {
    // System.out.println("感谢您使用本系统，有什么意见或建议请联系作者，作者QQ:445011491。再见");
    // System.exit(0);
    // } else {
    // System.out.println("您输入的数据有误，请重新输入");
    // continue;
    // }
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.out.println("可能是某个数字输错了吧，我也不知道，总之，重新输入吧");
    // continue;
    // }
    // }
    // } else if(i == 4){
    // return;
    // } else {
    // System.out.println("您输入的数字有误，请重新输入。");
    // continue;
    // }
    // }
    // catch (Exception e) {
    // System.out.println("可能您输入的数字有误，请重新输入。");
    // continue;
    // }
    //
    // }
    // }
    // }
    //
    // class Rectangle {
    // private String size;
    // private String wide;
    //
    // public Rectangle() {
    // super();
    // }
    //
    // public Rectangle(String size,String wide) {
    // super();
    // this.size = size;
    // this.wide = wide;
    // }
    //
    // public void setSize(String size) {
    // this.size = size;
    // }
    //
    // public String getSize() {
    // return this.size;
    // }
    //
    // public void setWide(String wide) {
    // this.wide = wide;
    // }
    //
    // public String getWide() {
    // return this.wide;
    // }
    //
    // public BigDecimal getLength() {
    // BigDecimal bg = new BigDecimal(this.size);
    // BigDecimal bg2 = new BigDecimal(this.wide);
    // bg = bg.add(bg2);
    // bg = bg.multiply(new BigDecimal(2.0));
    // return bg;
    // }
    //
    // public BigDecimal getArea() {
    // BigDecimal bg = new BigDecimal(this.size);
    // BigDecimal bg2 = new BigDecimal(this.wide);
    // bg = bg.multiply(bg2);
    // return bg;
    // }
    // }
    //
    // class Phone {
    // private String brand;
    // private double price;
    //
    // public Phone() {
    // super();
    // }
    //
    // public Phone(Object object,Object object2) {
    // super();
    // this.brand = (String) object;
    // this.price = (double) object2;
    // }
    //
    // public void setBrand(String brand) {
    // this.brand = brand;
    // }
    //
    // public String getBrand() {
    // return this.brand;
    // }
    //
    // public void setPrice(double price) {
    // this.price = price;
    // }
    //
    // public double getPrice() {
    // return this.price;
    // }
    //
    // public String call() {
    // return "您正在使用价值" + this.price + "的" + this.brand + "手机打电话";
    // }
    //
    // public String sendMessage() {
    // return "您正在使用价值" + this.price + "的" + this.brand + "手机发短信";
    // }
    //
    // public String playGame() {
    // return "您正在使用价值" + this.price + "的" + this.brand + "手机玩游戏";
    // }
    // }
    //
    // class WhileTrue {
    // @SuppressWarnings("unchecked")
    // public ArrayList getRectangle() {
    // ArrayList<String> list = new ArrayList<String>();
    // boolean camille = false;
    // boolean b = false;
    // Scanner sc = new Scanner(System.in);
    // System.out.println("欢迎使用长方形功能，本功能将返回长方形的边长与面积(有精度)，需要您输入你需要的长和宽，可以为小数。");
    // while(true) {
    // try {
    // if(!b) {
    // System.out.print("请输入您需要求的长：");
    // } else {
    // System.out.print("请输入您需要求的宽：");
    // }
    // String s = sc.nextLine();
    // double d = Double.valueOf(s);
    // if( d <= 0 ) {
    // System.out.println("需要您输入一个大于零的数，请重新输入。");
    // continue;
    // } else {
    // list.add(s);
    // b = true;
    // if(list.size() == 2) {
    // return list;
    // }
    // }
    // }
    // catch (Exception e) {
    // System.out.println("您输入的数据有误，请重新输入。");
    // }
    // }
    // }
    //
    // public ArrayList getPhone() {
    // ArrayList<Object> list = new ArrayList<Object>();
    // boolean camille = false;
    // boolean b = false;
    // Scanner sc = new Scanner(System.in);
    // System.out.println("欢迎使用手机功能，本功能将根据你输入的品牌和心理价位返回一个手机，并是您可以使用手机的功能。");
    // System.out.println("手机品牌包括：苹果,三星,华为,小米,魅族,锤子,小众品牌等等");
    // System.out.println("手机价位取值范围为500到10000");
    // while (true) {
    // try {
    // if(!b) {
    // System.out.print("请输入您想要的品牌：" + "\n");
    // } else {
    // System.out.print("请输入您的心理价位：" + "\n");
    // }
    // String s = sc.nextLine();
    // if(!b) {
    // if("苹果三星华为小米魅族锤子小众品牌".contains(s)) {
    // list.add(s);
    // b = true;
    // } else {
    // System.out.println("您输入的手机品牌有误，请重新输入。");
    // continue;
    // }
    // } else {
    // Double d = Double.valueOf(s);
    // if(d <= 10000 && d >= 500) {
    // list.add(d);
    // if(list.size() == 2) {
    // return list;
    // }
    // } else {
    // System.out.println("如果你输入的数很大，土豪交朋友。如果你输入的数很小，就先别玩了好好工作去吧。");
    // continue;
    // }
    // }
    // }
    // catch (Exception e) {
    // System.out.println("可能您输入的数据有误，请重新输入一下看看，请参考范围。");
    // }
    // }
    // }
    //
    // }

}
