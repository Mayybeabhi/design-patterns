package Strategy3;

public class AMBDolbyCinemas extends MovieTheatre{
    AMBDolbyCinemas(Projector projector, Sound sound, AspectRatio aspectRatio) {
        super(projector, sound, aspectRatio);
    }

    @Override
    void playCinema() {
        System.out.println("Playing Killers of the Flower Moon in AMB Dolby Cinemas....");
    }
}
