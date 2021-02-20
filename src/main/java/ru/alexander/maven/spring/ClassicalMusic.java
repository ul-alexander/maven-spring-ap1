package ru.alexander.maven.spring;

public class ClassicalMusic implements Music {

    //Ограничиваем создание обьекта этого класа закрытый конструктор
    private ClassicalMusic(){

    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }


}
