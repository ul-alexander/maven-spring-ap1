package ru.alexander.maven.spring;

public class MusicPlayer {

    //Общий интефейс мюзик
    private Music music;

    //IoC + полиморфизм
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music){
        this.music = music;
    }


    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
