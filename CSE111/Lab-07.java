                                                                  Ans. to the Q. No.-01




public class BBAStudent extends Student 
{
  
   public BBAStudent()
   {
    
      setName("Default");
        setDepartment("BBA");
   }
      
      public BBAStudent(String qpi)
      {
       
         setName(qpi);
           setDepartment("BBA");
      }
}
    




                                                                  Ans. to the Q. No.-02




public class CheckingAccount extends Account 
{
    
       public static int count = 0;
    
   
    public CheckingAccount() 
    {
      
        super(0.0);
          count += 1; 
    }
    
    
       public CheckingAccount(double bcl) 
       {
      
           super(bcl); 
               count += 1; 
       }
}





                                                                  Ans. to the Q. No.-03




//Cat Class:

public class Cat extends Animal 
{
    
         public String brd;

    
    public Cat(String nmx, int boyosh, String clr, String brr) 
    {
        
        super(nmx, boyosh, clr);  
          brd = brr;
    }

    
       public void makeSound() 
       {
         
          System.out.println(color + " color " + name + " is meowing");
       }
    
       
           public String info() 
           {
        
              return super.info() + "Breed: " + brd;
           }
}




//Dog Class:

public class Dog extends Animal 
{
    
         public String brd;

    
    public Dog(String nmx, int boyosh, String clr, String brr) 
    {
      
        super(nmx, boyosh, clr); 
           brd = brr;
    }

        
           public void makeSound() 
           {
               
               System.out.println(color + " color " + name + " is barking");
           }
             
              
               public String info() 
              {
           
                 return super.info() + "Breed: " + brd; 
              }
}





                                                                  Ans. to the Q. No.-04




public class Vehicle2010 extends Vehicle
{
      
     
      public void moveLowerRight()
      {
     
         y = y - 1;
          
          x = x + 1;
      }
   
   
          public void moveLowerLeft()
          {
     
             y = y - 1;
              
              x = x - 1;
          }
   
              
             public void moveUpperRight()
             {
     
                y = y + 1;
                 
                 x = x + 1;
             }  
}





                                                                  Ans. to the Q. No.-05




public class ComplexNumber extends RealNumber 
{
  
       public double Imval;

    
    public ComplexNumber() 
    {
      
        super(1.0);  
          this.Imval = 1.0;  
    }

    
       public ComplexNumber(double realValue, double val) 
       {
         
          super(realValue);  
           this.Imval = val;  
    }

    
    public String toString() 
    {
      
        return "RealPart: " + realValue + "\nImaginaryPart: " + Imval;
    }
}






                                                                  Ans. to the Q. No.-06



//Manager Class:


public class Manager extends Employee 
{
  
     private double BonusPer;
       private double finalS;

    public Manager(String name, double baseSalary, int hoursWorked, double bonus) 
    {
      
        super(name, baseSalary, hoursWorked);
        
           this.BonusPer = bonus;
             this.finalS = baseSalary;
    }

    
        public void calculateSalary() 
        {
          
            finalS = getBaseSalary();

           if (getHoursWorked() > 40) 
           {
             
               finalS += finalS * (BonusPer / 100);  
  
           } 
           
              else 
              {
                
                  System.out.println("The Bonus is denied");
              }
                 
                 
         }

    
    public void requestIncrement(int Inc) 
    {
       
         if(getHoursWorked() > 100) 
         {
            
              System.out.println("$" + Inc + " Increment approved");
              
               setBaseSalary(getBaseSalary() + Inc);
         }
         
             else if(getHoursWorked() > 80) 
             {
               
               Inc = Inc / 2;
               
                 System.out.println("$" + Inc + " Increment approved");
                   
                   setBaseSalary(getBaseSalary() + Inc);
             }
             
                else
                {
                  
                   System.out.println("Increment denied");
                }
    }

 
   public void displayInfo()
   {
     
       super.displayInfo();
    
       System.out.println("Bonus: " + BonusPer + " %");
         System.out.println("Final Salary: $" + finalS);
   }
 }





//Developer Class:



public class Developer extends Employee 
{
  
    public String lang;
      
     private double finalS;
     
    public Developer(String name, double baseSalary, int hoursWorked, String lng) 
    {
        
       super(name, baseSalary, hoursWorked);
        
          this.lang = lng;
    }

   
         public void calculateSalary() 
         {
           
             finalS = getBaseSalary();

        
               if (lang.equals("Java")) 
               {
                 
                   finalS = getBaseSalary() + 700;  
                   
                    
               }
               
          }
         
