                                                              Ans.to the Q. No.-01




public class UniversityTester
{
  public static void main(String[] args)
  {
      
      University unvrst15 = new University();
      University unvrst29 = new University();
      
      System.out.println("Location of the 1st University: " + unvrst15);
      System.out.println("Location of the 2nd University: " + unvrst29);
      
      if(unvrst15 != unvrst29)
      { 
        System.out.println("The location of the objects are not same.");
      }

      System.out.println("1st University Name: " + unvrst15.name);
      System.out.println("Country: " + unvrst15.country);
      System.out.println("2nd University Name: " + unvrst29.name);
      System.out.println("Country: " + unvrst29.country);
      
          unvrst15.name = "Imperial College London";
       unvrst15.country = "England";        
          unvrst29.name = "Brac University";
       unvrst29.country = "Bangladesh";        
        
       
       System.out.println("After Modification:");

       
       System.out.println("1st University Name: " + unvrst15.name);
       System.out.println("Country: " + unvrst15.country);
       System.out.println("2nd University Name: " + unvrst29.name);
       System.out.println("Country: " + unvrst29.country);
       
        if (unvrst15.name.equals("Imperial College London") && unvrst15.country.equals("England")) 
        {
           
            System.out.println("University's first instance variables are correctly updated.");
       
        }

           if (unvrst29.name.equals("Brac University") && unvrst29.country.equals("Bangladesh")) 
           {
              
               System.out.println("University's second instance variables are correctly updated.");
           
           }
        
              if (unvrst15.name.equals(unvrst29.name) && unvrst15.country.equals(unvrst29.country)) 
              {
                 System.out.println("Both of the Universities have the same name and country.");
              } 
              
              else 
              {
                 System.out.println("The Universities have different names and countries.");
              }
    }
}






                                                              Ans.to the Q. No.-02




public class Student 
{
    String name;
    
      int id;

    
    public Student() 
    {
       name = "Default"; 
       
         id = 0;           
    }
    
}







                                                              Ans.to the Q. No.-03




public class CSECourse 
{
    
    String courseName;
    
     String courseCode;
    
      int credit;

    
    public CSECourse() 
    {
       courseName = "Programming Language II"; 
       
        courseCode = "CSE111";
       
          credit = 3;                             
    }
}






                                                              Ans.to the Q. No.-04




public class ImaginaryNumber 
{
   
    int realPart;
     int imaginaryPart;

    
    public ImaginaryNumber() 
    {
        realPart = 0; 
          imaginaryPart = 0;  
    }

    
       public void printNumber() 
       {
        
          if (imaginaryPart  <  0) 
          {
            System.out.println(realPart + " " + imaginaryPart + "i");
          } 
        
            else 
            {
              System.out.println(realPart + " + " + imaginaryPart + "i");
            }
       }
}






                                                              Ans.to the Q. No.-05




public class Course 
{
   
    String courseName;
     String courseCode;
      int courseCredit;

   
    public void updateDetails(String xnum, String cdfr, int crdtc) 
    {

       courseName = xnum;   
        courseCode = cdfr;   
         courseCredit = crdtc; 
    
    }

    
    public void displayCourse() 
    {
      
       System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
         System.out.println("Course Credit: " + courseCredit);

    }
}






                                                              Ans.to the Q. No.-06




public class Assignment 
{
    
    int tasks;
     String difficulty;
      boolean submission;

    
    public Assignment() 
    {
      
       tasks = 0;             
        difficulty = null;     
         submission = false;    
    
    }

    
    public void printDetails() 
    {
       
      System.out.println("Number of tasks: " + tasks);
       System.out.println("Difficulty level: " + difficulty);
        System.out.println("Submission required: " + submission);
    
    }


    
    public String makeOptional() 
    {
     
        if (submission) 
        {
          
            submission = false;  
             
              return "Assignment will not require submission";
            
        } 
        
        else
          
        {
           
            return "Submission is already not required";
           
        }
    }
}






                                                              Ans.to the Q. No.-07




public class CellPhone 
{
    
    String model;
     String [] contacts;  
      int cntcCnt;    

    
    public CellPhone() 
    {
       model = "unknown";            
        contacts = new String [3];     
         cntcCnt = 0;             
    
    }

   
    public void printDetails() 
    {
       
      System.out.println("Phone Model " + model);
        System.out.println("Contacts Stored " + cntcCnt);
        
        if (cntcCnt > 0) 
        {
            System.out.println("Stored Contacts:");
                        
             
             for (int ik = 0; ik < cntcCnt; ik++) 
             {
                
                System.out.println(contacts[ik]);
             
             }
        }
    }

    
    public void storeContact(String cntcD) 
    {
        
       if (cntcCnt < contacts.length) 
       {
            contacts[cntcCnt] = cntcD;  
           
                 cntcCnt++;  
             
             System.out.println("Contact Stored");
        } 
       
          else 
         {
            
             System.out.println("Memory full. New contact can't be stored.");
       
         }
    }
}






                                                              Ans.to the Q. No.-08




public class Employee 
{
   
   String NamexnmD;       
    
    double Salary;     
      
      String Designation; 


    
    public void newEmployee(String xnmD) 
    {
        this.NamexnmD = xnmD;
         this.Salary = 30000;
          this.Designation = "junior";
        
    }

   
    public void displayInfo() 
    {
      
        System.out.println("Employee Name: " + NamexnmD);
         System.out.println("Employee Salary: " + Salary + " Tk");
          System.out.println("Employee Designation: " + Designation);
        
    }

  public void promoteEmployee(String pstn) 
    {
        
        if (pstn.equals("lead")) 
        {
            Designation = "lead";
             Salary += 50000;
             
              System.out.println(NamexnmD + " has been promoted to lead");
           System.out.println("New Salary: " + Salary + " Tk");
        } 
        
 
            else if (pstn.equals("senior")) 
            {
              Designation = "senior";
               Salary += 25000;
               
              System.out.println(NamexnmD + " has been promoted to senior");
              System.out.println("New Salary: " + Salary + " Tk");
            } 
        
             
                else if (pstn.equals("manager")) 
                {
                   Designation = "manager";
                     Salary += 75000;  
               
                    System.out.println(NamexnmD + " has been promoted to manager");
                   System.out.println("New Salary: " + Salary + " Tk");
                }
        
    }

  
    public void calculateTax() 
    {
        
        if (Salary > 50000) 
        {
            
          double TxD = Salary * 0.30;  
            
           System.out.println(NamexnmD + " Tax Amount: " + TxD + " Tk");
            
        } 
           else if (Salary > 30000) 
           {
              double TxD = Salary * 0.10;  
               System.out.println(NamexnmD + " Tax Amount: " + TxD + " Tk");
           } 
              else 
             {
            
                 System.out.println("No need to pay tax");
             }
    }
}
    
    

    
    




