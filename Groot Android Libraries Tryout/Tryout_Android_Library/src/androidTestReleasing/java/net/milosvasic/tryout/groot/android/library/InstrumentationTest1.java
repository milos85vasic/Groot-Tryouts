package net.milosvasic.tryout.groot.android.library;


import org.junit.Assert;

public class InstrumentationTest1 extends InstrumentationTestAbstract {

    {
        x = 12;
    }

    @Override
    public void test() {
        Assert.assertEquals(12, x);
    }

}
