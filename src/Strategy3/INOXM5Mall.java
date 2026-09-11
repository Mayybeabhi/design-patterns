package Strategy3;

public class INOXM5Mall extends MovieTheatre {
    INOXM5Mall(Projector projector, Sound sound, AspectRatio aspectRatio) {
        super(projector, sound, aspectRatio);
    }
    @Override
    void playCinema() {
        System.out.println("Playing Killers of the Flower Moon in INOX M5 Ecity Mall....");
    }
}
