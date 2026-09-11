package Strategy3;

public abstract class MovieTheatre {
    private final Projector projector;
    private final Sound sound;
    private final AspectRatio aspectRatio;

    MovieTheatre(Projector projector, Sound sound, AspectRatio aspectRatio) {
        this.projector = projector;
        this.sound = sound;
        this.aspectRatio = aspectRatio;
    }

    abstract void playCinema();

    void project(){
        projector.project();
    }
    void play(){
        sound.play();
    }

    void aspectRatio(){
        aspectRatio.aspectRatio();
    }
}
