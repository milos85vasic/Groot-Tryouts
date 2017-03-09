package net.milosvasic.tryout.groot.android;


import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

public class GrootTryoutActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_groot_tryout);
    }

}
