public class Book {
  
	private String author, publisher, publicationYear;
   public String title,status,borrower,borrowDate, returnDate;
   
         
       public Book(String a,String b,String c,String d)
   { 
       title=a;
       author=b;
       publisher=c;
       publicationYear=d;
       status="Available";
       borrower="nobody";
       borrowDate="none";
       returnDate="none";
		
	}
   

  public String displayBook(){
 
		String BookInfo = "----------------------------"+
						"\nTitle:                  "+title+
						"\nAuthor:                 "+author+
						"\nPublisher:              "+publisher+ 
						"\nPublicationYear:        "+publicationYear+
						"\nStatus:                 "+status+
						"\nBorrower:               "+borrower+
						"\nDate Borrowed:          "+borrowDate+
						"\nReturn date:            "+returnDate+
						"\n----------------------------";
		return BookInfo;	
	}


 
   
   	
	   }