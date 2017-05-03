package com.office;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.office.entity.User;
import com.office.enums.TypeEnum;
import com.office.enums.UserEnums;

/**
 * Hello world!
 *
 */
public class App {
	@Test
	public void test01() {
		String str = "a";

		if (str.equals("1")) {

		} else if (str.equals("a")) {

		} else if (str.equals("3")) {

		} else if (str.equals("a")) {

		} else if (str.equals("1")) {

		}
	}

	@Test
	public void test02() {
		long start = System.currentTimeMillis();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < 100000000; i++) {
			map.put("age", i);
			map.clear();
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);

		start = System.currentTimeMillis();
		Map<String, Integer> map2;
		for (int i = 0; i < 100000000; i++) {
			map2 = new HashMap<String, Integer>();
			map2.put("age", i);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);

	}

	@Test
	public void test03() {
		long i = 1L;
		System.out.println("i的两倍是：" + (i + i));
	}

	@Test
	public void test04() {
		int num = 80;
		String str1 = String.valueOf(num < 100 ? 90 : 100);
		String str2 = String.valueOf(num < 100 ? 90 : 100.0);
		System.out.println(str1.equals(str2));
	}

	@Test
	public void test05() {
		int maxIdNum = Integer.parseInt("0701".substring(2)) + 1;
		String maxId = (maxIdNum > 9) ? String.valueOf(maxIdNum) : "0" + String.valueOf(maxIdNum);
		System.out.println(maxId);
	}

	@Test
	public void test06() {
		Map<String, Object> params = new HashMap<String, Object>();
		int count = Integer.parseInt(String.valueOf(null != params.get("count") ? params.get("count") : "0"));
		boolean result = (count > 0) ? true : false;
		System.out.println(result);
	}

	@Test
	public void test07() {
		int[] array = new int[] { 12, 23, 34, 45, 56, 67, 77, 89, 90 };
		System.out.println(search(array, 88));
	}

	public static int search(int[] array, int key) {
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (key < array[middle]) {
				end = middle - 1;
			} else if (key > array[middle]) {
				start = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}

	@Test
	public void test08() {
		System.out.println(TypeEnum.CODE_01.getKey());
		System.out.println(UserEnums.USER_ADMIN.getPassword());
	}

	@Test
	public void test09() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		User user = new User("Neo", 20, list);
		System.out.println(user);
	}
}
