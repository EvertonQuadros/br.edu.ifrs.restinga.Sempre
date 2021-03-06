/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.sempre.examples.treasurequest;

import br.edu.ifrs.restinga.sempre.classes.entities.Solid;
import com.badlogic.gdx.maps.MapProperties;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 *
 * @author Not275
 */
public class Rock extends Solid{
    
    public Rock(MapProperties properties, Stage stage) {
        
        super(properties, stage);
    
        init(properties);
        
    }
 
    private void init(MapProperties properties){
        
        loadTexture("rock.png");
        setWidth((float)properties.get("width"));
        setHeight((float)properties.get("height"));
        setScale((MathUtils.random(0.9f, 1.4f)));
        setBoundaryPolygon(8);
        
    }
    
}
