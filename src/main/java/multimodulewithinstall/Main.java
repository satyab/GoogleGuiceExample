package multimodulewithinstall;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new CircleModule());

        SquareRequest square = injector.getInstance(SquareRequest.class);
        square.makeRequest();

        CircleRequest circle = injector.getInstance(CircleRequest.class);
        circle.makeRequest();
    }
}
