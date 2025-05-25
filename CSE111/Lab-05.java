                                                        Ans. to the Q.No.-01


   // Here is my Design Class:



public class Song 
{
  
    String Title;
      String art;
        int lngt; 
     
     Song nxtS; 

    
    public Song(String Tjs, String artw, int l) 
    {
      
        this.Title = Tjs;
         this.art = artw;
          this.lngt = l;
            this.nxtS = null; 
    }

    
        public void songInfo() 
        {
                     
          System.out.println("Title: " + Title);
        
            System.out.println("Artist: " + art);
        
             System.out.println("Length: " + lngt + " minutes");
        }
}








                                                        Ans. to the Q.No.-02


   
   //Here is my Design Clas:
  //It will follow song class


public class Playlist 
{
    
     String Namx;

    
    public Playlist(String Sngnam) 
    {
      
        this.Namx = Sngnam;
        
           System.out.println(Namx + " created.");
    }
}





                                                        Ans. to the Q.No.-03 & 04


   
   //Here is my Design Clas:
  //It will follow song class




public class Playlist 
{
    
   String nam;
     Song frstSong; 

    
    public Playlist(String nameR) 
    {
        
       this.nam = nameR;
        this.frstSong = null; 
        
          System.out.println(nam + " created.");
    }

    
        public void addSong(Song song) 
        {
        
           if (frstSong == null) 
           {
            
              frstSong = song;
           } 
             
              else 
              {
            
                Song crnt = frstSong;
                
                 while (crnt.nxtS != null) 
                 {
                
                    crnt = crnt.nxtS;
                 }
            
                     crnt.nxtS = song;
               }
        
                System.out.println(song.Title + " added to " + nam + ".");
         }

    
    public void info() 
    {
        
         System.out.println(nam + " has the following songs:");
        
           if (frstSong == null) 
           {
            
              System.out.println("No songs in " + nam + ".");
           }   
             
              else 
              {
            
                  Song crnt = frstSong;
            
                      int cnt = 1;
            
                      while (crnt != null) 
                      {
                
                        System.out.println("Song-" + cnt);                
                         crnt.songInfo();
                             crnt = crnt.nxtS;
                
                               cnt++;
                      }
               }
    }
}







                                                        Ans. to the Q.No.-05


  
   //Here is my Design Clas:
  //It will follow song class




public class Playlist 
{
    
    String nam;
      Song frstSng; 

    
    public Playlist(String namQ) 
    {
        
        this.nam = namQ;
          this.frstSng = null; 
        
           System.out.println(nam + " created.");
    }

    
         public void addSong(Song song) 
         {
        
            if (frstSng == null) 
            {
              
               frstSng = song;
            } 
            
               else 
               {
            
                 Song crnt = frstSng;
           
                   while (crnt.nxtS != null) 
                   {
                
                      crnt = crnt.nxtS;
                   }
            
                       crnt.nxtS = song;
                }
        
               System.out.println(song.Title + " added to " + nam + ".");
         }

    
    public void addSong(Song song, int finding) 
    {
        
        if (finding == 0) 
        {
            
           song.nxtS = frstSng;
             frstSng = song;
            
               System.out.println(song.Title + " added to " + nam + ".");
        } 
        
            else 
            {
            
              Song crnt = frstSng;
                int crntfind = 0;
            
                while (crnt != null && crntfind < finding - 1) 
                {
                
                  crnt = crnt.nxtS;
                     crntfind++;
                }
            
                   if (crnt == null) 
                   {
                
                     System.out.println("Cannot add song to Index " + finding + ".");
                   } 
                   
                      else 
                      {
                
                        song.nxtS = crnt.nxtS;
                           crnt.nxtS = song;
                
                           System.out.println(song.Title + " added to " + nam + ".");
                      }
             }
    }

    
     public void info() 
     {
        
         System.out.println(nam + " has the following songs:");
        
            if (frstSng == null) 
            {
            
              System.out.println("No songs in " + nam + ".");
            } 
            
               else 
               {
            
                 Song crnt = frstSng;
                    int cnt = 1;
            
                    while (crnt != null) 
                    {
                
                      System.out.println("Song-" + cnt);
                        crnt.songInfo();
                
                           crnt = crnt.nxtS;
                       cnt++;
                    }
               }
      }
}







                                                        Ans. to the Q.No.-06


   
   //Here is my Design Clas:
  //It will follow song class



public class Playlist 
{
  
