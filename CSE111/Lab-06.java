                                                                    Ans. to the Q. No.-01




public class Product 
{
  
    private int Qnty;
     private String pNam;
      private double prc;
  

    public Product() 
    {
        
       this.pNam = "Unknown";
        this.prc = 0.0;
         this.Qnty = 0;
    }

    
      public Product(String prName34, double prce78) 
      {
        
         this.pNam = prName34;
          this.prc = prce78;
           this.Qnty = 0; 
      }


    
          public void setName(String prdctNam) 
          {
            
             this.pNam = prdctNam;
          }
    
    
             public String getName() 
             {
               
                return pNam;
             }

    
        public void setPrice(double prce2024) 
        {
          
           this.prc = prce2024;
        }
    
    
           public double getPrice() 
           {
             
              return prc;
           }

  
    public void setQuantity(int quan) 
    {
      
        this.Qnty = quan;
    }
    
     
       public int getQuantity() 
       {
         
          return Qnty;
       }

    
    
    public void displayInfo() 
    {
      
        System.out.println("Product Name: " + pNam);
        System.out.println("Price: $" + prc);
    }

    
       public void displayInfo(boolean xy) 
       {
         
          System.out.println("Product Name: " + pNam);
            System.out.println("Price: $" + prc);
        
              if (xy == true) 
              {
            
                System.out.println("Quantity: " + Qnty);
              }
       }
}





                                                                    Ans. to the Q. No.-02




public class Passenger 
{
    
    public static int no_of_passenger = 0;
      public static double total_fare = 0.0;

    
    public String Nam;
     public double Dstnc;
      public double BaggageW = 0.0;  
       
      
    
     public Passenger(String n123, double dist43) 
     {
        
        this.Nam = n123;
          this.Dstnc = dist43;
        
         no_of_passenger++;  
                 
     }

    
          public void storeBaggageWeight(double Wght) 
          {
        
              this.BaggageW = Wght;
        
          }

    
    public void passengerDetails() 
    {
        double fare32 = (Dstnc * 20) + (10 * BaggageW);
        
        System.out.println("Name: " + Nam);
          System.out.println("Fare: " + fare32 + " TK");
          
           total_fare += fare32;
    }
}


     



                                                                    Ans. to the Q. No.-03




public class Book 
{
    
    public static int total_books_sold = 0;
      public static double total_revenue = 0.0;

     public double Bprc = 150.0;
     
    public String Title50;
     public double discPer;
      public double prcADisc;

      
     public Book(String T, double Dis) 
     {
       
        this.Title50 = T;
         this.discPer = Dis;
                     
            this.prcADisc = Bprc - (Bprc * discPer / 100);
                     
            total_books_sold++;
             total_revenue += prcADisc;
         
     }
 
                      
   
           public void bookDetails() 
           {
        
             System.out.println("Title: " + Title50);
        
               System.out.println("Price after Discount: " + prcADisc + " TK");
               
           }
}






                                                                    Ans. to the Q. No.-04




public class Circle 
{
    
    public static int count = 0;
    
       private double rds;

    
      public Circle(double Rnum) 
      {
       
         this.rds = Rnum;
        
            count++; 
      }


      
          public void setRadius(double rds2) 
          {
            
             this.rds = rds2;
          }
    
    
              public double getRadius() 
              {
        
                 return rds;
              }

    
              
    public double area() 
    {
        
        return Math.PI * rds * rds;
    }
}





                                                                    Ans. to the Q. No.-05




public class Borrower
{
  
   public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    
     public String Nam4w; 
      public String brBooks; 
       public int Cnt;

        
       
       public Borrower(String n3) 
       {
         
          this.Nam4w = n3; 
           this.brBooks = ""; 
            this.Cnt = 0; 
       }
       
       
       
       public void borrowBook(String rbook) 
       {
         
          for (int k = 0; k < book_name.length; k++) 
          {
           
             if (book_name[k].equals(rbook))
             {
                 
                if(book_count[k] > 0)
                {
                  
                  brBooks += rbook; 
                    book_count[k]--; 
                     Cnt++;
                }
              
                 else 
                 {
               
                      System.out.println("This book is not available.");
                 }
                      return; 
              }
          }
          
       }
          
       
       
