package com.arjunsuresh.gamesling;

import com.nilunder.bdx.*;

public class Sacky extends GameObject{

    public void main(){
        if (Bdx.keyboard.keyHit("space"))
            applyForce(0, 200, 300);
          
    }
    
}
