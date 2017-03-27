package org.camille.mytest.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;

public class 单例的Dir操作工具类 {

	public static final 单例的Dir操作工具类 tf = new 单例的Dir操作工具类();
	private static int num = 1;
	private static final File classDir = new File("lock");
	private static Scanner sc = new Scanner(System.in);

	private 单例的Dir操作工具类() {}

	public void run() throws IOException {
		System.out.println("\t\t\t欢迎调用文件夹工具类.");
		System.out.println("\t\t\t请选择您需要的功能:");
		while (true) {
			classDir.createNewFile();
			System.out.println("\t\t\t1:获取文件或文件夹大小\n\t\t\t2:打印文件夹下所有文件\n\t\t\t3:拷贝文件或文件夹\n\t\t\t4:删除文件或文件夹");
			System.out.print("\t\t\t");
			int num = getIn(4);
			if (num == 1) {
				System.out.print("请输入一个文件或文件夹(用于获取大小):");
				File file = getFile();
				fileAttribute(file);
			} else if (num == 2) {
				System.out.print("请输入需要打印的文件夹地址:");
				File showDir = getDir();
				showFile(showDir);
			} else if (num == 3) {
				System.out.print("请输入源文件或文件夹地址(需要拷贝的地址):");
				File sourceFile = getFile();
				System.out.print("请输入目标文件夹地址(拷贝到的地址):");
				File targetDir = getDir();
				if(sourceFile.equals(targetDir)) {
					System.out.println("文件或文件夹不得相同,请重新开启");
					break;
				}
				file2File(sourceFile,targetDir);
				
			} else if (num == 4) {
				System.out.print("请输入需要删除的文件或文件夹地址:");
				File deleteFile = getFile();
				delete(deleteFile);
			}
			System.out.print("确认请按回车键");
			sc.nextLine();
			System.out.print("请问您是否还需要继续使用,继续使用请按1,退出请按2:");
			int key = getIn(2);
			if (key == 1) {
				continue;
			} else {
				classDir.delete();
				sc.close();
				System.out.println("感谢您的使用,意见或建议请联系QQ:445011491,再见");
				return;
			}
		}

	}

	private LinkedHashMap<String, Long>  delete(File deleteFile) throws IOException {
		while(true) {
			System.out.println("确认删除 " + deleteFile.getName() + " 吗? 确认请按Y\\返回请按N");
			String line = sc.nextLine();
			if("Y".equalsIgnoreCase(line)) {
				break;
			} else if("N".equalsIgnoreCase(line)) {
				return null;
			} else {
				System.out.println("您的输入有误,请重新输入");
				continue;
			}
		}
		LinkedHashMap<String, Long> map = new LinkedHashMap<>();
		map.put("size", 0L);
		if(deleteFile.isFile()) {
			map.put("deleteFile" + deleteFile.getName(), -1L);
			if(deleteFile(map,deleteFile)) {
				System.out.println(deleteFile.getPath() + "文件删除成功,总计删除" + map.get("size") + "字节的数据");				
			} else {
				System.out.println(deleteFile + " 文件删除失败");
			}
		} else {
			map.put("deleteDir" + deleteFile.getName(), -1L);
			map.put("dir", 0L);
			map.put("file", 0L);
			deleteDir(map,deleteFile);
		}
		show(map);
		config(map);
		return map;
	}

	private void deleteDir(LinkedHashMap<String, Long> map, File deleteFile) {
		File[] file = deleteFile.listFiles();
		for (File file2 : file) {
			if(checkPower(file2)){
				System.out.println(file2.getAbsolutePath() + " 无权访问");
				continue;
			}
			if(file2.isFile()) {
				map.put("size", map.get("size") + file2.length());
				map.put("file", map.get("file") + 1);
				file2.delete();
			} else {
				map.put("dir", map.get("dir") + 1);
				deleteDir(map,file2);
			}
		}
		deleteFile.delete();
	}

	private boolean deleteFile(LinkedHashMap<String, Long> map, File deleteFile) {
		if(checkPower(deleteFile)){
			System.out.println(deleteFile.getAbsolutePath() + " 无法访问");
			return false;
		} else {
			map.put("size", deleteFile.length());
			deleteFile.delete();
			return true;
		}
	}

	private LinkedHashMap<String, Long> file2File(File sourceDir, File targetDir) throws IOException {
		LinkedHashMap<String, Long> map = new LinkedHashMap<>();
		map.put("size", 0L);
		if (sourceDir.isFile()) {
			map.put("file", 1L);
			map.put("size", sourceDir.length());
			copyFile(sourceDir,targetDir);
			map.put(sourceDir.getName() + " File2File " + targetDir.getName(), -1L);
			System.out.println(sourceDir.getName() + "文件已拷贝至" + targetDir.getPath() + "文件夹下");
			System.out.println("总计拷贝了" + sourceDir.length() + "个字节," + 1 + "个文件");
		} else {
			map.put("dir", 0L);
			map.put("file", 0L);
			map.put(sourceDir.getName() + " Dir2Dir " + targetDir.getName(), -1L);
			copyDir(map,sourceDir,targetDir);
			System.out.println(sourceDir.getName() + "文件夹已拷贝至" + targetDir.getPath() + "文件夹下");
			System.out.println("总计拷贝了" + map.get("size") + "个字节," + map.get("file") + "个文件," + map.get("dir") + "个文件夹");
		}
		config(map);
		show(map);
		return map;
	}

