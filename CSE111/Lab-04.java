                                                              Ans. to the Q. No.-01


       //Here is my Design Class:



public class Student 
{
    
    String name;
       String prog;

 
    public Student(String xD, String PR) 
    {
        
      this.name = xD;
        this.prog = PR;
    }

    
       public void updateName(String xD2) 
      {
        
          this.name = xD2;
      }

   
          public void updateProgram(String DePR2)
         {
       
             this.prog = DePR2;
       
         }

    
             public String accessProgram() 
             {
        
                return this.prog;
             }
}







                                                              Ans. to the Q. No.-02


      //Here is my Design Class:



public class Toy 
{
    
    String name;
       int Prc;

    public Toy(String NgT, int AWG) 
    {
        
        this.name = NgT;        
           this.Prc = AWG;
        
           System.out.println("A new toy has been made!");
    }

    
      public void updatePrice(int AWS2) 
      {
        
        this.Prc = AWS2;
      }

    
         public void updateName(String SQ2) 
         {
        
            System.out.println("Changing old name: " + this.name);
        
              this.name = SQ2;
       
           System.out.println("new name: " + this.name);
         }

    
             public void showPrice() 
             {
               
                 System.out.println("price: " + this.Prc + " Taka");
             }
}






                                                              Ans. to the Q. No.-03



      //Here is my Design Class:


public class Shape2D 
{
    
    int lngt;
     int brdth;
      int hgt;
         int base;
       int shb1;
     int scz2;
    int sjk3;
 
    
    public Shape2D() 
    {
        
          this.lngt = 5; 
        
       System.out.println("A Square has been created with length: " + this.lngt);
    }

    
       public Shape2D(int lix, int bux) 
       {
        
          this.lngt = lix;
        
             this.brdth = bux;
        
          System.out.println("A Rectangle has been created with length: " + this.lngt + " and breadth: " + this.brdth);
       }

    
           public Shape2D(int hsx1, int b36, String Typeshp) 
           {
      
               this.hgt = hsx1;
          
                  this.base = b36;
        
               System.out.println("A Triangle has been created with height: " + this.hgt + " and base: " + this.base);
           } 

    
               public Shape2D(int sde10, int sde22, int sde39) 
               {
                
                   this.shb1 = sde10;
        
                      this.scz2 = sde22;
       
                   this.sjk3 = sde39;
        
                     System.out.println("A Triangle has been created with the following sides: " + this.shb1 + ", " + this.scz2 + ", " + this.sjk3);
                } 

    
    
        public void area() 
        {
           
            double ar;
            
           if (brdth == 0 && base == 0 && hgt == 0 && shb1 == 0) 
           {
             
               ar = (lngt * lngt);
              
               System.out.println("The area of the Square is: " + ar);
           } 
           
             else if (shb1 == 0 && hgt == 0 && base == 0) 
             {
                
                   ar = (lngt * brdth);
                
                   System.out.println("The area of the Rectangle is: " + ar);
             } 
             
               else if (base != 0 && hgt != 0) 
               {
                    
                    ar = (0.5 * base * hgt);
                  
                    System.out.println("The area of the Triangle is: " + ar);
               } 
               
                  else if(shb1 != 0 && scz2 != 0 && sjk3 != 0)
                  {
            
                     double s = (shb1 + scz2 + sjk3) / 2;  
            
                        ar = Math.sqrt(s * (s - shb1) * (s - scz2) * (s - sjk3));  
            
                     System.out.println("The area of the Triangle is: " + ar);
                   }
        }
}






                                                              Ans. to the Q. No.-04



   //Here is my Design Class:




public class Student 
{
  
    int idx;
      double cgp;
    
