package com.ayuan.drawbleanim;

import android.graphics.drawable.AnimationDrawable;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable rocketAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView rocketImage = (ImageView) findViewById(R.id.iv_view);
        //设置背景资源
        rocketImage.setBackgroundResource(R.drawable.my_anim);
        //兼容低版本的写法
        new Thread() {
            @Override
            public void run() {
                super.run();
                SystemClock.sleep(100);
                //获取AnimationDrawable类
                rocketAnimation = (AnimationDrawable) rocketImage.getBackground();
                //开启动画
                rocketAnimation.start();
            }
        }.start();

    }
}
