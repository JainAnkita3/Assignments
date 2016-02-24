package com.test.sessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortStudentByID s3 = new SortStudentByID(3, "Lakshmi", 20);
		SortStudentByID s5 = new SortStudentByID(5, "Raj", 27);
		SortStudentByID s2 = new SortStudentByID(2, "Anup", 24);
		SortStudentByID s4 = new SortStudentByID(4, "Ankita", 20);
		SortStudentByID s1 = new SortStudentByID(1, "Vasantha", 72);

		TreeSet<SortStudentByID> ts = new TreeSet<SortStudentByID>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);

		for (SortStudentByID s : ts) {
			System.out.println("Name :" + s.getName() + "age : " + s.getAge() + "Id : " + s.getId());
		}

		List<SortStudentByID> stList = new ArrayList<SortStudentByID>();
		stList.addAll(ts);

		Collections.sort(stList, new StudentSort());
		for (SortStudentByID ss : stList) {
			System.out.println("New Name :" + ss.getName() + "age : " + ss.getAge() + "Id : " + ss.getId());
		}
		
		System.out.println(stList.get(0));
		System.out.println(stList.get(0).hashCode());
		
	}

	class StudentSort implements Comparator<SortStudentByID> {

		@Override
		public int compare(SortStudentByID o1, SortStudentByID o2) {
			if (o1.getAge() > o2.getAge()) {
				return 1;
			} else if (o2.getAge() < o2.getAge()) {
				return -1;
			}
			return 0;
		}
	}

}