      String[] crss;
    int CrsCnt;

    
    public Student(int zqc) 
    {
        
       this.idx = zqc;
         this.cgp = 0.0;
        
        this.crss = new String[4];
          this.CrsCnt = 0;
          
        System.out.println("A student with ID " + idx + " has been created.");
    }

    
         public Student(int idw, double grades) 
         {
        
           this.idx = idw;        
             this.cgp = grades;
        
             this.crss = new String[4];
           this.CrsCnt = 0;
        
            System.out.println("A student with ID " + idx + " and cgpa " + cgp + " has been created.");
         }

    
             public void storeCG(double cgx) 
             {
        
               this.cgp = cgx;
             }

    
             public void storeID(int ywc) 
             {
        
                this.idx = ywc;
             }

    
         public void addCourse(String crs) 
         {
        
           if (cgp == 0.0) 
           {
             
              System.out.println("Failed to add " + crs);
             
                 System.out.println("Set CG first");                 
           } 
           
              else if (cgp < 3.0 && CrsCnt >= 3) 
              {
                
                 System.out.println("Failed to add " + crs);
                 
                    System.out.println("CG is low. Can't add more than 3 courses.");
              } 
              
                  else if (CrsCnt >= 4) 
                  {
                    
                     System.out.println("Failed to add " + crs);
                     
                       System.out.println("Maximum 4 courses allowed.");
                  } 
                  
                      else 
                      {
            
                        crss[CrsCnt] = crs;
            
                                CrsCnt++;
                      }
         }

    
            public void addCourse(String[] Arrcrs) 
            {
        
               for (int ig = 0; ig < Arrcrs.length; ig++) 
               {
            
                   addCourse(Arrcrs[ig]);
               }
            }

   
            public void removeAllCourse() 
            {
              
                crss = new String[4]; 
                
                   CrsCnt = 0; 
            }
            
            
     public void showAdvisee() 
     {
        
         System.out.println("Student ID: " + idx + ", CGPA: " + cgp);
        
          if (CrsCnt == 0) 
          {
           
             System.out.println("No courses added.");
          } 
          
            else 
            {
            
               System.out.println("Added courses are:");
               
            
                 for (int d = 0; d < CrsCnt; d++) 
                 {
                
                   System.out.print(crss[d] + " ");
                 }
            
                   System.out.println();
            }
     }
}






                                                              Ans. to the Q. No.-05



       //Here is my Design Class:


public class Triangle 
{
    
    int sde19; 
      int sde270; 
    int sde334;


    public void updateSides(int ads, int bxs, int cnh) 
    {
        
      this.sde19 = ads;
        this.sde270 = bxs;
          this.sde334 = cnh;
    }

    
        public void triangleDetails() 
        {
        
            int prm = sde19 + sde270 + sde334;
        
            System.out.println("Three sides of the triangle are: " + sde19 + ", " + sde270 + ", " + sde334);
        
              System.out.println("Perimeter: " + prm);
        }

    
    
           public String printTriangleType() 
           {
        
               if (sde19 == sde270 && sde270 == sde334) 
               {
            
                   return "This is an Equilateral Triangle.";
               } 
               
                 else if (sde19 == sde270 || sde270 == sde334 || sde19 == sde334) 
                 {
            
                     return "This is an Isosceles Triangle.";
                 }
                 
                   else 
                  {
            
                      return "This is a Scalene Triangle.";
                  }
           }

    
    
        public void compareTrinagles(Triangle OPJ56) 
        {
          int pdxw = sde19 + sde270 + sde334;
          
          if (this == OPJ56) 
          {
        
              System.out.println("These two triangle objects have the same address.");
          }
            
             else if (this.sde19 == OPJ56.sde19 && this.sde270 == OPJ56.sde270 && this.sde334 == OPJ56.sde334) 
             {
            
                System.out.println("Addresses are different but the sides of the triangles are equal.");
            } 
            
                else if (pdxw == OPJ56.sde19 + OPJ56.sde270 + OPJ56.sde334) 
                {
                  
                    System.out.println("Only the perimeter of both triangles is equal.");
                }
               
                   else 
                  {
            
                     System.out.println("Addresses, length of the sides, and perimeter all are different.");
                  } 
              
           
        }
}
    
           
           





                                                              Ans. to the Q. No.-06

    //Here is my Design Class:

  //1st Design:


public class Course 
{
    
     String crsNam;

    public Course(String xCrsN) 
    {
       
        this.crsNam = xCrsN;
    }

}



  //2nd Design:


public class Teacher 
{
    
