                                                                  Ans. to the Q. No.-01




import java.util.Scanner;
public class Task_OddPosi 
{
   public static void main(String[] args) 
   {
       Scanner rd = new Scanner(System.in);
      
       int maxim = 0;
       int minim = 0;
       int cnt = 0;
       int summ = 0;
       
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println("Enter the Numbers: ");
            int nhc = rd.nextInt();

            if (nhc > 0 && nhc % 2 != 0) 
            {
                summ += nhc;
                cnt++;

                if (nhc > maxim) 
                {
                   maxim = nhc;
                }
                 
                  if (nhc < maxim) 
                  {
                    minim = nhc;
                  }
            }
        }

        if (cnt == 0) 
        {
          System.out.println("No Positive Odd Numbers Found");  
        }
        else
        {
          double avrg = (double) summ / cnt;
          
            System.out.println("The Sum of the Numbers is: " + summ);
            System.out.println("The Minimum Number is: " + minim);
            System.out.println("The Maximum Number is: " + maxim);
            System.out.println("The Average of the Numbers is: " + avrg);
        } 

        rd.close();
    }
}
                                                  






                                                              Ans. to the Q. No.-02



import java.util.Scanner;
public class Task_PrimeNum
{
   public static void main(String[] args) 
   {     
       Scanner ey = new Scanner(System.in);
       System.out.println("Enter the Starting Point: ");
       int frn = ey.nextInt();
       System.out.println("Enter the End Point: ");
       int eng = ey.nextInt();
       
       int s1 = 0;
       int e1 = 0;
        
       if(frn < 0 || eng < 0)
       {
         System.out.println("Invalid Input");
       }
         
         if (frn < eng) 
         {
            s1 = frn;
            e1 = eng;
         } 
         else 
         {
            s1 = eng;
            e1 = frn;
         }
            
        int PrimeCnt = 0;
       
          for (int i = s1; i <= e1; i++) 
          {
            
            if (i > 1) 
            {
                boolean Pr = true; 
               
                 for (int j = 2; j * j <= i; j++) 
                 {
                    
                    if (i % j == 0) 
                    {
                        Pr = false;
                        break;
                    }
                 }
                 
                       if(Pr == true)
                       { 
                       PrimeCnt++;
                       }                                   
             }                             
          }
                
        System.out.println("There are " + PrimeCnt + " prime numbers between " + s1 + " and " + e1 + ".");

        ey.close();
    }
}








                                                                  Ans.to the Q. No.-03




import java.util.Scanner;
public class Task_StrConcSum 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first string: ");
      String sqw1 = sc.nextLine();
      System.out.println("Enter the second string: ");
      String sqw2 = sc.nextLine();
      String conc = sqw1 + " " + sqw2;     
      int summ = 0;

        for (int k = 0; k < conc.length(); k++)               
        {
           summ += conc.charAt(k);
        }
         System.out.println(conc);
         System.out.println(summ);
          sc.close();
    }
}








                                                                   Ans.to the Q. No.-04




import java.util.Scanner;
public class Task_PrevAlpha
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String inp = sc.nextLine();
      String rs = "";
        
        for (int j = 0; j < inp.length(); j++) 
        {
           
           char chc = inp.charAt(j);                   
            
            if (chc == 'a') 
            {
               rs += 'z';  
            } 
            else 
            {
              rs += (char)(chc - 1);  
            }
        }
        System.out.println("After Transforming" + "," + "The New String is: " + rs);        
         sc.close();
    }
}







                                                                    Ans. to the Q. No.-05




import java.util.Scanner;
public class Task_InP_ArrxReverse 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);        
      System.out.println("Enter the length of the array: ");
      int lng = sc.nextInt();
      
      int[] arrx = new int[lng];
      System.out.println("Enter the elements of the array:");
        
        for (int i = 0; i < lng; i++) 
        {
          arrx[i] = sc.nextInt();
        }
         
          int j = lng - 1;

           for (int a = 0; a < lng / 2; a++) 
           {         
             int tem = arrx[a];
             arrx[a] = arrx[j];
             arrx[j] = tem;
              j--;
           }

         System.out.println("After Reversing" + ", " + "The new array is: ");
           
            for (int k = 0; k < lng; k++) 
            {
              System.out.print(arrx[k] + " ");
            }
            
            sc.close();
    }
}





                                                                    Ans.to the Q. No.-06




