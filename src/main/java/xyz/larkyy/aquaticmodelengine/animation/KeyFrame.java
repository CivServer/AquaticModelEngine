package xyz.larkyy.aquaticmodelengine.animation;

public abstract class KeyFrame {

    private final InterpolationType interpolationType;

    public KeyFrame(InterpolationType interpolationType) {
        this.interpolationType = interpolationType;
    }

    public InterpolationType getInterpolationType() {
        return interpolationType;
    }
}
