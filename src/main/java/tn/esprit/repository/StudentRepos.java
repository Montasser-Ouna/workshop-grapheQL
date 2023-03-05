package tn.esprit.repository;

import java.util.ArrayList;
import java.util.List;

import tn.esprit.entities.Student;

public class StudentRepos {
	private final List<Student> students;
	public StudentRepos()
	{
		students=new ArrayList<Student>();
		students.add(new Student
				("123", "ben foulen", "benfoulen@gmail.com"));
		students.add(new Student
				("145", "Ahmed ben saleh", "bensaleh@gmail.com"));}
	public List<Student> getAllStudent()
	{return students;}
	
	public boolean addStudent(Student S) {
		return students.add(S);}
	
	public Student getStudentbycin(String cin)
	{
		for (Student S:students)
		{if (S.getCin().equals(cin))
			
		return S;
		
		}
		return null;
		
		}
	public void deleteStudent(String cin) {
		Student s = this.getStudentbycin(cin);
		this.students.remove(s);
		
	}
	public int updateStudent(Student s) {
		Student st = getStudentbycin(s.getCin());	
		int i = students.indexOf(st);
		if(i!=-1) {
			this.students.set(i, s);
			return 1;
		}
		return 0;
	
	}
	
	
	
}
