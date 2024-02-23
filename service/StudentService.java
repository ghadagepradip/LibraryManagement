package libraryapp.service;

import java.util.ArrayList;

import libraryapp.model.BookModel;
import libraryapp.model.StudentModel;
import libraryapp.repository.StudentRepository;


public class StudentService {

	StudentRepository sRepo=new StudentRepository();
	
	public boolean addStudent(StudentModel student)
	{
		return sRepo.addStudent(student);
	}
	
	public ArrayList getStudents()
	{
		return sRepo.getStudents();
	}
	
	public boolean issueBook(StudentModel student,BookModel book1)
	{
		return sRepo.issueBook(student,book1);
	}
}
