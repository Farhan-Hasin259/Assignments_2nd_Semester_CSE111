                                                              Ans. to the Q.No.-01




public class BankAccount 
{
    
      int accountNo = 0;
        
         String accountType = "Not set";  
       
  

    public void setInfo(int accN, String accTp) 
    {
        
       this.accountNo = accN;
          
           this.accountType = accTp;
         
          
         System.out.println("Account information updated!");
    }
    
        

        public String printDetails() 
        {
        
           return "Account No: " +  accountNo + "\nType: " +  accountType;
                  
        }
}





                                                          Ans. to the Q.No.-02




public class Shape
{

     String name;
       double sd1;
      
     double rd2;

   public void setParameters(String namex, double sd1)
   {
    
       this.name = namex;
          this.sd1 = sd1;
   }


      public void setParameters(String namex, double sd1, double rd2)
      {
         
          this.name = namex;
            this.sd1 = sd1;
             this.name = rd2;
      }


          public String details()
          {
            
             double ar = 0.0;


                if (name == "Circle")
                {
                   
                  ar = Math.PI * Math.pow(sd1,2);
                }
                 
                  
                     else if(name == "Triangle")
                    {
                     
                         ar = 0.5 * sd1 * rd2;
                    }
                    

                         else if(name == "Rectangle")
                        {
                         
                           ar = sd1 * rd2;

                        }
             
                 return "Shape Name:" + name + "\nArea: " + ar;
           }
}






                                                          Ans. to the Q.No.-03




public class Shelf 
{
  
     int capacity = 0;  
       int books = 0;     

    
    public void showDetails() 
    {
        
       System.out.println("Shelf capacity: " + capacity);
          
         System.out.println("Number of books: " + books);
    }

   
       public void addBooks(int NxB) 
       {
        
          if (capacity == 0) 
          {
             
               System.out.println("Zero capacity. Cannot add books.");
          } 
        
             else if (books + NxB > capacity) 
             {
         
                 System.out.println("Exceeds capacity");
             } 
            
                 else 
                 {
                   
                    books += NxB;
                     System.out.println(NxB + " books added to shelf");
                 }
     }
}






                                                          Ans. to the Q.No.-04




public class Library 
{
      
     int bookCapacity;  
       String[] books;    
         int totalBooks = 0;    

    
    public void setBookCapacity(int cpct) 
    {
        
      this.bookCapacity = cpct;
        this.books = new String[cpct];  
        
    }

    
        public void addBook(String bk) 
        {
      
           
           if (totalBooks < bookCapacity) 
           {
              books[totalBooks] = bk;  
               totalBooks++;  
            
                 System.out.println("Book '" + bk + "' added to the library");
           } 
             
               
              else 
              {
          
                   System.out.println("Maximum capacity exceeds. You can't add more than " + bookCapacity + " books");
        
              }
         }

   
            public void printDetail() 
            { 
       
              System.out.println("Maximum Capacity: " + bookCapacity);
        
                System.out.println("Total Books: " + totalBooks);
          
                  System.out.println("Book list: ");
        
        
           for (int i = 0; i < totalBooks; i++) 
           {
            
            System.out.println(books[i]);  
           }
     }
}






                                                          Ans. to the Q.No.-05




public class TaxiLagbe 
{
  
    String taxiNumber;  
       String area;        
        
       int[] fares = new int[4];            
      
       int totalFare = 0; 
      int totalPassengers = 0;   
   
       String[] passengers = new String[4];

    
    public void storeInfo(String txN, String arN) 
    {
      
        this.taxiNumber = txN;
          this.area = arN;
    }

    
       public void addPassenger(String psgn, int fare) 
       {
      
         if (totalPassengers < 4) 
         {
          
            passengers[totalPassengers] = psgn;
              fares[totalPassengers] = fare;
              
              totalPassengers++;
            
               totalFare += fare;
              
               System.out.println("Dear " + psgn + "! Welcome to TaxiLagbe");
        } 
              
              else 
              {
                
                System.out.println("Taxi Full! No more passengers can be added");
              }
      }

    
              public void addPassenger(String psgn2, int fare2, String psgn3, int fare3) 
              {
        
                if (totalPassengers < 4) 
                {
           
                   passengers[totalPassengers] = psgn2;
                    fares[totalPassengers] = fare2;
            
                      totalPassengers++;
                   totalFare += fare2;
            
                       System.out.println("Dear " + psgn2 + "! Welcome to TaxiLagbe");
            
            
                       if (totalPassengers < 4) 
                       {
                
                         passengers[totalPassengers] = psgn3;
                            fares[totalPassengers] = fare3;
                
                           totalPassengers++;                
                             totalFare += fare3;
                
                             System.out.println("Dear " + psgn3 + "! Welcome to TaxiLagbe");
                        }
                  } 
          
                           else 
                           {
            
                             System.out.println("Taxi Full! No more passengers can be added");
                           }
               }

    
           public void printDetails() 
           {
        
             System.out.println("Taxi number: " + taxiNumber);
        
                 System.out.println("This taxi can cover " + area + " area");
        
            System.out.println("Total Passenger: " + totalPassengers);
        
              System.out.print("Passenger Lists:  ");
        
        
              
              for (int i = 0; i < totalPassengers; i++) 
              {
            
                System.out.print(passengers[i]);
              }
        
                    System.out.println(); 
        
         System.out.println("Total collected fare: " + totalFare + " Taka");
    }
}






                                                          Ans. to the Q.No.-06




