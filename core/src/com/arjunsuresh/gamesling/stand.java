package com.arjunsuresh.gamesling;

import com.nilunder.bdx.*;
import javax.vecmath.*;


public class stand extends GameObject{
 public void init()
 {
maxy=scene.objects.get("maxn").position().z;
miny=scene.objects.get("minn").position().z;
 
 }
float maxy,miny;
float yinc=0.15f;




    public void main(){
    
if(position().z>=maxy||position().z<=miny)
{
yinc*=-1;

}       
position(new Vector3f(position().x,position().y,yinc+position().z));
 
      
            
         
         
           
    }
    
}
