package com.arjunsuresh.gamesling.inst;

import com.badlogic.gdx.utils.JsonValue;
import com.nilunder.bdx.Instantiator;import com.nilunder.bdx.GameObject;
import com.arjunsuresh.gamesling.*;
public class igameover extends Instantiator {

	public GameObject newObject(JsonValue gobj){
		String name = gobj.name;

		if (gobj.get("class").asString().equals("gameoverscene"))
			return new com.arjunsuresh.gamesling.gameoverscene();

		return super.newObject(gobj);
	}
	
}
