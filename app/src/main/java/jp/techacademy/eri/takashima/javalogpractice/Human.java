package jp.techacademy.eri.takashima.javalogpractice;

/**
 * Created by hajime04 on 8/23/2016.
 */

import android.util.Log;

class Human extends Animal implements Thinkable {
    public static String to_jp = "人間";

    //メンバ変数
    String hobby; //趣味

    //コンストラクタ

    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    //クラス関数
    public static void introduce(){
        Log.d("javatest", "これは人間クラスです。");
    }

    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + this.hobby);
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }

}
