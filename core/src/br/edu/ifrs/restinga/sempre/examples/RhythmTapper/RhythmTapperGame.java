/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.sempre.examples.RhythmTapper;

import br.edu.ifrs.restinga.sempre.classes.base.BaseGame;

/**
 *
 * @author Not275
 */
public class RhythmTapperGame extends BaseGame{
       
    public RhythmTapperGame() {
        super("rhythmtapper");
    }

    @Override
    public void create() {
        
        super.create(); //To change body of generated methods, choose Tools | Templates.
        setActiveScreen(new LevelScreen());
        
    }
    
}
