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

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer" , MusicPlayer.class);

        firstMusicPlayer.setVolume(30);

        //сравнение обьектов если true то один и тот же обьект
        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println("=======================");
        System.out.println(comparison);
        System.out.println("=======================");
        System.out.println(firstMusicPlayer.hashCode());
        System.out.println(secondMusicPlayer.hashCode());
        System.out.println("=======================");
        firstMusicPlayer.playMusicList();
        System.out.println("=======================");
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(firstMusicPlayer.getName());
        System.out.println("=======================");
        secondMusicPlayer.playMusicList();
        System.out.println("=======================");
        System.out.println(secondMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getName());

        context.close();
    }
}
