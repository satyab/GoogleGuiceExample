package providessingleton;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import javax.inject.Named;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("Color")).toInstance("Blue");
        bind(Integer.class).annotatedWith(Names.named("Edge")).toInstance(50);

    }

    @Provides
    @Singleton
    public DrawShape providesDrawSquare(@Named("Color") String color, @Named("Edge") Integer edge) {
        return new DrawSquare(color, edge);
    }
}
