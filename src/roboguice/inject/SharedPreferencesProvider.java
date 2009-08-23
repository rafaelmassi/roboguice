package roboguice.inject;

import com.google.inject.Inject;
import com.google.inject.Provider;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;


public class SharedPreferencesProvider implements Provider<SharedPreferences> {
    protected String context;

    @Inject protected Provider<Activity> activity;

    public SharedPreferencesProvider( String context ) {
        this.context = context;
    }

    public SharedPreferences get() {
        return activity.get().getSharedPreferences(context, Context.MODE_PRIVATE);
    }
}