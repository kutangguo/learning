package cn.com.test;

import java.util.List;
import java.util.ArrayList;

public class FirstGit {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("С��");
		list.add("С��");
		list.add("С��");
		list.add("С��");
		for (String string : list) {
			if (string.equalsIgnoreCase("С��")) {
				System.err.println("�Һ��±�");
			}
		}
	}
}
