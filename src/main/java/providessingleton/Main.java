package providessingleton;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new Module());
        SquareRequest square1 = injector.getInstance(SquareRequest.class);
        square1.makeRequest();

        SquareRequest square2 = injector.getInstance(SquareRequest.class);
        square2.makeRequest();

        System.out.println(square1.getDrawShape() == square2.getDrawShape());
    }
}
