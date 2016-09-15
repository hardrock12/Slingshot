package com.arjunsuresh.gamesling.inst;

import com.badlogic.gdx.utils.JsonValue;
import com.nilunder.bdx.Instantiator;import com.nilunder.bdx.GameObject;
import com.arjunsuresh.gamesling.*;
public class iLevel2 extends Instantiator {

	public GameObject newObject(JsonValue gobj){
		String name = gobj.name;

		if (gobj.get("class").asString().equals("stand"))
			return new com.arjunsuresh.gamesling.stand();
		if (gobj.get("class").asString().equals("kavani2"))
			return new com.arjunsuresh.gamesling.kavani2();
		if (gobj.get("class").asString().equals("player2"))
			return new com.arjunsuresh.gamesling.player2();
		if (gobj.get("class").asString().equals("bottlemanager"))
			return new com.arjunsuresh.gamesling.bottlemanager();

		return super.newObject(gobj);
	}
	
}