    String nam3;
      Song frstSng; 

    
    public Playlist(String name45) 
    {
      
        this.nam3 = name45;
          this.frstSng = null; 
        
          System.out.println(nam3 + " created.");
    }

    
         public void addSong(Song song) 
         {
        
           if (frstSng == null) 
           {
            
             frstSng = song;
           } 
             
              else 
              {
            
                Song crnt = frstSng;
            
                  while (crnt.nxtS != null) 
                  {
                
                     crnt = crnt.nxtS;
                  }
            
                       crnt.nxtS = song;
               }
        
                  System.out.println(song.Title + " added to " + nam3 + ".");
         }

    
      public void addSong(Song song, int yt) 
      {
        
           if (yt == 0) 
           {
            
             song.nxtS = frstSng;
               frstSng = song;
            
               System.out.println(song.Title + " added to " + nam3 + ".");
           } 
             
              else 
              {
            
                Song crnt = frstSng;
            
                  int crntyt = 0;
            
                    while (crnt != null && crntyt < yt - 1) 
                    {
                
                        crnt = crnt.nxtS;
                          crntyt++;
                    }
            
                      if (crnt == null) 
                      {
                
                        System.out.println("Cannot add song to Index " + yt + ".");
                      } 
                       
                         else 
                         {
                
                           song.nxtS = crnt.nxtS;
                             crnt.nxtS = song;
                
                              System.out.println(song.Title + " added to " + nam3 + ".");
                         }
          }
    }

    
     public void playSong(String title) 
     {
       
        Song crnt = frstSng;
        
          while (crnt != null) 
          {
            
              if (crnt.Title.equals(title)) 
              {
                 
                 System.out.println("Playing " + crnt.Title + " by " + crnt.art + ".");
                  return;
              }
            
                 crnt = crnt.nxtS;
          }
        
             System.out.println(title + " not found in playlist " + nam3 + ".");
      }

    
     
    public void info() 
    {
      
        System.out.println(nam3 + " has the following songs:");
        
           if (frstSng == null) 
           {
             
             System.out.println("No songs in " + nam3 + ".");
           } 
           
              else 
              {
            
                Song crnt = frstSng;
                  int cnt = 1;
            
                   while (crnt != null) 
                   {
                     
                     System.out.println("Song-" + cnt);
                       crnt.songInfo();
                         crnt = crnt.nxtS;
                   
                           cnt++;
                   }
              }
     }
}







                                                        Ans. to the Q.No.-07


   
   //Here is my Design Clas:
  //It will follow song class



public class Playlist 
{
  
    String nam3;
      Song frstSng; 

    
    public Playlist(String name45) 
    {
      
        this.nam3 = name45;
          this.frstSng = null; 
        
          System.out.println(nam3 + " created.");
    }

    
         public void addSong(Song song) 
         {
        
           if (frstSng == null) 
           {
            
             frstSng = song;
           } 
             
              else 
              {
            
                Song crnt = frstSng;
            
                  while (crnt.nxtS != null) 
                  {
                
                     crnt = crnt.nxtS;
                  }
            
                       crnt.nxtS = song;
               }
        
                  System.out.println(song.Title + " added to " + nam3 + ".");
         }

    
      public void addSong(Song song, int yt) 
      {
        
           if (yt == 0) 
           {
            
             song.nxtS = frstSng;
               frstSng = song;
            
               System.out.println(song.Title + " added to " + nam3 + ".");
           } 
             
              else 
              {
            
                Song crnt = frstSng;
            
                  int crntyt = 0;
            
                    while (crnt != null && crntyt < yt - 1) 
                    {
                
                        crnt = crnt.nxtS;
                          crntyt++;
                    }
            
                      if (crnt == null) 
                      {
                
                        System.out.println("Cannot add song to Index " + yt + ".");
                      } 
                       
                         else 
                         {
                
                           song.nxtS = crnt.nxtS;
                             crnt.nxtS = song;
                
                              System.out.println(song.Title + " added to " + nam3 + ".");
                         }
          }
    }

    
     public void playSong(String title) 
     {
       
        Song crnt = frstSng;
        
          while (crnt != null) 
          {
            
              if (crnt.Title.equals(title)) 
              {
                 
                 System.out.println("Playing " + crnt.Title + " by " + crnt.art + ".");
                  return;
              }
            
                 crnt = crnt.nxtS;
          }
        
             System.out.println(title + " not found in playlist " + nam3 + ".");
      }

    
      public void playSong(int yt) 
      {
        
        Song crnt = frstSng; 
          int crntyt = 0;
          
           while (crnt != null) 
           {
             
             if (crntyt == yt) 
             {
               
                System.out.println("Playing " + crnt.Title + " by " + crnt.art + ".");
                 return;
             }
             
                crnt = crnt.nxtS; 
                  crntyt++;
                  
           }
           
               System.out.println("Song at Index " + yt + " not found in playlist " + nam3 + ".");
                   
      }
     
     
        
