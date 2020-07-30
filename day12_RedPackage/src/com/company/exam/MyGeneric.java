package com.company.exam;

/**
 * @author Joker_Dong
 * @date 2020-7-30 19:34
 */

public class MyGeneric <Music>{
    // 由于没有Music类型,在这里代表一种未知的引用类型
    // 未来传递什么就是什么类型
    private Music music;
    public void setMusic(Music music){
        this.music = music;
    }
    public Music getMusic(){
        return music;
    }
    public <Music> void showClass(Music music){
        System.out.println(music.getClass());
    }
    public <Music> Music showClass2(Music music){
        return music;
    }
}
