package providerswithcomplexobjects;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class Module extends AbstractModule {

    @Override
    protected void configure() {

        bind(DrawShape.class).annotatedWith(Square.class).toProvider(DrawSquareProvider.class)
            .in(Scopes.SINGLETON);
        bind(DrawShape.class).annotatedWith(Circle.class).toProvider(DrawCircleProvider.class)
            .in(Scopes.SINGLETON);

        bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Blue");
        bind(Integer.class).annotatedWith(SquareEdgeValue.class).toInstance(50);

        bind(String.class).annotatedWith(CircleColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(CircleRadiusValue.class).toInstance(10);
    }
}
