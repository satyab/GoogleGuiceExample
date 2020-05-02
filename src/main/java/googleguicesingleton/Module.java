package googleguicesingleton;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(10);

        bind(SquareRequest.class).in(Scopes.SINGLETON);
    }
}
