package libraryapp.repository;
import java.util.ArrayList;
import java.util.Stack;

import libraryapp.model.BookModel;
import libraryapp.model.StudentModel;


public class StudentRepository {

	static ArrayList s = new ArrayList();
	static int count=1;
	
	public boolean addStudent(StudentModel student)
	{
		
		student.setSid(count++);
		boolean b=s.add(student);
		return b;
	}
	public ArrayList getStudents()
	{
		return s.size()>0?s:null;
	}
	public boolean issueBook(StudentModel student,BookModel book1)
	{
		Stack stemp=student.getStak();
		boolean b=stemp.add(book1);
		if(b)
		{
			book1.setStatus(true);
		}
		return b;
	}
}
