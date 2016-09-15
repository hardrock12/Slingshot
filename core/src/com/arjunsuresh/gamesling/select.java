package com.arjunsuresh.gamesling;

import com.nilunder.bdx.*;
import com.nilunder.bdx.inputs.*;


public class select extends GameObject{
 public void init()
 {

 
 }
    public void main(){
        
      if(Bdx.fingers.size()==1)
        {
     
        Finger f=Bdx.fingers.get(0);
        RayHit rh =f.ray();
        if(rh!=null){
        if(rh.object==scene.objects.get("easy"))
      {  
         Bdx.sounds.get("menuselect").play();
       // ((debug) scene.objects.get("debug")).text("hit play");
       scene.objects.get("loading2").position(scene.objects.get("loadingmarker1").position());
        Bdx.scenes.set(0,"Level1");
        
        }
         else  if(rh.object==scene.objects.get("medium"))
      {  
       Bdx.sounds.get("menuselect").play();
              
              scene.objects.get("loading2").position(scene.objects.get("loadingmarker1").position());
              Bdx.scenes.set(0,"Level2");
        }  else if(rh.object==scene.objects.get("hard"))
      {  
       Bdx.sounds.get("menuselect").play();
       
       scene.objects.get("loading2").position(scene.objects.get("loadingmarker1").position());
       Bdx.scenes.set(0,"Level3");
        }
           }
    }
    
}}
