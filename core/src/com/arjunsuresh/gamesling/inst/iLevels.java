package com.arjunsuresh.gamesling.inst;

import com.badlogic.gdx.utils.JsonValue;
import com.nilunder.bdx.Instantiator;import com.nilunder.bdx.GameObject;
import com.arjunsuresh.gamesling.*;
public class iLevels extends Instantiator {

	public GameObject newObject(JsonValue gobj){
		String name = gobj.name;

		if (gobj.get("class").asString().equals("select"))
			return new com.arjunsuresh.gamesling.select();

		return super.newObject(gobj);
	}
	
}