    String NxB;
       String initilk9;
         String crsA17;
       String crsB21;
      String crsD38;
    int CrsCnt;

    
    public Teacher(String rt, String iny) 
    {
      
        this.NxB = rt;
          this.initilk9 = iny;
            this.CrsCnt = 0;
        
          System.out.println("A new teacher has been created");
    }

    
        public void addCourse(Course CRSX) 
        {
        
          if (CrsCnt < 3) 
          {
            
            if (CrsCnt == 0) 
            {
                
                crsA17 = CRSX.crsNam;
                  CrsCnt++;
            } 
            
               else if (CrsCnt == 1) 
               {
                 
                  crsB21 = CRSX.crsNam;
                    CrsCnt++;
               } 
               
                  else if (CrsCnt == 2) 
                  {
                
                     crsD38 = CRSX.crsNam;
                       CrsCnt++;
                  }
            
            } 
         }

    
          public void printDetail() 
          {            
        
            System.out.println("Name: " + NxB);
        
              System.out.println("Initial: " + initilk9);
        
                System.out.println("List of courses:");
        
                
                if (CrsCnt > 0) 
                {
            
                  System.out.println(crsA17);
                }
        
                   if (CrsCnt > 1) 
                   {
            
                     System.out.println(crsB21);
                   }
       
                     if (CrsCnt > 2) 
                     {
            
                       System.out.println(crsD38);
                     }
           }
}




                                                              Ans. to the Q. No.-07

   //Here is my Design Class:


  //1st Design:


public class BracuStudent 
{
  
    String Nam;
      String hm;
        
        boolean PassH;

    public BracuStudent(String nxt, String hyc) 
    {
      
        this.Nam = nxt;
          this.hm = hyc;
                        
    }

    
       public void getPass() 
       {
        
          this.PassH = true;
       }

    
         public void updateHome(String newHydt3) 
         {
        
             this.home = newHydt3;
         }

    
           public void showDetails() 
           {
        
             System.out.println("Student Name: " + Nam);
       
              System.out.println("Lives in " + hm);
        
                System.out.println("Have Bus Pass? " + PassH);
           }
}



   //2nd Design:



public class BracuBus 
{
    
      String rasta;    
        int mCpc;
          int PssCnt;
    
     BracuStudent[] psgn;

    
     public BracuBus(String rasta) 
     {
       
        this.rasta = rasta;
          this.mCpc = 2;
           this.PssCnt = 0;
        
           this.psgn = new BracuStudent[mCpc];
    }

    
        public BracuBus(String rst, int mCpc2) 
        {
          
           this.route = rst;
             this.mCpc = mCpc2;
              this.PssCnt = 0;
        
            this.psgn = new BracuStudent[mCpc2];
        }

    
           public void showDetails() 
           {
        
             System.out.println("Bus Route: " + rasta);
             
               System.out.println("Passenger Count: " + PssCnt + " (Max: " + mCpc + ")");
        
                  System.out.println("Passengers on Board: ");
        
                  
             for (int ijy = 0; ijy < PssCnt; ijy++) 
             {
            
                System.out.print(psgn[ijy].Nam + " ");
             }
        
             System.out.println();
           }

    
           public void board() 
           {
       
             System.out.println("No passengers");
           }

    


                                                              Ans. to the Q. No.-08

   //Here is my Design Class:


  //1st Design:


public class Student 
{
  
    String Nam;
      int IDSX;
        String DeptN;
          String Email;
        String PAsswrdd;
      boolean loginn;
    String[] advCrss;

    
    public Student(String nx, int idf, String deptr) 
    {
      
        this.Nam = nx;
          this.IDSX = idf;
            this.DeptN = deptr;
          this.Email = null;
        this.PAsswrdd = null;
         
            this.loginn = false;
        
          System.out.println("Student object is created");
    }
}




  //2nd Design:



public class Usis 
{
  
    int totalAdv;
      Student[] adv;

    public Usis() 
    {
        
      this.totalAdv = 0;
        this.adv = new Student[5];
        
         System.out.println("Usis is ready to use!");
    }

    
         public void login(Student stdnt) 
         {
        
           if (stdnt.Email == null || stdnt.PAsswrdd == null) 
           {
             
              System.out.println("Email and password need to be set.");
           } 
           
             else 
             {
           
                stdnt.loginn = true;
           
                 System.out.println("Login successful");
             }
          }

    
            public void advising(Student stdnt) 
            {
        
              if (!stdnt.loginn) 
              {
            
                System.out.println("Please login to advise courses!");
              } 
              
                else if (stdnt.advCrss == null) 
                {
            
                   System.out.println("You haven't selected any courses.");
                } 
                
                   else if (stdnt.advCrss.length > 3) 
                   {
            
                      System.out.println("You need special approval to take more than 3 courses.");
                   } 
                   
                      else 
                      {
            
                        adv[totalAdv] = stdnt;
            
                               totalAdv++;
            
                          System.out.println("Advising successful!");
                      }
               }

    



