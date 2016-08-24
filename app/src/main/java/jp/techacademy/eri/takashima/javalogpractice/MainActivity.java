package jp.techacademy.eri.takashima.javalogpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human ("はじめ", 35, "野球"); //名前をはじめ、年齢35歳で、趣味野球Humanのインスタンスを作る。

        human.think();

        human.say();
        Log.d("javatest", "私の名前は" + human.name + "です。");
        Log.d("javatest", "年は" + human.age + "歳です。");

    }
}
