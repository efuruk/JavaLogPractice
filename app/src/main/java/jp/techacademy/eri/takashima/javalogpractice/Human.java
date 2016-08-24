package jp.techacademy.eri.takashima.javalogpractice;

/**
 * Created by hajime04 on 8/23/2016.
 */

import android.util.Log;

class Human extends Animal implements Thinkable {
    //コンストラクタ
    public Human() {
        name = "";
        age = 0;
        hobby = "";
    }

    //引数付きコンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + this.hobby);
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }


}
