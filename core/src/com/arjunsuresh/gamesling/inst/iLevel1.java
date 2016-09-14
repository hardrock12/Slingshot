package com.arjunsuresh.gamesling.inst;

import com.badlogic.gdx.utils.JsonValue;
import com.nilunder.bdx.Instantiator;import com.nilunder.bdx.GameObject;
import com.arjunsuresh.gamesling.*;
public class iLevel1 extends Instantiator {

	public GameObject newObject(JsonValue gobj){
		String name = gobj.name;

		if (gobj.get("class").asString().equals("Platform"))
			return new com.arjunsuresh.gamesling.Platform();
		if (gobj.get("class").asString().equals("kavani1"))
			return new com.arjunsuresh.gamesling.kavani1();

		return super.newObject(gobj);
	}
	
}
