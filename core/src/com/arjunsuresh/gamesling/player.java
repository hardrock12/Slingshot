package com.arjunsuresh.gamesling;

import com.nilunder.bdx.*;


public class player extends GameObject{

kavani k;
bottle[] bots;

 public void init()
 {

 
 
 }
 String bottle_str;
 String kavani_str;
 void setstonestring(String str){
 


 bots=new bottle[3];
 for(int i=1;i<=3;i++)
 {
 bots[i]=new bottle(scene.objects.get(str+i));
 bots[i].setplayer(this);
 
// ((bottle)scene.objects.get(str+i)).setplayer(this);
 }
 }
    public void main(){
    

    
     
         
         
           
    }
    public float score=0f;
    public void notify_collsion()
    {
    System.out.println("Scored");
    score+=10f;
    }
    
}
