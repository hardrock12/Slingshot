package com.arjunsuresh.gamesling;

import java.util.*;

import com.badlogic.gdx.*;

import com.nilunder.bdx.*;

public class BdxApp implements ApplicationListener {

	@Override
	public void create(){
		Bdx.init();

		Scene.instantiators = new HashMap<String, Instantiator>();
		Scene.instantiators.put("gameover", new com.arjunsuresh.gamesling.inst.igameover());
		Scene.instantiators.put("Level1", new com.arjunsuresh.gamesling.inst.iLevel1());
		Scene.instantiators.put("Level2", new com.arjunsuresh.gamesling.inst.iLevel2());
		Scene.instantiators.put("Level3", new com.arjunsuresh.gamesling.inst.iLevel3());
		Scene.instantiators.put("Levels", new com.arjunsuresh.gamesling.inst.iLevels());
		Scene.instantiators.put("main", new com.arjunsuresh.gamesling.inst.imain());

		Bdx.scenes.add(new Scene("main"));
		Bdx.firstScene = "main";
		
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
