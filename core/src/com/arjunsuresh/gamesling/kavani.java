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
int stone_rem=3;
Matrix3f cameraprev;
    Vector3f camerapos;
GameObject[] stones;

    int i=0;
 public void init()
 {
 

 cx=position().x;
 cy=position().y;
 swidth=new Bdx.Display().width();
 
 sheight=new Bdx.Display().height();
allset=-1;

 
 
 }
 public void shot()
 { Vector3f vec=target.position();
    Vector3f vec2=stone.position();
    vec.sub(vec2);
    Vector3f vec3=vec.mul(80);
   stone.bodyType("RIGID_BODY");
    stone.applyForce(vec3);
    allset=0;
   // stone.bodyType("STATIC");
 
 
 
 
 }
 GameObject camerastr;
  public  void setStone(String kavanistr,String  stonestr,String target,String camera)
    {
    camerastr=scene.objects.get(camera);
    
    stone=scene.objects.get(stonestr);  
   this.target=scene.objects.get(target);
    allset=0;
    
    }
    private player pthis;
    void setPlayer(player p)
   
    {
    pthis=p;
    }
    public void main(){
    
    if(allset==-1){return;}
    if(kavani!=null&&kavani.up())
    {kavani=null;i=0;
    
    }
    if(allset==3)
    {
//((Text)scene.objects.get("debu")).text(" "+stone.position().y);
    if(stone.position().y>28f||stone.position().x>15f||stone.position().z>17f||stone.position().x<-15f||stone.position().z<-4f||stone.position().y<-5f||stone.velocity().length()<0.5f)
    {
    if(stone_rem==0)
    {
     pthis.gameover();
     allset=0;
     return;
    
    }
    camerastr.position(camerapos);
    camerastr.orientation(cameraprev);
   // camerastr.orientation(Playbtn.ori);
    stone.velocity(new Vector3f(0,0,0));
    
    stone.angularVelocity(new Vector3f(0,0,0));
    stone.bodyType("STATIC");
     
    allset=0;
    }
    else{
    
    return;
    
    }
    }
   
    if(Bdx.fingers.size()==2)
    {
    Finger figk=Bdx.fingers.get(0);
    Finger figs=Bdx.fingers.get(1);
    float newx=(cx+(figk.position().x-swidth/2-15)/100);
    float newy=cy+(figk.position().y/110);
    float snewy=newy-4.5f;
    float snewz=(figs.position().y)/110;
    float snewx=-(swidth/2-figs.position().x)/100;
    position(newx,newy,position().z); 
    stone.position(snewx,/*snewy>=newy?newy-3:((snewy<newy-6)?newy-6:*/snewy,snewz);  
    allset=1;
    }
    else if(Bdx.fingers.size()==1)
        { if(allset==1){allset=2;}
        Finger figs=Bdx.fingers.get(0);
    position((cx+(figs.position().x-swidth/2)/100),cy+(figs.position().y/100),position().z); 
 
    
    }
    
    if(allset==2)
    {
    camerapos=camerastr.position();
    cameraprev=camerastr.orientation();
    camerastr.position(Playbtn.pos);
    camerastr.orientation(Playbtn.ori);
    shot();
       stone_rem--;
       /*if(stone_rem==0)
       {
      
       allset=3;
       return ;
       }*/
       allset=3;
//  stone=stones[stone_rem-1];
    }
    
    
       /*if(Bdx.mouse.btnHit("left"))
       { System.out.println(String.valueOf(Bdx.mouse.positionNormalized().x)+" "+String.valueOf(Bdx.mouse.position().y));
       position((cx+(Bdx.mouse.position().x-swidth/2)/100),cy+(Bdx.mouse.position().y/100),position().z);      
       }
         */   
            
         
         
           
    }
    public int rem_stones()
    {
    
    return stone_rem;
    
    }
   


 
    
}
