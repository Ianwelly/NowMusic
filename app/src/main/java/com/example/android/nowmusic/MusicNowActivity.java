package com.example.android.nowmusic;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MusicNowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_now);

        Button backButton = (Button) findViewById(R.id.button_back);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        /*
        This is the code for opening the camera from the KaraokeSelfie button.
        I have tried to open the front facing camera by copying and pasting this
        code from Stack Overflow. It opens the rear facing camera. I have tried
        changing the integer in the launchIntent.putExtra("android.intent.extras.LENS_FACING_FRONT", 2);
        line of code but it doesn't change anything. I have tried to look for a solution
        but the ones that I have found seem quite complex, creating a camera class etc.
         Due to time constraints I will leave the code like this for
        now and try and to implement the necessary code when I have more time.
         */

        Button karaokeSelfieButton = (Button) findViewById(R.id.button_karaoke);

        karaokeSelfieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                launchIntent.putExtra("android.intent.extras.CAMERA_FACING", android.hardware.Camera.CameraInfo.CAMERA_FACING_FRONT);
                launchIntent.putExtra("android.intent.extras.LENS_FACING_FRONT", 2);
                launchIntent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                startActivity(launchIntent);
            }
        });


    }




}
