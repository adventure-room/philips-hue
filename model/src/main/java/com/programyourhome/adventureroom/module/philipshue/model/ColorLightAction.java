package com.programyourhome.adventureroom.module.philipshue.model;

import com.programyourhome.adventureroom.model.script.action.Action;
import com.programyourhome.adventureroom.module.philipshue.model.resources.colors.ColorRGB;
import com.programyourhome.adventureroom.module.philipshue.model.resources.lights.Light;

public class ColorLightAction implements Action {

    public Light light;
    public ColorRGB color;

}