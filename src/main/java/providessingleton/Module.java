package providessingleton;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class Module extends AbstractModule {

    @Provides
    @Singleton
    public DrawShape providesDrawSquare() {
        return new DrawSquare("Blue", 50);
    }
}