              public void displayInfo()
              {
     
                 super.displayInfo();
                 
                  System.out.println("Language: " + lang);
                   System.out.println("Final Salary: $" + finalS);
              }
                   
}







                                                                  Ans. to the Q. No.-07




public class CinemexTicket extends MovieTicket 
{
  
    public static int tCnt = 0;
      public String genR;
        public String tID;
      public String stat;
    public String satTy;

    
    public CinemexTicket(String movie, String showtime, String gxd, String date) 
    {
      
        super(movie, date, showtime, 0);
        
         this.genR = gxd;
          this.stat = "Not Paid";
           this.satTy = "Regular";
           
             tCnt++;
         this.tID = movie + "-" + satTy.charAt(0) + "-" + tCnt;
    }

    
    public CinemexTicket(String movie, String showtime, String gsd, String date, String sT) 
    {
      
        super(movie, date, showtime, 0);
        
        this.genR = gsd;
         this.stat = "Not Paid";
          this.satTy = sT;
          
            tCnt++;
         this.tID = movie + "-" + satTy.charAt(0) + "-" + tCnt;
    }


       public static int getTotalTickets() 
       {
      
          return tCnt;
       }

    
          public void calculateTicketPrice() 
          {
       
             double prc = 0;
             
             for (int ik = 0; ik < seatTypes.length; ik++) 
             {
            
                if (seatTypes[ik].equals(satTy)) 
                {
                  
                   prc = seatPrices[ik];
                     break;
                }
             }

       char fChar = showtime.charAt(0); 
       char seChar = showtime.charAt(1);
       
       if (fChar == '1' && seChar >= '8' && seChar <= '9' || fChar == '2' && seChar >= '0' && seChar <= '2') 
       {
         
           prc += prc * (nightShowCharge / 100.0); 
       }

          setPrice(prc);
        
         System.out.println("Ticket price is calculated successfully.");
    }

          
          
    public String confirmPayment() 
    {
      
        if (stat != null && stat.equals("Paid")) 
        {
          
            return "Ticket price is already paid!";
        } 
          
           else 
           {
            
              stat = "Paid";
             
                return "Payment Successful.";
           }
    }

    
    public String toString() 
    {
      
        return "Ticket ID: " + tID + "\n" + super.toString() + "\nGenre: " + genR + "\nSeat Type: " + satTy + "\nPrice(tk): " + getPrice() + "\nStatus: " + stat;
    }
}






                                                                  Ans. to the Q. No.-08




//KKTea Class:


public class KKTea extends Tea 
{
  
    public int teaBg;
     
      public static int totalS = 0;
    
        public static int rglTeaS = 0;

    
        public KKTea(int price, int TB) 
        {
          
           super("KK Regular Tea", price);
        
             this.teaBg = TB;
        }

    
       public static void updateSoldStatusRegular(KKTea Tw) 
       {
        
           if (!Tw.status) 
           {             
             
             Tw.status = true;
             
              totalS++;
            
                 rglTeaS++;
           }
        }

    
       public static void totalSales() 
       {
         
         System.out.println("Total Sales: " + totalS);
       
           System.out.println("KK Regular Tea: " + rglTeaS);
       }

   
            public void productDetail() 
            {
              
               super.productDetail();
                  
                 System.out.println("Weight: " + teaBg * 2 + ", Tea Bags: " + teaBg);
            }
}





//KKFlavouredTea Class:



public class KKFlavouredTea extends KKTea 
{
  
   String Nam;
   
    public static int fTeaS = 0;

    public KKFlavouredTea(String n23, int price, int teaBg) 
    {
      
        super(price, teaBg);
          this.Nam = "KK " + n23 + " Tea";
    }

   
        public static void updateSoldStatusFlavoured(KKFlavouredTea jhy) 
        {
           
            if (!jhy.status) 
            {
              
              jhy.status = true;
              
                totalS++;
            
                  fTeaS++;
            }
         }

    
    public void productDetail() 
    {
      
        super.productDetail();
    }

    
       public static void totalSales() 
       {
         
         System.out.println("Total Sales: " + totalS);
       
           System.out.println("KK Regular Tea: " + rglTeaS);
          
          System.out.println("KK Flavoured Tea: " + fTeaS);
       }
}