public class Student 
{
    
     String name = "Not Set";
        String department = "CSE";
         double cgpa = 0.0;
      
         int credits = 9;
          String scholarshipStatus = "Not Set";
    
        
        
    public void updateDetails(String stNam, double stCgo, int stCred6, String stDepx) 
    {
        
       this.name = stNam;
         
       this.cgpa = stCgo;
          this.credits = stCred6;
            
          this.department = stDepx;
    }

    
      
         public void checkScholarshipEligibility() 
         { 
           
            if (cgpa >= 3.5 && credits > 10) 
            {
             
              
              if (cgpa >= 3.7) 
              {
                 
                 scholarshipStatus = "Merit based scholarship";
                  
                System.out.println(name + " is eligible for Merit based scholarship");
               } 
              
                 
                 if(cgpa >= 3.5 && cgpa < 3.7) 
                 {
                                  
                   scholarshipStatus = "Need based scholarship";
                   
                     System.out.println(name + " is eligible for Need based scholarship");
                  }
             } 
            
            else 
            {
               scholarshipStatus = "No scholarship";
                  
                 System.out.println(name + " is not eligible for scholarship");
            }
       }

    
         public void showDetails() 
         {
                   
           System.out.println("Name: " + name);
             
               System.out.println("Department: " + department);
               
             System.out.println("CGPA: " + cgpa);
          
          System.out.println("Credits: " + credits);
            
               System.out.println("Scholarship Status: " + scholarshipStatus);
         }
}






                                                          Ans. to the Q.No.-07




public class Cart 
{
     
     int cartNumber;
       int itemCount = 0;
        double discount = 0.0;
     
        String[] items = new String[3];
     double[] prices = new double[3];

     
    public void create_cart(int cartN) 
    {
       
       this.cartNumber = cartN;
    }

    
    public void addItem(String itm, double prc) 
    {
        
        if (itemCount < 3) 
        {
            
            items[itemCount] = itm;
              prices[itemCount] = prc;
            
               itemCount++;
            
               System.out.println(itm + " added to cart " + cartNumber);
            
                 System.out.println("You have " + itemCount + " item(s) in your cart now.");
         } 
           
           else 
           {
            
                System.out.println("You already have 3 items on your cart");
           }
    }

   
       public void addItem(double prc, String itm) 
       {
        
       }

    
          public void giveDiscount(double disc) 
          {
        
             this.discount = disc;
        
                System.out.println("Discount Applied: " + discount + "%");
          }

               public void cartDetails() 
               {
                 
                    System.out.println("Your cart(c" + cartNumber + ") : ");
        
                        double totalPrice = 0.0;
        
        
       
                    for (int irs = 0; irs < itemCount; irs++) 
                    {
            
                      System.out.println(items[irs] + " - " + prices[irs]);
            
                      totalPrice += prices[irs];
                    }

        
        double discAm = totalPrice * (discount / 100);
        double totalPrcAfDisc = totalPrice - discAm;
        
        
            System.out.println("Discount Applied: " + discount + "%");
       
               System.out.println("Total price: " + totalPrcAfDisc);
    
               }
}






                                                          Ans. to the Q.No.-08




public class Reader 
{
    
    String name;
      int capacity;
     int currentBookCount;
      
         String[] books;
    

    
    public Reader() 
    {
        
      name = "New user";  
         capacity = 0;       
        
            books = new String[10];  
      currentBookCount = 0;    
    }

    
    public String createReader(String rdNam, int rdcpct) 
    {
        
       name = rdNam;
         capacity = rdcpct;
           
            books = new String[capacity];  
        currentBookCount = 0;  
        
      return "A new reader is created!";
    }

    
    public void addBook(String bookName) 
    {
        
        if (currentBookCount < capacity) 
        {
            
          books[currentBookCount] = bookName;
            
              currentBookCount++;
            
              
        } 
          
            else 
            {
            
               System.out.println("No more capacity");
            }
    }

    
          public void readerInfo() 
          {
        
            System.out.println("Name: " + name);
        
                System.out.println("Capacity: " + capacity);
        
              System.out.println("Books: ");
        
              
                if (currentBookCount == 0) 
                {
             
                     System.out.println("No books added yet");
                } 
                
                   else 
                   {
                   
                      for (int i = 0; i < currentBookCount; i++) 
                      {
                        
                            System.out.println("Book " + (i + 1) + ": " + books[i]);
                      }
                   }
           }
}







