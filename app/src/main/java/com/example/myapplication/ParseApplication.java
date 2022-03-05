package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("rdLT60mPyfBi8ow40u8q6ULg7r4TzEAsYytw8jaB")
                .clientKey("qXfNMQ5cdkj0EgKM9o6DCCSzNi82HfYRUWz7Fn7g")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
