package ling.placeholder.demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import ling.placeholder.CorpDrawableBuilder;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView view1 = (ImageView) findViewById(R.id.imageView1);
        ImageView view2 = (ImageView) findViewById(R.id.imageView2);
        ImageView view3 = (ImageView) findViewById(R.id.imageView3);
        ImageView view4 = (ImageView) findViewById(R.id.imageView4);
        ImageView view5 = (ImageView) findViewById(R.id.imageView5);

        Glide.with(this).load("http://cdn.duitang.com/uploads/item/201202/09/20120209095413_iJnZL.thumb.200_200_c.jpg")
                .placeholder(R.mipmap.default_image)
                .skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(view1);
        Glide.with(this).load("http://img2.3lian.com/2014/f4/168/31.jpg")
                .skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .placeholder(CorpDrawableBuilder.build(ActivityCompat.getDrawable(this, R.mipmap.default_image), Color.RED))
                .into(view2);
        Glide.with(this).load("http://photo.l99.com/bigger/21/1366287122910_1nh3be.jpg")
                .placeholder(CorpDrawableBuilder.build( ActivityCompat.getDrawable(this, R.mipmap.default_image), Color.GREEN))
                .skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(view3);
        Glide.with(this).load("http://c11.eoemarket.com/upload/apps/2013/0420/131329/screenshots/44cc1a41-3c3d-46ce-8c8d-51def3b35e7d.jpg")
                .placeholder(CorpDrawableBuilder.build(ActivityCompat.getDrawable(this, R.mipmap.default_image), Color.BLUE))
                .skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(view4);

        view5.setImageDrawable(CorpDrawableBuilder.build(ActivityCompat.getDrawable(this, R.mipmap.default_image), Color.MAGENTA));
    }
}
