package net.milosvasic.tryout.groot.android.library;


import android.app.Activity;

public class TestActivity1Dependant extends Activity {

    private ExampleClass1 exampleClass1;

    {
        exampleClass1 = new ExampleClass1();
    }

}
