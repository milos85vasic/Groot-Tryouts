package net.milosvasic.tryout.groot.android.app.no_flavors;


import net.milosvasic.tryout.groot.android.library.GrootTryoutCommonActivity;
import net.milosvasic.tryout.groot.android.library.NoFlavorsBaseClass;
import net.milosvasic.tryout.groot.android.library.no_flavors.NoFlavorsTryoutClass;

public class NoFlavorsActivity extends GrootTryoutCommonActivity {

    private NoFlavorsBaseClass baseClass;

    {
        baseClass = new NoFlavorsTryoutClass("xxx");
    }

}
