/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.sempre.examples.rectangledestroyer;

import br.edu.ifrs.restinga.sempre.classes.base.BaseActor;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 *
 * @author Not275
 */
public class Paddle extends BaseActor{

    public Paddle(float x, float y, Stage stage) {
        
        super(x, y, stage);
        
        init();
        
    }
    
    private void init(){
        loadTexture("paddle.png");
    }
    
}
