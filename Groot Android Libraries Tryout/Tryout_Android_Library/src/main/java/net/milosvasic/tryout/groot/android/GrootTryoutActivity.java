package net.milosvasic.tryout.groot.android;


import android.os.Bundle;
import android.os.PersistableBundle;

import com.google.gson.Gson;

public class GrootTryoutActivity extends GrootTryoutCommonActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_groot_tryout);

        // Let's try JARs:
        Gson gson = new Gson();
    }

}