	private void copyDir(LinkedHashMap<String, Long> map, File sourceDir, File targetDir) throws IOException {
		File newFile = new File(targetDir,sourceDir.getName());
		newFile.mkdir();
		map.put("dir", map.get("dir") + 1);
		File[] file = sourceDir.listFiles();
		for (File file2 : file) {
			if(checkPower(file2)) {
				System.out.println(file2.getPath() + " 无权限访问");
				continue;
			}
			if(file2.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file2));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(newFile,file2.getName())));
				int b;
				while((b = bis.read()) != -1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
				map.put("size",map.get("size") + file2.length());
				map.put("file",map.get("file") + 1);
			} else {
				copyDir(map,file2,newFile);
			}
		}
	}

	private void copyFile(File sourceDir, File targetDir) throws IOException {
		File newFile = new File(targetDir,sourceDir.getName());
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceDir));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
		
	}

	private ArrayList<String> showFile(File showDir) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		list.add("showDir" + showDir.getName());
		printFile(list,showDir,0);
		showFileConflg(list);
		return list;
	}
	
	private void showFileConflg(ArrayList<String> list) throws IOException {
		Properties prop = new Properties();
		String name = list.get(0);
		prop.setProperty("1", name);
		for(int i = 1 ; i < list.size() - 1 ; i++) {
			prop.setProperty(Integer.toString(i + 1), list.get(i));
		}
		System.out.println("已生成记录文件,地址为:" + classDir.getAbsolutePath().substring
				(0, classDir.getAbsolutePath().length() - 4) + name + num + ".properties");
		classDir.delete();
		prop.store(new FileOutputStream(name + num++ + ".properties"), null);
		
	}

	private void printFile(ArrayList<String> list , File showDir,int num) {
		File[] subFile = showDir.listFiles();
		for (File file : subFile) {
			StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i < num ; i++) {
				sb.append("\t");
			}
			sb.append(file.getAbsolutePath());
			System.out.println(sb);
			list.add(sb.toString());
			if(file.isDirectory()) {
				printFile(list , file,num + 1);
			}
		}
	}

	private LinkedHashMap<String, Long> fileAttribute(File file) throws IOException {
		LinkedHashMap<String, Long> map = new LinkedHashMap<>();
		if (file.isFile()) {
			map.put(file.getName() + "FileAttribute", -1L);
			map.put("size", file.length());
		} else {
			map.put(file.getName() + "DirAttribute", -1L);
			map.put("dir", 0L);
			map.put("file", 0L);
			map.put("size", 0L);
			getSum(map, file);
		}
		show(map);
		config(map);
		return map;
	}
	
	private void getSum(LinkedHashMap<String, Long> map, File file) {
		File[] subFile = file.listFiles();
		for (File file2 : subFile) {
			if (checkPower(file2)) {
				System.out.println(file2.getAbsolutePath() + " 不可访问");
				continue;
			}
			if (file2.isFile()) {
				map.put("size",map.get("size") + file2.length());
				map.put("file",map.get("file") + 1);
			} else {
				map.put("dir",map.get("dir") + 1);
				getSum(map, file2);
			}
		}
	}

	private File getDir() throws IOException {
		File file = null;
		while (true) {
			file = new File(sc.nextLine());
			if (!checkFile(file)) {
				System.out.println("您输入的地址有误,请重新输入:");
				continue;
			} else if (file.isFile()) {
				System.out.println("您输入的是文件地址,请输入一个文件夹地址");
				continue;
			} else {
				break;
			}
		}
		return file;
	}

	private File getFile() {
		File file = null;
		while (true) {
			file = new File(sc.nextLine());
			if (!checkFile(file)) {
				System.out.println("您输入的不是文件或文件夹,请重新输入");
				continue;
			}
			break;
		}
		return file;
	}

	private void show(LinkedHashMap<String, Long> map) {
		for (String key : map.keySet()) {
			if(map.get(key) == -1) {
				System.out.println("调用的方法" + ":" + key);
				continue;
			}
			System.out.println(key + ":" + map.get(key));
		}
	}

	

	private void config(LinkedHashMap<String, Long> map) throws IOException {
		Properties prop = new Properties();
		String name = null;
		for (Entry<String, Long> en : map.entrySet()) {
			if(en.getValue() == -1) {
				name = en.getKey();
				break;
			}
		}
		for (String key : map.keySet()) {
			if (map.get(key) == -1) {
				prop.setProperty("调用本记录文件的方法", key);
				continue;
			}
			prop.setProperty(key, Long.toString(map.get(key)));
		}
		System.out.println("已生成记录文件,地址为:" + classDir.getAbsolutePath().substring
				(0, classDir.getAbsolutePath().length() - 4) + name + num + ".properties");
		classDir.delete();
		prop.store(new FileOutputStream(name + num++ + ".properties"), null);
	}

	private boolean checkDir(File file) {
		return file.isDirectory();
	}

	private boolean checkFile(File file) {
		return file.exists();
	}
	
	private boolean checkPower(File file) {
		return file.isHidden() || !file.canRead() || file.equals(null);
	}

	private int getIn(int num) {
		while (true) {
			try {
				String line = sc.nextLine();
				int j = Integer.parseInt(line);
				for (int i = 1; i <= num; i++) {
					if (j == i) {
						return j;
					}
				}
				System.out.println("您输入的数字有误,请重新输入");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("您的输入有误,请输入标示数字");
			}
		}
	}
}
