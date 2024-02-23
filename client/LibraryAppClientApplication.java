package libraryapp.client;

import java.util.*;

import libraryapp.model.BookModel;
import libraryapp.model.StudentModel;
import libraryapp.service.BookService;
import libraryapp.service.StudentService;

public class LibraryAppClientApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookService bService = new BookService();
		StudentService sService = new StudentService();
		BookModel book ;
		StudentModel student;
		int count2;
		int choice;
		boolean b=false;
		do {
			System.out.println("1.Add new book");
			System.out.println("2.Show all books");
			System.out.println("3.Count book category wise");
			System.out.println("4.Display books category wise");
			System.out.println("5.Display Author wise books");
			System.out.println("6.Add new Student");
			System.out.println("7.Issue book to Student");
			System.out.println("8.Show stock after book issue");
			System.out.println("9.View Student wise book");
			System.out.println("10.Delete book by author");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			ArrayList al;
			switch (choice) {
			case 1:
				sc.nextLine();
				int flag=1;
				System.out.println("Enter book Name,Author,Publication,Category and Price");
			
				String bname = sc.nextLine();
				String bauthor = sc.nextLine();
				String bpub = sc.nextLine();
				String bcateg = sc.nextLine();
				int bprice = sc.nextInt();
				al = bService.getBooks();
				
				if(al!=null)
				{
					for (Object obj : al) {
						BookModel book1 = (BookModel) obj;
						if(book1.getName().equals(bname))
						{
							flag=0;
							break;
						}
					}
				}
				if(flag==1)
				{
				 book = new BookModel(bname, bauthor, bpub, bprice, bcateg);
					b = bService.addBook(book);
					if (b) {
						System.out.println("Book added succesfully...");
					} else {
						System.out.println("Error while adding book...");
					}
				}
				else
				{
					System.out.println("Book name already present...");
				}
				
				break;

			case 2:
				al = bService.getBooks();
				if(al!=null)
				{
					System.out.println("Id\t"  +"Na\t" +"Au\t" + "Cat\t"
							+"Pr\t" + "Pu\t" +"St\t");
					for (Object obj : al) {
						 book = (BookModel) obj;
						System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getAuthor() + "\t"
								+ book.getCategory() + "\t" + book.getPrice() + "\t" + book.getPubliction()+"\t"+
								book.isStatus());
					}
				}
				else
				{
					System.out.println("No books to display...");
				}
				break;
				
			case 3:
				al = bService.getBooks();
				int count=0;
				if(al!=null)
				{
					for (Object obj : al) {
						int catflag=1;
						int cou=0;
						 book = (BookModel) obj;
						 String cat=book.getCategory();
//						 This loop for book count
						 for(Object obj1 : al)
						 {
							 BookModel book1 = (BookModel) obj1;
							 if(book1.getCategory().equals(cat))
								 cou++;
						 }
//						 This loop for checking previously printed or not
						 for(int i=0;i<count;i++)
						 {
							 BookModel sample=(BookModel)al.get(i);
							 if(sample.getCategory().equals(cat))
							 {
								 catflag=0;
							 }
						 }
						 if(catflag==1)
						 {
							 System.out.println(book.getCategory()+" has "+cou+" books");
						 }
						 count++;
						
					}
				}
				else
				{
					System.out.println("No books to display...");
				}
				break;
				
			case 4:
				al = bService.getBooks();
				count2=0;
				if(al!=null)
				{
					for (Object obj : al) {
						int catflag=1;
						 book = (BookModel) obj;
						 String cat=book.getCategory();
						 
						 for(int i=0;i<count2;i++)
						 {
							 BookModel sample=(BookModel)al.get(i);
							 if(sample.getCategory().equals(cat))
							 {
								 catflag=0;
							 }
						 }
						 if(catflag==1)
						 {
							 System.out.println("Books of category: "+book.getCategory());
							 for(Object obj1 : al)
							 { 
								 BookModel book1 = (BookModel) obj1;
								 if(book1.getCategory().equals(cat))
								 {
									 System.out.println(book1.getId() + "\t" + book1.getName() + "\t" + book1.getAuthor() + "\t"
												+ book1.getCategory() + "\t" + book1.getPrice() + "\t" + book1.getPubliction()+"\t"+
												book1.isStatus());
								 }
							 }
							 
						 }
						 count2++;
						
					}
				}
				else
				{
					System.out.println("No books to display...");
				}
				break;
			case 5:
				al = bService.getBooks();
				count2=0;
				if(al!=null)
				{
					for (Object obj : al) {
						int authflag=1;
						 book = (BookModel) obj;
						 String auth=book.getAuthor();
						 
						 for(int i=0;i<count2;i++)
						 {
							 BookModel sample=(BookModel)al.get(i);
							 if(sample.getAuthor().equals(auth))
							 {
								 authflag=0;
							 }
						 }
						 if(authflag==1)
						 {
							 System.out.println("Books of Author: "+book.getAuthor());
							 for(Object obj1 : al)
							 { 
								 BookModel book1 = (BookModel) obj1;
								 if(book1.getAuthor().equals(auth))
								 {
									 System.out.println(book1.getId() + "\t" + book1.getName() + "\t" + book1.getAuthor() + "\t"
												+ book1.getCategory() + "\t" + book1.getPrice() + "\t" + book1.getPubliction()+"\t"+
												book1.isStatus());
								 }
							 }
							 
						 }
						 count2++;
						
					}
				}
				else
				{
					System.out.println("No books to display...");
				}
				break;
				
			case 6:
				
				sc.nextLine();
				int sflag=1;
				System.out.println("Enter Student Name,Email and Contact");
				String sname = sc.nextLine();
				String semail = sc.nextLine();
				String scontact = sc.nextLine();
				
				al = sService.getStudents();
				
				if(al!=null)
				{
					for (Object obj : al) {
						StudentModel student1 = (StudentModel) obj;
						if(student1.getEmail().equals(semail))
						{
							sflag=0;
							break;
						}
					}
				}
				if(sflag==1)
				{
				 student = new StudentModel(sname, semail, scontact);
					b = sService.addStudent(student);
					if (b) {
						System.out.println("Student added succesfully...");
					} else {
						System.out.println("Error while adding Student...");
					}
				}
				else
				{
					System.out.println("Email already present...");
				}
				break;
				
			case 7:
				
				student=null;
				al=sService.getStudents();
				if(al!=null)
				{
					sflag=0;
					System.out.println("Enter student id to whom you want to issue book:");
					int id=sc.nextInt();
					
					for(Object obj:al)
					{
						 student = (StudentModel) obj;
						if(student.getSid()==id)
						{
							sflag=1;
							break;
						}
					}
					if(sflag==1)
					{
						ArrayList al1;
						al1=bService.getBooks();
						if(al1!=null)
						{
							System.out.println("Enter book id which you want to issue to this student: ");
							int temp=sc.nextInt();
							for(Object obj1:al1)
							{
								BookModel book1 = (BookModel) obj1;
								 if(book1.getId()==temp)
								 {
									if(!book1.isStatus())
									{
										boolean check=sService.issueBook(student,book1);
										if(check)
										{
											System.out.println("Book issued succesfully...");
										}
										else
										{
											System.out.println("Error while Book issue...");
										}
									}
									else
									{
										System.out.println("Book is already issued to someone else...");
									}
								 }
							}
						}
						else
						{
							System.out.println("No books present in library...");
						}						
					}
					else
					{
						System.out.println("Student id not found...");
					}
				}
				else
				{
					System.out.println("No student present in record add student first...");
				}
				break;
				
			case 8:
				al = bService.getBooks();
				if(al!=null)
				{
					System.out.println("Id\t"  +"Na\t" +"Au\t" + "Cat\t"
							+"Pr\t" + "Pu\t" +"St\t");
					for (Object obj : al) {
						 book = (BookModel) obj;
						 if(!book.isStatus())
						 {
							 System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getAuthor() + "\t"
										+ book.getCategory() + "\t" + book.getPrice() + "\t" + book.getPubliction()+"\t"+
										book.isStatus());
						 }	
					}
				}
				else
				{
					System.out.println("No books to display...");
				}
				break;
			case 9:
				al = sService.getStudents();
				if(al!=null)
				{
					System.out.println("Id\t"  +"Name\t" +"Email\t" + "Contact\t");
					for (Object obj : al) {
						student = (StudentModel) obj;
						System.out.println(student.getSid() + "\t" + student.getName() + "\t" + student.getEmail() + "\t"
								+ student.getContact());
						System.out.println("Student Has taken below books::");
						Stack stemp=student.getStak();
						if(!stemp.isEmpty())
						{
							for(Object stackbook:stemp)
							{
								BookModel stubook= (BookModel)stackbook;
									System.out.println(stubook.getId() + "\t" + stubook.getName() + "\t" + stubook.getAuthor() + "\t"
											+ stubook.getCategory() + "\t" + stubook.getPrice() + "\t" + stubook.getPubliction()+"\t"+
											stubook.isStatus());
							}		
						}
						else
						{
							System.out.println("Student Has taken no books...");
						}
					}
				}
				else
				{
					System.out.println("No Student to display...");
				}
				break;
				
			case 10:
				al = bService.getBooks();
				int dflag=0;
				book=null;
				if(al!=null)
				{
					System.out.println("Enter author whose books you want to delete: ");
					sc.nextLine();
					String dauthor=sc.nextLine();
					
					for (Object obj : al) {
						 book = (BookModel) obj;
						 if(book.getAuthor().equals(dauthor))
						 {
							 
							 System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getAuthor() + "\t"
										+ book.getCategory() + "\t" + book.getPrice() + "\t" + book.getPubliction()+"\t"+
										book.isStatus()); 
							 System.out.println("Do you want to delete this book...(yes/no)");
							 String doption=sc.nextLine();
							 if(doption.equals("yes"))
							 {
								 dflag=1;
								
							 }
							 else
							 {
								 System.out.println("Book not deleted...");
							 }
						 }
						
					}
					if(dflag==1)
					{
						 boolean db=bService.deleteBook(book);
						 if(db)
						 {
							 System.out.println("Book deleted succesfully...");
						 }
						 else
						 {
							 System.out.println("Error while Book deletion...");
						 }
					}
					else
					{
						System.out.println("Author not found...");
					}
				}
				else
				{
					System.out.println("No books present...");
				}
				break;
			default:
				System.out.println("Enter correct choice");
			}

		} while (true);

	}

}
