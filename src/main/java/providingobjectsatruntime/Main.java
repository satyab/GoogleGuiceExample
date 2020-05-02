package providingobjectsatruntime;

import com.google.inject.Guice;
import com.google.inject.Injector;


public class Main {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new Module());
        ShapeRequest shape = injector.getInstance(ShapeRequest.class);
        shape.makeRequest(Shape.CIRCLE);
        shape.makeRequest(Shape.SQUARE);

    }
}
