/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.methotels727.pages;

import com.metropolitan.methotels727.data.Soba;
import java.util.ArrayList;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

/**
 *
 * @author Miroslav Stipanoviæ 727
 */
public class Sobe {
    
    @Property
    private Soba soba;
    
    @Property
    @Persist
    private ArrayList<Soba> sobe;
    
    
    void onActivate(){
        if(sobe==null)
            sobe = new ArrayList<Soba>();
    }
    
    Object onSuccess(){
        sobe.add(soba);
        return this;
    }
    
}