    public void info() 
    {
      
        System.out.println(nam3 + " has the following songs:");
        
           if (frstSng == null) 
           {
             
             System.out.println("No songs in " + nam3 + ".");
           } 
           
              else 
              {
            
                Song crnt = frstSng;
                  int cnt = 1;
            
                   while (crnt != null) 
                   {
                     
                     System.out.println("Song-" + cnt);
                       crnt.songInfo();
                         crnt = crnt.nxtS;
                   
                           cnt++;
                   }
              }
     }
}






                                                        Ans. to the Q.No.-08


   
   //Here is my Design Clas:
  //It will follow song class



public class Playlist 
{
  
    String nam3;
      Song frstSng; 

    
    public Playlist(String name45) 
    {
      
        this.nam3 = name45;
          this.frstSng = null; 
        
          System.out.println(nam3 + " created.");
    }

    
         public void addSong(Song song) 
         {
        
           if (frstSng == null) 
           {
            
             frstSng = song;
           } 
             
              else 
              {
            
                Song crnt = frstSng;
            
                  while (crnt.nxtS != null) 
                  {
                
                     crnt = crnt.nxtS;
                  }
            
                       crnt.nxtS = song;
               }
        
                  System.out.println(song.Title + " added to " + nam3 + ".");
         }

    
      public void addSong(Song song, int yt) 
      {
        
           if (yt == 0) 
           {
            
             song.nxtS = frstSng;
               frstSng = song;
            
               System.out.println(song.Title + " added to " + nam3 + ".");
           } 
             
              else 
              {
            
                Song crnt = frstSng;
            
                  int crntyt = 0;
            
                    while (crnt != null && crntyt < yt - 1) 
                    {
                
                        crnt = crnt.nxtS;
                          crntyt++;
                    }
            
                      if (crnt == null) 
                      {
                
                        System.out.println("Cannot add song to Index " + yt + ".");
                      } 
                       
                         else 
                         {
                
                           song.nxtS = crnt.nxtS;
                             crnt.nxtS = song;
                
                              System.out.println(song.Title + " added to " + nam3 + ".");
                         }
          }
    }

    
     public void playSong(String title) 
     {
       
        Song crnt = frstSng;
        
          while (crnt != null) 
          {
            
              if (crnt.Title.equals(title)) 
              {
                 
                 System.out.println("Playing " + crnt.Title + " by " + crnt.art + ".");
                  return;
              }
            
                 crnt = crnt.nxtS;
          }
        
             System.out.println(title + " not found in playlist " + nam3 + ".");
      }

    
      public void playSong(int yt) 
      {
        
        Song crnt = frstSng; 
          int crntyt = 0;
          
           while (crnt != null) 
           {
             
             if (crntyt == yt) 
             {
               
                System.out.println("Playing " + crnt.Title + " by " + crnt.art + ".");
                 return;
             }
             
                crnt = crnt.nxtS; 
                  crntyt++;
                  
           }
           
               System.out.println("Song at Index " + yt + " not found in playlist " + nam3 + ".");
                   
      }
     
     
      public void deleteSong(String title) 
      {
        
        if (frstSng == null) 
        {
          
           System.out.println(title + " not found in " + nam3 + ".");
             return;
        }
        
          if (frstSng.Title.equals(title)) 
          {
            
            frstSng = frstSng.nxtS;
            
              System.out.println(title + " deleted from " + nam3 + ".");
               return;
          }
          
             Song crnt = frstSng;
             
               while (crnt.nxtS != null && !crnt.nxtS.Title.equals(title)) 
               {
                 
                 crnt = crnt.nxtS;
               }
               
                 if (crnt.nxtS == null) 
                 {
                   
                   System.out.println(title + " not found in " + nam3 + ".");
                 }
                 
                   else
                   {
                     
                      crnt.nxtS = crnt.nxtS.nxtS;
                      
                       System.out.println(title + " deleted from " + nam3 + ".");
                   }
      }
      
            
    public void info() 
    {
      
        System.out.println(nam3 + " has the following songs:");
        
           if (frstSng == null) 
           {
             
             System.out.println("No songs in " + nam3 + ".");
           } 
           
              else 
              {
            
                Song crnt = frstSng;
                  int cnt = 1;
            
                   while (crnt != null) 
                   {
                     
                     System.out.println("Song-" + cnt);
                       crnt.songInfo();
                         crnt = crnt.nxtS;
                   
                           cnt++;
                   }
              }
     }
}








                                                        Ans. to the Q.No.-09


   
   //Here is my Design Clas:
  //It will follow song class




