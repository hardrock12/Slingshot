package com.arjunsuresh.gamesling;

import com.nilunder.bdx.*;


public class bottle extends GameObject  {
private int allset=-1;
 private player playee;
 private String name;
 GameObject[] bottleobj;
private String stonename;
boolean[] hits=new boolean[3];
 public void setplayer(player p,GameObject[] obj,String stone){
 playee=p;
  bottleobj=obj;
 allset=0;
 stonename=stone;
 }
 
 
    public void main(){
        if(allset==-1)
        {
        return;
        }
        for(int i=0;i<3;i++)
        {
      if(hits[i]==false&&bottleobj[i].hit(stonename))
      {
      playee.notify_collsion();
      hits[i]=true;
      return;
      }
            
         }
         
           
    }
    
}
