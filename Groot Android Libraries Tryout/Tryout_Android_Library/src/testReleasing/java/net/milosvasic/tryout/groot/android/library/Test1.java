package net.milosvasic.tryout.groot.android.library;


import org.junit.Assert;

public class Test1 extends TestAbstract {

    {
        x = 5;
    }

    @Override
    public void test() {
        Assert.assertEquals(5, x);
    }

}
