package injectprovider;

import com.google.inject.AbstractModule;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Blue");
        bind(Integer.class).annotatedWith(SquareEdgeValue.class).toInstance(50);

        bind(String.class).annotatedWith(CircleColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(CircleRadiusValue.class).toInstance(10);
    }
}
