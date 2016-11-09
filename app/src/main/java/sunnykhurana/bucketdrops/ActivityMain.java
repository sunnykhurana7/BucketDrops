package sunnykhurana.bucketdrops;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener {

    Toolbar mToolbar;
    Button mBtnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mBtnAdd = (Button) findViewById(R.id.btn_add);
        mBtnAdd.setOnClickListener(this);
        setSupportActionBar(mToolbar);
        intBackgroundImage();

    }

    private void intBackgroundImage() {

        // for image
        ImageView imageView = (ImageView) findViewById(R.id.iv_background);
        Glide.with(this)
                .load(R.drawable.background)
                .centerCrop()
                .into(imageView);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Button Was Clicked", Toast.LENGTH_SHORT).show();
    }
}
