package demo;

import com.google.inject.Inject;

public class SquareRequest {

    private DrawShape d;

    @Inject
    public SquareRequest(DrawShape d) {
        this.d = d;
    }

    public void makeRequest() {
        d.draw();
    }
}
