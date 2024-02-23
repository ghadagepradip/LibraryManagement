package libraryapp.service;

import java.util.ArrayList;

import libraryapp.model.BookModel;
import libraryapp.repository.BookRepository;

public class BookService {
	
	BookRepository bRepo=new BookRepository();
	
	public boolean addBook(BookModel book)
	{
		return bRepo.addBook(book);
	}
	
	public ArrayList getBooks()
	{
		return bRepo.getBooks();
	}
	
	public boolean deleteBook(BookModel book)
	{
		return bRepo.deleteBook(book);
	}

}
