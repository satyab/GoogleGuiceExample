package googleguicenamedannotations;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).annotatedWith(Names.named("Square")).to(DrawSquare.class);
        bind(DrawShape.class).annotatedWith(Names.named("Circle")).to(DrawCircle.class);
    }
}
