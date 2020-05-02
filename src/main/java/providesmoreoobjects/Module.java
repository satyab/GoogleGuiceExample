package providesmoreoobjects;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import javax.inject.Named;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("SquareColor")).toInstance("Blue");
        bind(String.class).annotatedWith(Names.named("CircleColor")).toInstance("Red");

        bind(Integer.class).annotatedWith(Names.named("Edge")).toInstance(50);
        bind(Integer.class).annotatedWith(Names.named("Radius")).toInstance(10);
    }

    @Provides
    @Named("Square")
    public DrawShape providesDrawSquare(@Named("SquareColor") String color,
        @Named("Edge") Integer edge) {
        return new DrawSquare(color, edge);
    }

    @Provides
    @Named("Circle")
    public DrawShape providesDrawCircle(@Named("CircleColor") String color,
        @Named("Radius") Integer radius) {
        return new DrawCircle(color, radius);
    }
}
