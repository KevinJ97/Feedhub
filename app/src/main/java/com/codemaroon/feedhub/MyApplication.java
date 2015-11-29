package com.codemaroon.feedhub;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by kevinjnguyen on 11/22/15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "yVxAdGsgxW8mvjTh90guGoYYH0o8irbZOmLp6fsM", "yFqQJkJ496HYToMiEmA9RPypMnlVwiiViHEvfELA");
    }

}
