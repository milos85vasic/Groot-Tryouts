package net.milosvasic.tryout.groot.android.library.no_flavors;


public class NoFlavorsDependantMain {

    private NoFlavorsTryoutClass2 noFlavorsTryoutClass2;

    {
        noFlavorsTryoutClass2 = new NoFlavorsTryoutClass2();
    }

    public void print(){
        System.out.println(noFlavorsTryoutClass2.value);
    }

}
