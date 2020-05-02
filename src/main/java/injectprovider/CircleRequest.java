package injectprovider;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class CircleRequest {

    private Provider<DrawCircle> circleProvider;

    @Inject
    public CircleRequest(Provider<DrawCircle> circleProvider) {
        this.circleProvider = circleProvider;
    }

    public void makeRequest() {
        circleProvider.get().draw();
        circleProvider.get().draw();
    }
}
