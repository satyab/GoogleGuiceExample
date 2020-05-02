package multimodule;

import com.google.inject.AbstractModule;

public class CircleModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);
    }
}
