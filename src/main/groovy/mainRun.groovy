import service.WindowTools

import javax.swing.*
import java.awt.*

/**
 * Created by a689638 on 3/23/2016.
 * Copyright (C) 2016 HEB
 * @author Ryan Anders
 * This software is the confidential and proprietary information 
 * of HEB
 */
UIManager.setLookAndFeel(
        UIManager.getSystemLookAndFeelClassName());
gui.OverclockedOrca orca = new gui.OverclockedOrca()
WindowTools.bootWindow orca.getPanel1(), new Dimension(640, 480), "OrCA/P", true


//GroovyClassLoader classLoader = new GroovyClassLoader();
//def myClass = classLoader.parseClass(new File("disconnected/taskA.groovy"))
//Class aClass = CompilerUtils.CACHED_COMPILER.loadFromJava("taskResponse", new File("disconnected/taskResponse.java").text);
//myClass.run(aClass.newInstance());