package multimodule;

import com.google.inject.AbstractModule;

public class SquareModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class);
    }
}
