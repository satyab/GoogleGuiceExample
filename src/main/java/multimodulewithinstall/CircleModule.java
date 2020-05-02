package multimodulewithinstall;

import com.google.inject.AbstractModule;

public class CircleModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new SquareModule());
        bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);
    }
}
