package net.milosvasic.tryout.groot.android.library;


import android.app.Activity;

public class TestActivity1Dependant extends Activity {

    private ExampleClass1 exampleClass1;
    private TryoutAndroidLibraryExampleClass1 tryoutAndroidLibraryExampleClass1;

    {
        exampleClass1 = new ExampleClass1();
        tryoutAndroidLibraryExampleClass1 = new TryoutAndroidLibraryExampleClass1();
    }

    public void print() {
        System.out.println(exampleClass1.getValue());
        System.out.println(tryoutAndroidLibraryExampleClass1.exampleField);
    }

}
