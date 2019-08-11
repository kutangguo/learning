package cn.com.test;

import java.util.List;
import java.util.ArrayList;

public class FirstGit {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("小李");
		list.add("小明");
		list.add("小红");
		list.add("小王");
		for (String string : list) {
			if (string.equalsIgnoreCase("小李")) {
				System.err.println("我很懵逼");
			}
		}
	}
}