           public void borrowerDetails() 
           {
         
              System.out.println("Name: " + Nam4w); 
                System.out.println("Books Borrowed: " ); 
           
                if(Cnt > 0) 
                {
             
                   System.out.println(brBooks); 
                }
            }
       
       
             public static int remainingBooks(String bk) 
             {
              
               for (int ik = 0; ik < book_name.length; ik++) 
               {
                 
                 if (book_name[ik].equals(bk)) 
                 {
                   
                   return book_count[ik]; 
                 }
               } 
                 return -10;   
            }
            
            
            public static void bookStatus() 
            {
              
               System.out.println("Available Books: "); 
              
                 for (int jh = 0; jh < book_name.length; jh++) 
                 {
                   
                    System.out.println(book_name[jh] + ": " + book_count[jh]);
                 } 
            }
}
       





                                                                    Ans. to the Q. No.-06




public class Cargo 
{

    public static double capacity = 10.0;  
     public static double usedCap = 0.0;    
      public static int cnter = 0;          

      public int crgID;
       public String Cntent;
      public double wght;
         public boolean load;

    
    public Cargo(String con, double w23) 
    {
        
        this.crgID = ++cnter;  
         this.wght = w23;
          this.Cntent = con;
           this.load = false;  
    }

    
        public void load() 
        {
               
            if (capacity >= wght) 
            {
              
              load = true;
               capacity = capacity - wght;
            
              System.out.println("Cargo " + crgID + " loaded for transport."); 
            }
            
               else 
               {
              
                  System.out.println("Cannot load cargo, exceeds weight capacity."); 
               }
        } 
    

    
              public void unload() 
              {
        
                if (load = false) 
                {
                  
                   System.out.println("Cargo is not loaded.");
                }
                
                   else
                   {
                     
                      load = true;
                       capacity = capacity + wght;
                        
                        System.out.println("Cargo " + crgID + " unloaded.");
                   }
              }

    
              
              public static double capacity() 
              {
    
                   return capacity;
              }

              
    public void details() 
    {
        
       System.out.println("Cargo ID: " + crgID + ", Contents: " + Cntent + ", Weight: " + wght + ", Loaded: " + load);
                           
    }

}





                                                                    Ans. to the Q. No.-07




public class Student 
{
  
    public String Nam;
     public int ID;
      public double Cgrade;
       public String dept;
      
       
       public static int Total;
     public static int CSE;
    public static int otherdep;


    public Student(String nam45, double cgp) 
    {
      
        this.Nam = nam45;
         this.Cgrade = cgp;
          this.dept = "CSE";
          
            if (dept.equals("CSE")) 
           {
            
              CSE++;
           } 
           
             else 
             {
           
                otherdep++;
             }
                          
               Total++;
                this.ID = Total;
    }

    
       public Student(String nam46, double cgrad, String dept) 
       {
         
          this.Nam = nam46;
           this.Cgrade = cgrad;
            this.dept = dept;
            
            
           if (dept.equals("CSE")) 
           {
            
              CSE++;
           } 
           
             else 
             {
           
                otherdep++;
             }
             
                Total++;
                 this.ID = Total;
    }

    
       public void individualDetail() 
       {
         
          System.out.println("ID: " + ID);
           System.out.println("Name: " + Nam);
            System.out.println("CGPA: " + Cgrade);
             System.out.println("Department: " + dept);
       }

   
          public static void printDetails() 
          {
            
             System.out.println("Total Student(s): " + Total);
               System.out.println("CSE Student(s): " + CSE);
              System.out.println("Other Department Student(s): " + otherdep);
          }
}





                                                                    Ans. to the Q. No.-08




public class Player 
{
  
    public String Name1;
     public String desh;
      public int Jers;
       public static int total = 0;
        public static String plynam ="";
      public boolean g = true;
      
      public int Max = 11;
      
   
     public Player(String nyc, String cntry, int jdx) 
     {
       
        this.Name1 = nyc;
         this.desh = cntry;
          this.Jers = jdx;
          
               
             if(total >= Max)
             {                
                
                System.out.println("Can't add more");
             }
             
               else
               {
                 
                 total++;
               }
          
              
                 if (total == 1) 
                 {
                   
                     plynam = Name1;
                 }
                 
                   else
                   {
                     
                      plynam += ", " + Name1;
                   }
                                                                                  
    } 
        
    

    public String player_detail() 
    {
      
        return "Player Name: " + Name1 + "\nJersey Number: " + Jers + "\nCountry: " + desh;
    }

    
       public static void info() 
       {
         
          System.out.println("Total number of players: " + total);
           System.out.println("Players enlisted so far: " + plynam);
       }
}
