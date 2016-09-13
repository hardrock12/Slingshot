package com.arjunsuresh.gamesling.inst;

import com.badlogic.gdx.utils.JsonValue;
import com.nilunder.bdx.Instantiator;import com.nilunder.bdx.GameObject;
import com.arjunsuresh.gamesling.*;
public class iLevel1 extends Instantiator {

	public GameObject newObject(JsonValue gobj){
		String name = gobj.name;

		if (gobj.get("class").asString().equals("kavani"))
			return new com.arjunsuresh.gamesling.kavani();
		if (gobj.get("class").asString().equals("Platform"))
			return new com.arjunsuresh.gamesling.Platform();
		if (gobj.get("class").asString().equals("stone"))
			return new com.arjunsuresh.gamesling.stone();

		return super.newObject(gobj);
	}
	
}
