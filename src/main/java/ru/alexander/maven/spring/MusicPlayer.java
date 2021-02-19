package ru.alexander.maven.spring;

public class MusicPlayer {

    //Общий интефейс мюзик
    private Music music;
    //поля
    private String name;
    private int volume;

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    //IoC + полиморфизм
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {

    }


    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
