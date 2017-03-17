package net.milosvasic.tryout.groot.android.library;


import org.junit.Assert;

public class Test1 extends TestAbstract {

    {
        x = 7;
    }

    @Override
    public void test() {
        Assert.assertEquals(7, x);
    }

}
