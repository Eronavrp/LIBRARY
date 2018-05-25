import java.util.InputMismatchException;
public class Library
{
DataBases library=new DataBases();
public void run(){
 		
 
		library.displayFirstMenu();//Displays the main menu and ask for choice.
 
	
 
		exit:
 
			while(library.choice != 0){	
				
            					
		if(library.choice == 1 && library.BookList.size() > 0){
 
						library.displayBookList();
						library.choice = 7;
					}
 
					if(library.choice == 1 && library.BookList.size() == 0){
						System.out.println("<ERROR> Library is empty! Please add a Book first!");
						library.choice = 7;
					}
					
		if(library.choice == 2){
					
						library.addBook();
						library.displaySecondMenu();
					}
					
		if(library.choice == 3){
						if(library.BookList.size() > 0)
                  {
							library.addUser();
                     library.borrowBook();							
						}						
					}
					
		if(library.choice== 4){
						library.returnBook();
                  library.displaySecondMenu();
                  
                  
					}
					
		if(library.choice  == 5){
						library.removeBook();
							if(library.BookList.size() > 0)
                     {
								library.displaySecondMenu();
                       
							}
						
						else
                  {	System.out.println("<ERROR> The array is Empty! Please add a book first!");
							 library.displayFirstMenu();}
                  }
							
						
				
            
					
		if(library.choice == 6){
						library.emptyLibrary();						
					}
					
		if(library.choice == 7){
						if(library.BookList.size() > 0){
							library.displaySecondMenu();
						}else if(library.BookList.size() == 0){							
							library.displayFirstMenu();
						}
					}
     if(library.choice == 8){
					
						library.addStudent();
						library.displaySecondMenu();
					}
     if(library.choice == 9&& library.StudentList.size() > 0){
 
						library.displayStudentList();
						library.choice = 7;
					}
 
					if(library.choice == 9 && library.StudentList.size() == 0){
						System.out.println("<ERROR> Library is empty! Please add a Book first!");
						library.choice = 7;
					}


					
					if(library.choice == 0){
						break exit;
					}}
			
      System.out.println();
		System.out.println(" You have Exited the Library! ");
 
		}
 
 public static void main(String[] args){
 
		System.out.println("> Welcome to the library!");
 
		Library newBook = new Library();
		newBook.run();
 
	}


}