package multimodulewithinstall;

import com.google.inject.Inject;

public class SquareRequest {

    private DrawShape d;

    @Inject
    public SquareRequest(@Square DrawShape d) {
        this.d = d;
    }

    public void makeRequest() {
        d.draw();
    }
}