public class Playlist 
{
  
    String name;
      Song frstSng; 

    
    public Playlist(String name45) 
    {
      
        this.name = name45;
          this.frstSng = null; 
        
          System.out.println(name + " created.");
    }

    
         public void addSong(Song song) 
         {
        
           if (frstSng == null) 
           {
            
             frstSng = song;
           } 
             
              else 
              {
            
                Song crnt = frstSng;
            
                  while (crnt.nxtS != null) 
                  {
                
                     crnt = crnt.nxtS;
                  }
            
                       crnt.nxtS = song;
               }
        
                  System.out.println(song.Title + " added to " + name + ".");
         }

    
      public void addSong(Song song, int yt) 
      {
        
           if (yt == 0) 
           {
            
             song.nxtS = frstSng;
               frstSng = song;
            
               System.out.println(song.Title + " added to " + name + ".");
           } 
             
              else 
              {
            
                Song crnt = frstSng;
            
                  int crntyt = 0;
            
                    while (crnt != null && crntyt < yt - 1) 
                    {
                
                        crnt = crnt.nxtS;
                          crntyt++;
                    }
            
                      if (crnt == null) 
                      {
                
                        System.out.println("Cannot add song to Index " + yt + ".");
                      } 
                       
                         else 
                         {
                
                           song.nxtS = crnt.nxtS;
                             crnt.nxtS = song;
                
                              System.out.println(song.Title + " added to " + name + ".");
                         }
          }
    }

    
     public void playSong(String title) 
     {
       
        Song crnt = frstSng;
        
          while (crnt != null) 
          {
            
              if (crnt.Title.equals(title)) 
              {
                 
                 System.out.println("Playing " + crnt.Title + " by " + crnt.art + ".");
                  return;
              }
            
                 crnt = crnt.nxtS;
          }
        
             System.out.println(title + " not found in playlist " + name + ".");
      }

    
      public void playSong(int yt) 
      {
        
        Song crnt = frstSng; 
          int crntyt = 0;
          
           while (crnt != null) 
           {
             
             if (crntyt == yt) 
             {
               
                System.out.println("Playing " + crnt.Title + " by " + crnt.art + ".");
                 return;
             }
             
                crnt = crnt.nxtS; 
                  crntyt++;
                  
           }
           
               System.out.println("Song at Index " + yt + " not found in playlist " + name + ".");
                   
      }
     
     
      public void deleteSong(String title) 
      {
        
        if (frstSng == null) 
        {
          
           System.out.println(title + " not found in " + name + ".");
             return;
        }
        
          if (frstSng.Title.equals(title)) 
          {
            
            frstSng = frstSng.nxtS;
            
              System.out.println(title + " deleted from " + name + ".");
               return;
          }
          
             Song crnt = frstSng;
             
               while (crnt.nxtS != null && !crnt.nxtS.Title.equals(title)) 
               {
                 
                 crnt = crnt.nxtS;
               }
               
                 if (crnt.nxtS == null) 
                 {
                   
                   System.out.println(title + " not found in " + name + ".");
                 }
                 
                   else
                   {
                     
                      crnt.nxtS = crnt.nxtS.nxtS;
                      
                       System.out.println(title + " deleted from " + name + ".");
                   }
      }
      
      
      public int totalSong() 
      {
        
         int cnt = 0;
        Song crnt = frstSng;
        
         while (crnt != null) 
         {
           
           cnt++;
            crnt = crnt.nxtS;
         }
           
            return cnt;
      }
      
            
    public void info() 
    {
      
        System.out.println(name + " has the following songs:");
        
           if (frstSng == null) 
           {
             
             System.out.println("No songs in " + name + ".");
           } 
           
              else 
              {
            
                Song crnt = frstSng;
                  int cnt = 1;
            
                   while (crnt != null) 
                   {
                     
                     System.out.println("Song-" + cnt);
                       crnt.songInfo();
                         crnt = crnt.nxtS;
                   
                           cnt++;
                   }
              }
     }
}




                                                        Ans. to the Q.No.-10


   
   //Here is my Design Clas:
  //It will follow song class




public class Playlist 
{
  
