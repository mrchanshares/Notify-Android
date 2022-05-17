package com.application.isradeleon.notifyexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.application.isradeleon.notify.Notify;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {


            String TITLE = getExtraString(extras, "TITLE");
            String MESSAGE = getExtraString(extras, "MESSAGE");

            Notify.build(getApplicationContext())
                    .setTitle(TITLE)
                    .setContent(MESSAGE)
                    .setSmallIcon(R.drawable.ic_notifications_none_white_24dp)
                    .setLargeIcon("https://images.pexels.com/photos/139828/pexels-photo-139829.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=150&w=440")
                    .largeCircularIcon()
                    .setPicture("https://images.pexels.com/photos/1058682/pexels-photo-1058683.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940")
                    .setColor(R.color.colorPrimary)
                    .show();


        }
        else
        {

                Notify.build(getApplicationContext())
                            .setTitle("Jill Zhao")
                            .setContent("Hi! So I meet you today?")
                            .setSmallIcon(R.drawable.ic_notifications_none_white_24dp)
                            .setLargeIcon("https://images.pexels.com/photos/139828/pexels-photo-139829.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=150&w=440")
                            .largeCircularIcon()
                            .setPicture("https://images.pexels.com/photos/1058682/pexels-photo-1058683.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940")
                            .setColor(R.color.colorPrimary)
                            .show();




        }


        // Example

        finish();


//        Notify.build(getApplicationContext())
//                .setTitle("Jill Zhao")
//                .setContent("Hi! So I meet you today?")
//                .setSmallIcon(R.drawable.ic_notifications_none_white_24dp)
//                .setLargeIcon("https://images.pexels.com/photos/139829/pexels-photo-139829.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=150&w=440")
//                .largeCircularIcon()
//                .setPicture("https://images.pexels.com/photos/1058683/pexels-photo-1058683.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940")
//                .setColor(R.color.colorPrimary)
//                .show();

    }
    public String getExtraString(Bundle extras, String key) {
        // return extra a space if null
        String extraValue = "";
        if (extras != null) {
            extraValue = extras.getString(key);
            if (extraValue == null) {
                extraValue = "";
            }
        }

        return extraValue;
    }

    public String getExtraString(Context content, Bundle savedInstanceState,
                                 String key) {
        String newString;
        if (savedInstanceState == null) {
            Bundle extras = ((Activity) content).getIntent().getExtras();
            if (extras == null) {
                newString = null;
            } else {
                newString = extras.getString(key);
            }
        } else {
            newString = (String) savedInstanceState.getSerializable(key);
        }
        return newString;
    }

}
