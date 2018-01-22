package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import java.util.LinkedList;
import java.util.Random;


public class NBackScreen implements Screen {
    private final ImageButton positionButton;
    private final ImageButton typeButton;
    private final ImageButton positionAndTypeButton;
    private final LinkedList<ImageButton> posList;
    Stage stage;
    final MainGame game;
    OrthographicCamera camera;
    Belt belt;
    Random rndGen;

    public NBackScreen(MainGame game) {
        this.game = game;
        stage = new Stage();
        Assets.load();


        positionButton = new ImageButton(new TextureRegionDrawable(new TextureRegion(new Texture("core/assets/pola/pole_pos.png"))));
        typeButton = new ImageButton(new TextureRegionDrawable(new TextureRegion(new Texture("core/assets/pola/pole_typ.png"))));
        positionAndTypeButton = new ImageButton(new TextureRegionDrawable(new TextureRegion(new Texture("core/assets/pola/pole_both.png"))));


        positionButton.setPosition(550,350);
        typeButton.setPosition(550,200);
        positionAndTypeButton.setPosition(550,50);
        
        posList = new LinkedList<ImageButton>();
        
        posList.add(positionButton);
        posList.add(typeButton);
        posList.add(positionAndTypeButton);

        for(ImageButton i: posList){
            i.setVisible(true);
            i.setSize(200,100);
            stage.addActor(i);
        }


    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        Assets.displayNBackGame(game.batch);
        stage.draw();
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
