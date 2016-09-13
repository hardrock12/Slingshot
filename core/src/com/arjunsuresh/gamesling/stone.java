package com.arjunsuresh.gamesling;

import com.nilunder.bdx.*;


public class stone extends GameObject{
 public void init()
 {
bodyType("STATIC");
 
 }
    public void main(){
        
      if(hit("bottle"))
      {
      bodyType("STATIC");
      
      }
            
         
         
           
    }
    
}
