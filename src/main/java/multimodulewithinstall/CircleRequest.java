package multimodulewithinstall;

import com.google.inject.Inject;

public class CircleRequest {

    @Inject
    @Circle
    DrawShape d;

    public void makeRequest() {
        d.draw();
    }

}
