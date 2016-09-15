package com.arjunsuresh.gamesling.inst;

import com.badlogic.gdx.utils.JsonValue;
import com.nilunder.bdx.Instantiator;import com.nilunder.bdx.GameObject;
import com.arjunsuresh.gamesling.*;
public class iLevel3 extends Instantiator {

	public GameObject newObject(JsonValue gobj){
		String name = gobj.name;

		if (gobj.get("class").asString().equals("player3"))
			return new com.arjunsuresh.gamesling.player3();
		if (gobj.get("class").asString().equals("stand1"))
			return new com.arjunsuresh.gamesling.stand1();
		if (gobj.get("class").asString().equals("bottlemanager1"))
			return new com.arjunsuresh.gamesling.bottlemanager1();
		if (gobj.get("class").asString().equals("kavani3"))
			return new com.arjunsuresh.gamesling.kavani3();

		return super.newObject(gobj);
	}
	
}
