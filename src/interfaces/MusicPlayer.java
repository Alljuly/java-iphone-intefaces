package src.interfaces;

import src.entities.Music;

import java.util.ArrayList;

public interface MusicPlayer {
    ArrayList<Music> musicList = new ArrayList<>();

    public void play(String title);

    public void pause(String title);
    public void chooseMusic(String title);


}