    String name;
      Song frstSng; 

    
    public Playlist(String name45) 
    {
      
        this.name = name45;
          this.frstSng = null; 
        
          System.out.println(name + " created.");
    }

    
         public void addSong(Song song) 
         {
        
           if (frstSng == null) 
           {
            
             frstSng = song;
           } 
             
              else 
              {
            
                Song crnt = frstSng;
            
                  while (crnt.nxtS != null) 
                  {
                
                     crnt = crnt.nxtS;
                  }
            
                       crnt.nxtS = song;
               }
        
                  System.out.println(song.Title + " added to " + name + ".");
         }

    
      public void addSong(Song song, int yt) 
      {
        
           if (yt == 0) 
           {
            
             song.nxtS = frstSng;
               frstSng = song;
            
               System.out.println(song.Title + " added to " + name + ".");
           } 
             
              else 
              {
            
                Song crnt = frstSng;
            
                  int crntyt = 0;
            
                    while (crnt != null && crntyt < yt - 1) 
                    {
                
                        crnt = crnt.nxtS;
                          crntyt++;
                    }
            
                      if (crnt == null) 
                      {
                
                        System.out.println("Cannot add song to Index " + yt + ".");
                      } 
                       
                         else 
                         {
                
                           song.nxtS = crnt.nxtS;
                             crnt.nxtS = song;
                
                              System.out.println(song.Title + " added to " + name + ".");
                         }
          }
    }

    
     public void playSong(String title) 
     {
       
        Song crnt = frstSng;
        
          while (crnt != null) 
          {
            
              if (crnt.Title.equals(title)) 
              {
                 
                 System.out.println("Playing " + crnt.Title + " by " + crnt.art + ".");
                  return;
              }
            
                 crnt = crnt.nxtS;
          }
        
             System.out.println(title + " not found in playlist " + name + ".");
      }

    
      public void playSong(int yt) 
      {
        
        Song crnt = frstSng; 
          int crntyt = 0;
          
           while (crnt != null) 
           {
             
             if (crntyt == yt) 
             {
               
                System.out.println("Playing " + crnt.Title + " by " + crnt.art + ".");
                 return;
             }
             
                crnt = crnt.nxtS; 
                  crntyt++;
                  
           }
           
               System.out.println("Song at Index " + yt + " not found in playlist " + name + ".");
                   
      }
     
     
      public void deleteSong(String title) 
      {
        
        if (frstSng == null) 
        {
          
           System.out.println(title + " not found in " + name + ".");
             return;
        }
        
          if (frstSng.Title.equals(title)) 
          {
            
            frstSng = frstSng.nxtS;
            
              System.out.println(title + " deleted from " + name + ".");
               return;
          }
          
             Song crnt = frstSng;
             
               while (crnt.nxtS != null && !crnt.nxtS.Title.equals(title)) 
               {
                 
                 crnt = crnt.nxtS;
               }
               
                 if (crnt.nxtS == null) 
                 {
                   
                   System.out.println(title + " not found in " + name + ".");
                 }
                 
                   else
                   {
                     
                      crnt.nxtS = crnt.nxtS.nxtS;
                      
                       System.out.println(title + " deleted from " + name + ".");
                   }
      }
      
      
      public int totalSong() 
      {
        
         int cnt = 0;
        Song crnt = frstSng;
        
         while (crnt != null) 
         {
           
           cnt++;
            crnt = crnt.nxtS;
         }
           
            return cnt;
      }
      
  
      
      void merge(Playlist gwPlaylist) 
      {
      
         if (gwPlaylist.frstSng == null) 
         {
           
           System.out.println("No songs to merge from " + gwPlaylist.name + ".");
           return;
         }
         
           
            if (frstSng == null) 
            {
              
               frstSng = gwPlaylist.frstSng;
            }
            
               else
               {
                 
                  Song crnt = frstSng;
                  
                   while (crnt.nxtS != null) 
                   {
                      
                      crnt = crnt.nxtS;
                   }
                 
                     crnt.nxtS = gwPlaylist.frstSng;
               }
               
                 System.out.println("Merge Completed!");
      }
      
      
    public void info() 
    {
      
        System.out.println(name + " has the following songs:");
        
           if (frstSng == null) 
           {
             
             System.out.println("No songs in " + name + ".");
           } 
           
              else 
              {
            
                Song crnt = frstSng;
                  int cnt = 1;
            
                   while (crnt != null) 
                   {
                     
                     System.out.println("Song-" + cnt);
                       crnt.songInfo();
                         crnt = crnt.nxtS;
                   
                           cnt++;
                   }
              }
     }
}




                                                        