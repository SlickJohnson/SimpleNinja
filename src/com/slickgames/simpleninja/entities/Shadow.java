package com.slickgames.simpleninja.entities;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import com.slickgames.simpleninja.main.SimpleNinja;
import com.slickgames.simpleninja.states.Play;

/**
 * Created by Administrator on 5/5/2016.
 */
public class Shadow extends Enemy{

    public Shadow(Body body, Play play, int aId) {
        super(body, play, aId);
        runningAnimation = play.game.getAssetManager().get("res/images/enemy_run.png");
        attackingAnimation = play.game.getAssetManager().get("res/images/enemy_attack.png");
        idlingAnimation = play.game.getAssetManager().get("res/images/enemy_idle.png");
        run = TextureRegion.split(runningAnimation, 54, 42)[0];
        idle = TextureRegion.split(idlingAnimation, 54, 42)[0];
        jump = TextureRegion.split(runningAnimation, 54, 42)[0];
        attack = TextureRegion.split(attackingAnimation, 54, 42)[0];
        setAnimation(idle, 1 / 7f);
    }
}
