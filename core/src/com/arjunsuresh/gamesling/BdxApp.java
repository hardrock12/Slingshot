package com.arjunsuresh.gamesling;

import java.util.*;

import com.badlogic.gdx.*;

import com.nilunder.bdx.*;

public class BdxApp implements ApplicationListener {

	@Override
	public void create(){
		Bdx.init();

		Scene.instantiators = new HashMap<String, Instantiator>();
		Scene.instantiators.put("Level1", new com.arjunsuresh.gamesling.inst.iLevel1());
		Scene.instantiators.put("Level2", null);

		Bdx.scenes.add(new Scene("Level2"));
		Bdx.firstScene = "Level2";
		
	}

	@Override
	public void dispose(){
		Bdx.dispose();
	}

	@Override
	public void render(){
		Bdx.main();
	}

	@Override
	public void resize(int width, int height){
		Bdx.resize(width, height);
	}

	@Override
	public void pause(){
	}

	@Override
	public void resume(){
	}
}