import java.util.Scanner;
public class Task_NumFrq 
{
   public static void main(String[] args) 
   {
      Scanner hcd = new Scanner(System.in);        
      System.out.println("Enter the number of elements: ");
      int N = hcd.nextInt();        
        
      int [] arrx1 = new int [N];               
      System.out.println("Enter the " + N + " numbers:");
        
        for (int i = 0; i < N; i++) 
        {
          arrx1 [i] = hcd.nextInt();
        }
        
          for (int i = 0; i < N; i++) 
          {
            int cnt = 1; 
            
             for (int j = 0; j < i; j++) 
             {
               
                if (arrx1 [i] == arrx1 [j]) 
                {
                    cnt = 0;  
                    
                    break;
                }
             }

             
              if (cnt != 0) 
              {
                
                for (int k = i + 1; k < N; k++) 
                 {
                    
                   if (arrx1 [i] == arrx1 [k]) 
                    {
                       cnt++;
                    }
                }
                
              System.out.println(arrx1[i] + " - " + cnt + " times");
            }
        }       
         hcd.close();
    }
}






                                                                  Ans.to the Q. No.-07




import java.util.Scanner;
public class Task_RMVdupli 
{
   public static void main(String[] args) 
   {
      Scanner sw = new Scanner(System.in);
      System.out.println("Enter the length of the array: ");
      int N = sw.nextInt();
        
        double[] arr24 = new double[N];
        System.out.println("Please enter the elements of the array:");
        
          for (int i = 0; i < N; i++) 
          {
            arr24 [i] = sw.nextDouble();
          }

        double [] arrx25 = new double[N];  
        int j = 0;  
        int rmv = 0;   
       
        double prv = arr24[0];                  
        arrx25 [j] = prv;
          j++;
 
        for (int i = 1; i < N; i++) 
        {
            
            if (arr24 [i] != prv) 
            {
                arrx25 [j] = arr24[i];
                 j++;
                prv = arr24 [i];  
            } 
            
            else 
            {               
                rmv++;
            }
        }

        System.out.print("New Array: ");
        
          for (int i = 0; i < j; i++) 
          {
            System.out.print(arrx25 [i] + " ");
          }
       
        System.out.println();
        System.out.println("Removed elements: " + rmv);

        sw.close();
    }
}






                                                                         Ans. to the Q. No.-08




import java.util.Scanner;
public class Task_2DArrayFlat
{
   public static void main(String[] args) 
   {
        Scanner ax = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rws = ax.nextInt();
        System.out.println("Enter the number of columns: ");
        int clmn = ax.nextInt();

        int [][] arrx2Di = new int [rws][clmn];
        System.out.println("Enter the elements of the 2D array:");
        
          for (int i = 0; i < rws; i++) 
          {
            
             for (int j = 0; j < clmn; j++) 
             {
                arrx2Di [i][j] = ax.nextInt();
             }
          }

        System.out.println("2D Array:");
       
          for (int i = 0; i < rws; i++) 
          {
             
             for (int j = 0; j < clmn; j++) 
             {
                System.out.print(arrx2Di [i][j] + " ");
             }
            System.out.println(); 
          }

        
        int[] arrx1D = new int [rws * clmn];
        int track = 0; 

           for (int i = 0; i < rws; i++) 
           {
             
              for (int j = 0; j < clmn; j++) 
              {
                arrx1D[track] = arrx2Di [i][j];
                track++;
            }
        }

        
        System.out.println("1D Array:");
        
          for (int i = 0; i < arrx1D.length; i++) 
          {
            System.out.print(arrx1D [i] + " ");
          }

         ax.close();
    }
}





                                                                      Ans. to the Q. No.-09




import java.util.Scanner;
public class Task_IdMtrx
{
   public static void main(String[] args) 
   {
        Scanner fc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix (N): ");
        int Nix = fc.nextInt();

        int [][] mtrx = new int [Nix][Nix];
        System.out.println("Enter the elements of the matrix:");
        
          for (int i = 0; i < Nix; i++) 
          {
            for (int j = 0; j < Nix; j++) 
            {
                mtrx [i][j] = fc.nextInt();
            }
        }

        boolean Id = true;  
        boolean noId = false; 

          for (int i = 0; i < Nix; i++) 
          {
            
             for (int j = 0; j < Nix; j++) 
             {
                
                if (i == j) 
                {
                    if (mtrx [i][j] != 1) 
                    {
                        Id = false;  
                        noId = true;  
                        break;  
                    }
                }
                
                else 
                {
                    if (mtrx [i][j] != 0) 
                    {
                        noId = true;  
                        break;  
                    }
                }
            }          
        }

       
        if (Id == true && noId == false) 
        {
           System.out.println("Identity matrix");
        } 
        else 
        {
           System.out.println("Not an Identity matrix");
        }

        fc.close();
    }
}






                                                                 Ans. to the Q. No.-10




import java.util.Scanner;
public class Task_Treasure
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int [][] arr2Dgrd = {{0, 0, 10, 0, -1},
                      {0, -1, 0, 0, -1},
                      {-1, 0, -1, 0, 0},
                      {0, -1, 7, 0, -1},
                      {0, -1, 0, -1, 0}};
    int pos1 = 3;
    int pos2 =2;
    int moves = 5;
    
    System.out.println("Initial Map:");
    
    for(i = 0; i < arr2Dgrd.length; i++){
    



