public class CarOriginal {
    private EngineOriginall engine;

    public CarOriginal() {
        this.engine = new EngineOriginall();
    }

    public void start() {
        engine.start();
    }
}

class EngineOriginal {
    public void start() {
        System.out.println("Engine started.");
    }
}