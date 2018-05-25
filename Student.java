import java.util.Scanner;  
 
public class Student{
  
	private String  surname, school, birthyear;
   public String name;    
       public Student(String a,String b,String c,String d)
   { 
       name=a;
       surname=b;
       school=c;
       birthyear=d;
		
	}
   

  public String displayStudent(){
 
		String StudentInfo = "----------------------------"+
						"\nName:                  "+name+
						"\nSurname:                 "+surname+
						"\nSchool:              "+school+ 
						"\nBirthyear:        "+birthyear+
						"\n----------------------------";
		return StudentInfo;	
	}
 public String getName() { return name; }
   	
	   }