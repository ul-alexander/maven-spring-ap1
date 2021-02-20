package ru.alexander.maven.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);

        //IoC
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println("=======================");
        musicPlayer.playMusicList();
        System.out.println("=======================");
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

        context.close();
    }
}
