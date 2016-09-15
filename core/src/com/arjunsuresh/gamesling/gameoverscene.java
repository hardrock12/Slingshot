package com.arjunsuresh.gamesling;

import com.nilunder.bdx.*;
import com.nilunder.bdx.inputs.*;
import javax.vecmath.*;




public class gameoverscene extends GameObject{
public static String score;
public static String level;
GameObject replay,menu;

 public void init()
 {
((Text)scene.objects.get("scotxt")).text("SCORE:"+score);
replay=scene.objects.get("menu1") ;
menu=scene.objects.get("menu2");

 }
 
    public void main(){
           if(Bdx.fingers.size()>0)
        {
     
       
        RayHit rh =Bdx.fingers.get(0).ray();
        
        if(rh!=null){
        if(rh.object==replay)
      {   Bdx.sounds.get("menuselect").play();
     
        
   Bdx.scenes.set(0,level).end();
        
   
        }
         else  if(rh.object==menu)
      {  
       Bdx.sounds.get("menuselect").play();
       Bdx.scenes.set(0,"Levels");
        } 
           }
    }
         
           
    }
    
}
