package org.camille.mytest.socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
        String ip = "";
        int port = -1;
        while (true) {
            try {
                System.out.print("请输入您希望连接的IP地址,格式为(xxx.xxx.xxx.xxx):");
                String regex = "[\\d]{1,3}[\\.][\\d]{1,3}[\\.][\\d]{1,3}[\\.][\\d]{1,3}";
                ip = sc.nextLine();
                if (ip.matches(regex)) {
                    System.out.print("请输入您希望进入的端口号(0-65535):");
                    String temp = sc.nextLine();
                    port = Integer.parseInt(temp);
                    if (port > 0 && port <= 65535) {
                        break;
                    } else {
                        System.out.println("您输入的端口号有误,请重新输入");
                    }
                } else {
                    System.out.println("您输入的ip地址有误,请重新输入");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("您的输入有误,请重新输入.");
            }
        }
        System.out.print("请输入您的用户名:");
        String name = sc.nextLine();
        if ("192.168.26.24".equals(ip.trim()) && port == 6666) {
            System.out.println("\t\t\t欢迎链接camille数据库");
            System.out.println("\t\t本数据库作用是为您存储文件,请输入您需要上传的文件路径");
        } else {
            System.out.println("IP找不到.");
            return;
        }
        Socket socket = new Socket(ip, port);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream ps = new PrintStream(socket.getOutputStream());
        ps.println(name);
        File file = getFile();
        ps.println(file.getName());
        String back = br.readLine();
        if("文件已存在".equals(back)) {
            System.out.println("录入的文件已存在于数据库中.");
            socket.close();
            return;
        }

        FileInputStream fis = new FileInputStream(file);
        byte[] arr = new byte[8192];
        int len;
        while((len = fis.read(arr)) != -1) {
            ps.write(arr, 0, len);
        }
        System.out.println("成功上传至服务器,欢迎取回,请牢记本数据库唯一IP:192.168.26.24,端口6666");
        fis.close();
        socket.close();
    }

    private static File getFile() {
        while (true) {
            String fileName = sc.nextLine();
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("您录入的不是一个文件路径,请重新录入");
            } else if (file.isDirectory()) {
                System.out.println("您录入的是一个文件夹路径,请重新录入");
            } else {
                return file;
            }
        }
    }

}

