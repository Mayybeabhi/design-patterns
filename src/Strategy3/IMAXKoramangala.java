package Strategy3;

public class IMAXKoramangala extends MovieTheatre{
    IMAXKoramangala(Projector projector, Sound sound, AspectRatio aspectRatio){
        super(projector, sound, aspectRatio);
    }

    @Override
    void playCinema() {
        System.out.println("Playing Killers of the Flower Moon in IMAX Koramangala....");
    }

}
