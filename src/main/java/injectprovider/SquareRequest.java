package injectprovider;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class SquareRequest {

    private Provider<DrawSquare> squareProvider;

    @Inject
    public SquareRequest(Provider<DrawSquare> squareProvider) {
        this.squareProvider = squareProvider;
    }

    public void makeRequest() {
        squareProvider.get().draw();
        squareProvider.get().draw();
    }
}
