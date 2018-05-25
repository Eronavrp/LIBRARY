import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataBases
{    
     static ArrayList<Student> StudentList = new ArrayList<Student>();
     static ArrayList<Book> BookList = new ArrayList<Book>();
     private int  BookChoice;
     public int choice ;
     private String  title, author, publisher, publicationYear,borrower, 
      status1 = "Available",status2 = "Borrowed",name , surname, school, birthyear;

 
     private Scanner userInput = new Scanner(System.in);
     private Scanner choiceInput = new Scanner(System.in);
     
    
   
	  public void displayFirstMenu(){
		System.out.println("> Choose one of the options below by typing the corresponding number: "+"\n"+
		                   ">===================================================================="+"\n"+
		                   "2- Add a book to the Library."+"\n"+
		                   "6- Blow up library."+"\n"+
		                   "7- Back to main menu."+"\n"+
                         "8- Add student."+"\n"+
                         "0- Exit.");
		System.out.println();
		System.out.println("> Enter your option here: ");
		String cho = choiceInput.nextLine();//User inputs a choice (integer).
     if (cho.equals("2")||cho.equals("6")||cho.equals("7")||cho.equals("0")||cho.equals("8")){choice=new Integer(cho).intValue();}
    else{  System.out.println("The number u typed is invalid,try again");
    System.out.println();
    this.displayFirstMenu(); }

	}
 
	public  void displaySecondMenu(){
		System.out.println("> Choose one of the options below by typing the corresponding number: "+"\n"+
		                   ">===================================================================="+"\n"+
		                   "1- Check library list."+"\n"+
		                   "2- Add a book to the Library."+"\n"+
                         "3- Borrow a book."+"\n"+
		                   "4- Return a book."+"\n"+
		                   "5- Delete a book."+"\n"+
		                   "6- Blow up library."+"\n"+
		                   "7- Back to main menu."+"\n"+
                         "8- Add a student."+"\n"+
                         "9- Check student list"+"\n"+
                         "0- Exit.");
		System.out.println();
		System.out.println("> Enter your option here: ");
		String ch = choiceInput.nextLine();//User inputs a choice (integer).
      if (ch.equals("1")||ch.equals("2")||ch.equals("3")||ch.equals("4")||ch.equals("5")||ch.equals("6")
      ||ch.equals("7")||ch.equals("0")||ch.equals("8")||ch.equals("9")){choice=new Integer(ch).intValue();}
  else{  //System.out.println("The number u typed is invalid,try again");
    System.out.println();
    this.displaySecondMenu(); }
   		}


	
     
 
   public  void addBook(){
		 //create new book object with status "Available."
      System.out.println("> Enter the title of the book: ");
		title = userInput.nextLine();
 
		System.out.println("> Enter the author of the book: ");
		author = userInput.nextLine();
 
		System.out.println("> Enter the publisher of the book: ");
		publisher = userInput.nextLine();
 
		System.out.println("> Enter the publication year of the book: ");
		publicationYear = userInput.nextLine();
       
		Book newBook=new Book(title,author,publisher,publicationYear);
		BookList.add(newBook);//add the book to the BookList ArrayList.
		System.out.println("---------------------------------------------------------");
		System.out.println("> You have successfully added the book to the library!\n");
		System.out.println("---------------------------------------------------------");	
	}
   
      
  public void displayBookList(){
		if (BookList.size() == 0){//If the library is empty, it goes back to main menu and choice.
			System.out.println(">-------------------------------------------------------------");
			System.out.println("> There Library is Emply! Please add a book first!\n");
			System.out.println(">-------------------------------------------------------------");
			displayFirstMenu();//Display to main menu.
			choice = choiceInput.nextInt();//Register new choice.
 
		} else {					
			for (int i = 0; i < BookList.size(); i++){
				System.out.printf("\n>-----------Book Index: [%s]---------------------------------\n",i+1);
				System.out.println(BookList.get(i).displayBook());	
				System.out.println(">-------------------------------------------------------------");
			}		
		}			
	}

 public  void addStudent(){
		 //create new book object with status "Available."
      System.out.println("> Enter the  name of the student: ");
		name = userInput.nextLine();
 
		System.out.println("> Enter the surname of the student ");
		surname = userInput.nextLine();
 
		System.out.println("> Enter the school");
		school= userInput.nextLine();
 
		System.out.println("> Enter the birthyear of the student: ");
		birthyear = userInput.nextLine();
       
		Student newStudent=new Student(name,surname,school,birthyear);
		StudentList.add(newStudent);//add the book to the BookList ArrayList.
		System.out.println("---------------------------------------------------------");
		System.out.println("> You have successfully added the book to the library!\n");
		System.out.println("---------------------------------------------------------");	
	}

 public void displayStudentList(){
		if (StudentList.size() == 0){//If the library is empty, it goes back to main menu and choice.
			System.out.println(">-------------------------------------------------------------");
			System.out.println("> There Library is Emply! Please add a student first!\n");
			System.out.println(">-------------------------------------------------------------");
			displayFirstMenu();//Display to main menu.
			choice = choiceInput.nextInt();//Register new choice.
 
		} else {					
			for (int i = 0; i < StudentList.size(); i++){
				System.out.printf("\n>-----------Student Index: [%s]---------------------------------\n",i+1);
				System.out.println(StudentList.get(i).displayStudent());	
				System.out.println(">-------------------------------------------------------------");
			}		
		}			
	}

 
   public void borrowBook(){
		System.out.println("---------------------------------------------------------");
		System.out.println("> Here are all the books registered in the library: ");
		System.out.println("---------------------------------------------------------");		
		displayBookList();
 
		borrowLoop1:
		while(choice == 3){
			System.out.println("\n\n> Choose an available book from the above list and write down it's index number: ");
			BookChoice = choiceInput.nextInt()-1;//register user's book choice.
			if(BookChoice > BookList.size()){
				System.out.println("> The number of the book you entered is not in the list!");
            System.out.println();
            this.borrowBook();
			}else{
				break borrowLoop1;
			}
		}		
 
		borrowLoop2:
		while(choice == 3){
			//Check if the book to be borrowed is available.
			if (BookList.get(BookChoice).status.equalsIgnoreCase(status1) && BookList.size() >= BookChoice){
				//Print the borrowed book information and change the book status to borrowed.
				BookList.get(BookChoice).status = "Borrowed";
				System.out.printf("\n> You have chosen the following book: %s\n", BookList.get(BookChoice).displayBook());
 
				//add the user name to the book borrower variable:
				BookList.get(BookChoice).borrower = borrower;
				BookList.get(BookChoice).borrowDate = "Today.";
				BookList.get(BookChoice).returnDate = "In two weeks.";
				System.out.println("> You have to return the book in two weeks!");
				choice = 7;
				break borrowLoop2;
 
			}else if(BookList.get(BookChoice).status.equalsIgnoreCase(status2) && BookList.size() >= BookChoice){
				System.out.println("> The Book you are trying to borrow is unavailable!");
				choice = 7;
				break borrowLoop2;
			}else if(BookChoice > BookList.size()-1){
				System.out.println("> The number you entered in not in the list!");
				choice = 7;
				break borrowLoop2;
			}
		}
	}
   
 public void returnBook(){
		System.out.println("> Enter the Title of the book you want to return: ");
		String returnBookTitle = userInput.nextLine();
		int x = 0;
		while (x < BookList.size()){//Search for the book by title, if it exists change it's status,
									//it's borrower and borrowDate.
			if (BookList.get(x).title.equalsIgnoreCase(returnBookTitle)){
				BookList.get(x).status = "Available";
				BookList.get(x).borrower = "none";
				BookList.get(x).borrowDate = "none";
            BookList.get(x).returnDate = "none";
				System.out.println("> You have successfully returned the book to the library!");
				break;//if a title is found, break out of the loop and display choice menu.
			}
			
	else{
			System.out.println("> The are no books with this title in the library." +
					" Please make sure the title is spelt correctly or choose to add the book " +
					"to the library from the main menu. ");					
			}
         x = x+1;
		}
		displaySecondMenu();
		
	}
 
   public void removeBook(){
		int i = 0;
		System.out.println("---------------------------------------------------------");
		System.out.println("> Here are all the books registered in the library: ");
		System.out.println("---------------------------------------------------------");
 
	
    displayBookList();
		System.out.println("\n\n> Choose an available book from the above list and write down it's number: ");
		int BookChoice = choiceInput.nextInt()-1;//register user's book choice
		               
                if( BookChoice >= BookList.size())
            	{System.out.println("<ERROR> Please enter a number of book from the list: ");
               this.removeBook();}


			else	if (BookChoice >= 0 && BookChoice < BookList.size() && BookList.get(BookChoice).status.equalsIgnoreCase("Available")){//Check if the book to be borrowed is available.
					//Print the borrowed book information and change the book status to borrowed.
					System.out.printf("\n> You have chosen to delete the following book: %s\n", BookList.get(BookChoice));
               BookList.remove(BookChoice);
					System.out.println("\n> The Book  "+(BookChoice+1)+" is deleted.\n");}
				else if (BookChoice >= 0 && BookChoice< BookList.size() && BookList.get(BookChoice).status.equalsIgnoreCase("Borrowed"))
            System.out.printf("\n> The Book %s is not deleted,because its not available");
     		}		
	
 
 public void emptyLibrary(){
		System.out.println("> WARNING < You have chosen to delete all books in the library! ");
		System.out.println("> Are you sure?? Enter yes or no: ");
		String confirmation = userInput.nextLine();
		try{
			if(confirmation.equalsIgnoreCase("yes")){
				System.out.println("> Library is being deleted...");
				BookList.clear();
				System.out.println("> Library is Empty!");
				choice = 7;
			}
		}catch(InputMismatchException error){
			System.out.println("<ERROR> Make sure you spell yes or no correctly: ");
			choice = 6;
		}
	}
 
 
	public void addUser(){
		System.out.println("> Enter students name: ");
		borrower = userInput.nextLine().trim();
      for(int i=0;i<StudentList.size();i++){
      if(StudentList.get(i).name.equalsIgnoreCase(borrower)){}
      else{System.out.println("<ERROR> There is no such student registered in the library: ");
      this.addUser();}
			}
	}}





