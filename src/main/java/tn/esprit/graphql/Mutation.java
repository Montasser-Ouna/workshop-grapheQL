package tn.esprit.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import tn.esprit.entities.Student;
import tn.esprit.repository.StudentRepos;

public class Mutation implements GraphQLRootResolver{
	private StudentRepos str;
	public Mutation (StudentRepos str)
	{this.str=str;}
	
	public Student createStudent(String cin,String nompre,String email)
	{
		Student S=new Student(cin, nompre, email);
		if(str.addStudent(S))
			return S;
		return null;
	}
	public List<Student> deleteStudent(String cin) {
		  this.str.deleteStudent(cin);
		  return this.str.getAllStudent() ;
		}
	public Boolean updateStudent(String cin, String nompre, String email) {
		Student s= new Student(cin,nompre,email);
		int st = this.str.updateStudent(s);
		if (st==1)
				return true;
		else 
			return false;
	}
}
