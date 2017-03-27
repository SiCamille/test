package org.camille.mytest.socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CamilleServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6666);
        System.out.println("\t\t\tCamille数据库已开启");
        System.out.println("\tIP地址:192.168.26.24  端口:6666");
        while(true) {
            final Socket socket = server.accept();
            new Thread() {
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        PrintStream ps = new PrintStream(socket.getOutputStream());
                        String name = br.readLine();
                        System.out.println("用户" + name + "已连接");
                        File dir = new File(name);
                        dir.mkdir();
                        String fileName = br.readLine();
                        File file = new File(dir,fileName);
                        if(file.exists()) {
                            ps.println("文件已存在");
                            socket.close();
                            return;
                        }
                        System.out.println("正在收录来自" + name + "用户的文件:" + fileName);
                        System.out.print("请稍后");
                        for (int i = 0; i < 3; i++) {
                            Thread.currentThread().sleep(500);
                            System.out.print(".");
                        }
                        System.out.println();
                        ps.println();
                        FileOutputStream fos = new FileOutputStream(file);
                        byte[] arr = new byte[8192];
                        int len;
                        while((len = is.read(arr)) != -1) {
                            fos.write(arr, 0, len);
                        }
                        System.out.println("收录完成");
                        fos.close();
                        socket.close();
                    } catch (Exception e) {
                        
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

}

