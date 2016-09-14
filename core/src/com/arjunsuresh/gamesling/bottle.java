package com.arjunsuresh.gamesling;

import com.nilunder.bdx.*;


public class bottle extends GameObject  {
private int allset=-1;
 private player playee;
 private String name;
 GameObject bottleobj;

 bottle(GameObject obj)
 {
 bottleobj=obj;
 }
 public void setplayer(player p){
 playee=p;
 allset=0;
 }
 
    public void main(){
        if(allset==-1)
        {
        return;
        }
      if(bottleobj.hit())
      {
      playee.notify_collsion();
      }
            
         
         
           
    }
    
}
