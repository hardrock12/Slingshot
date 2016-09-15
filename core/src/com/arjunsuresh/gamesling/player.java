package com.arjunsuresh.gamesling;

import com.nilunder.bdx.*;
import javax.vecmath.*;


public class player extends GameObject{

kavani k;
GameObject[] bots;

 public void init()
 {

 
 
 }
 String bottle_str;
 String kavani_str;
 String levelname;
String scoretxt;

 void setstonestring(String str,String bo,String stonestr,String level,String sco){
 scoretxt=sco;

 levelname=level;
((Text) scene.objects.get(scoretxt)).text("Score:00000");


bots=new GameObject[3];
 for(int i=1;i<=3;i++)
 {
 bots[i-1]=scene.objects.get(str+i);
 }
 
 ((bottle)scene.objects.get(bo)).setplayer(this,bots,stonestr);
 
 
 }
 int time=0;
 int tick=0;
    public void main(){
    tick++;
    if(tick==10)
    {
    tick=0;
    time++;
    }

    
     
         
         
           
    }
    public float score=0f;
    public void gameover()
    {
    
    gameoverscene.score=String.valueOf(score);
    gameoverscene.level=levelname;
    Bdx.scenes.set(0,"gameover");
    
    }
    public void notify_collsion()
    {
    //((Text)scene.objects.get("debu")).position(new Vector3f(0,5,0));
    //((Text)scene.objects.get("debu")).text("Scored");
    
    score+=(1000f/time);
    time=0;
    ((Text)scene.objects.get(scoretxt)).text(String.valueOf("Score:"+score));
    }
    
}
