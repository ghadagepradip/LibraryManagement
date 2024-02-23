package libraryapp.repository;
import java.util.*;

import libraryapp.model.BookModel;

public class BookRepository {

	static ArrayList al = new ArrayList();
	static int count=1;
	
	public boolean addBook(BookModel book)
	{
		
		book.setId(count++);
		boolean b=al.add(book);
		return b;
	}
	public ArrayList getBooks()
	{
		return al.size()>0?al:null;
	}
	public boolean deleteBook(BookModel book)
	{
		boolean b=false;
		try
		{
			b=al.remove(book);
		}
		catch(Exception e)
		{
			return true;
		}
		return b;
	}
}
