package providingobjectsatruntime;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        Multibinder<DrawShape> binding = Multibinder.newSetBinder(binder(), DrawShape.class);
        binding.addBinding().to(DrawSquare.class);
        binding.addBinding().to(DrawCircle.class);
    }
}
