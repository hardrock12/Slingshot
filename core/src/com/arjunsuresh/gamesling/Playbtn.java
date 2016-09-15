package com.arjunsuresh.gamesling;

import com.nilunder.bdx.*;
import com.nilunder.bdx.inputs.*;
import javax.vecmath.*;





public class Playbtn extends GameObject{
public static Scene prev;
public static Matrix3f ori;
public static Vector3f pos;
 public void init()
 {
com.badlogic.gdx.audio.Music  m=Bdx.music.get("lantern");
m.setLooping(true);
m.play();
ori=scene.objects.get("dummy").orientation();
pos=scene.objects.get("dummy").position();
 
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
        scene.objects.get("loading1").position(scene.objects.get("loadingmarker").position());
        //((debug) scene.objects.get("debug")).text("hit play");
Bdx.scenes.set(0,"Levels");

        
        
        }
      
       }     
         
         
           
    }
    
}
