package com.arjunsuresh.gamesling;

import com.nilunder.bdx.*;
import com.nilunder.bdx.inputs.*;
import javax.vecmath.*;

public class kavani extends GameObject{
private float cx=0;
private float cy=0;

GameObject stone,target;
Finger kavani;
Finger stonefig;
float swidth,sheight;
int allset=0;
int nstone;
int stone_rem=0;
GameObject[] stones;

    int i=0;
 public void init()
 {
 if (nstone==0){nstone=1;stone_rem=1;}
stones =new GameObject[nstone];
 cx=position().x;
 cy=position().y;
 swidth=new Bdx.Display().width();
 
 sheight=new Bdx.Display().height();
 stone=stones[stone_rem-1];
 target=scene.objects.get("settarget");
 
 /*if((target=scene.add("bottle"))==null)
 {
 
 System.out.println("error");
 }*/
 }
 public void shot()
 { Vector3f vec=target.position();
    Vector3f vec2=stone.position();
    vec.sub(vec2);
    Vector3f vec3=vec.mul(120);
   stone.bodyType("RIGID_BODY");
    stone.applyForce(vec3);
    allset=0;
   // stone.bodyType("STATIC");
 
 
 
 
 }
  public  void setStone(int nstone)
    {
    this.nstone=nstone;
    stone_rem=nstone;
    
    }
    public void main(){
    if(kavani!=null&&kavani.up())
    {kavani=null;
    i=0;
    
    
    }
   
    if(Bdx.fingers.size()==2)
    {
    Finger figk=Bdx.fingers.get(0);
    Finger figs=Bdx.fingers.get(1);
    float newx=(cx+(figk.position().x-swidth/2-15)/100);
    float newy=cy+(figk.position().y/110);
    float snewy=figs.position().y/70;
    float snewz=(figs.position().y)/110;
    float snewx=-(swidth/2-figs.position().x)/100;
    position(newx,newy,position().z); 
    stone.position(snewx,snewy>=newy?newy-3:(snewy<newy-6?newy-6:stone.position().y),snewz);  
    allset=1;
    }
    else if(Bdx.fingers.size()==1)
    { if(allset==1){allset=2;}
        Finger figs=Bdx.fingers.get(0);
    position((cx+(figs.position().x-swidth/2)/100),cy+(figs.position().y/100),position().z); 
 
    
    }
    if(allset==2)
    {
    
    shot();
       stone_rem--;
    stone=stones[stone_rem-1];
    }
    
    
       /*if(Bdx.mouse.btnHit("left"))
       { System.out.println(String.valueOf(Bdx.mouse.positionNormalized().x)+" "+String.valueOf(Bdx.mouse.position().y));
       position((cx+(Bdx.mouse.position().x-swidth/2)/100),cy+(Bdx.mouse.position().y/100),position().z);      
       }
         */   
            
         
         
           
    }
 
    
}
