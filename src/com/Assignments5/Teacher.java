package com.Assignments5;

public class Teacher {

	public static void main(String[] args) {

		School teacher = new School();

		teacher.mark = 100;
		System.out.println(teacher.mark);

		teacher.conduct_exams();
		teacher.publish_results(75);

	}
}

