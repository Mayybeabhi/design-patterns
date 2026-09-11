package Strategy3;

public class Main {
    public static void main(String[] args) {
        MovieTheatre ambDolbyCinemas=new AMBDolbyCinemas(new Digital(),new Dolby(),new Scope());

        ambDolbyCinemas.playCinema();
        ambDolbyCinemas.project();
        ambDolbyCinemas.play();
        ambDolbyCinemas.aspectRatio();

        MovieTheatre imaxKoramangala=new IMAXKoramangala(new Digital(),new IMAXImmersiveSound(), new Liemax());

        imaxKoramangala.playCinema();
        imaxKoramangala.project();
        imaxKoramangala.play();
        imaxKoramangala.aspectRatio();

        MovieTheatre inoxM5Mall=new INOXM5Mall(new Digital(), new DTS(), new Scope());

        inoxM5Mall.playCinema();
        inoxM5Mall.project();
        inoxM5Mall.play();
        inoxM5Mall.aspectRatio();
    }
}
