package com.arjunsuresh.gamesling;

import com.nilunder.bdx.*;
import com.nilunder.bdx.inputs.*;
import javax.vecmath.*;




public class Playbtn extends GameObject{
 public void init()
 {
Bdx.music.get("lantern").play();
 
 }
    public void main(){
    
    //  ((debug)scene.objects.get("debug")).text("0 fingers");
        if(Bdx.fingers.size()==1)
        {
      //((debug)scene.objects.get("debug")).text("hit");
        Finger f=Bdx.fingers.get(0);
        RayHit rh =f.ray();
        if(rh!=null&&rh.object==scene.objects.get("Playbtn"))
      {  
        Bdx.sounds.get("menuselect").play();
        //((debug) scene.objects.get("debug")).text("hit play");
        Bdx.scenes.set(0,"Levels");
        
        }
      
       }     
         
         
           
    }
    
}
