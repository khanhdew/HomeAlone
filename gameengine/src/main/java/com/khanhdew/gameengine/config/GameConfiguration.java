package com.khanhdew.gameengine.config;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GameConfiguration {
    private static GameConfiguration instance;
    private int windowWidth = 1200;
    private int windowHeight = 800;
    private double windowScale = (double) 16 / 9;
    private int FPS = 120;
    private int UPS = 200;
    private double timePerFrame;
    private double timePerUpdate;
    private boolean SHOW_FPS = true;

    public GameConfiguration() {
        timePerFrame = 1000000000.0 / FPS;
        timePerUpdate = 1000000000.0 / UPS;
    }

    public synchronized static GameConfiguration getInstance() {
        if (instance == null) {
            return new GameConfiguration();
        }
        return instance;
    }
}
