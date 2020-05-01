package better;

public class SquareRequest {

    DrawShape d;

    public SquareRequest(DrawShape d) {
        this.d = d;
    }

    public void makeRequest() {
        d.draw();
    }
}
