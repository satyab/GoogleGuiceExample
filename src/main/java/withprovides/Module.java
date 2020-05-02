package withprovides;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class Module extends AbstractModule {

    @Provides
    public DrawShape providesDrawSquare() {
        return new DrawSquare("Blue", 50);
    }
}
