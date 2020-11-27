package app;

public class Main {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amplifier);
        DvdPlayer dvdplayer = new DvdPlayer("Top-O-Line DVD Player", amplifier);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amplifier);
        Projector projector = new Projector("Top-O-Line Projector", dvdplayer);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popcorn = new PopcornPopper("Popcorn Popper");


        // Create the actual facade
        HomeCinemaFacade homecinemaFacade = new HomeCinemaFacade(amplifier, tuner, dvdplayer, cd, projector, lights, screen, popcorn);

        //
        homecinemaFacade.startMovie();
        homecinemaFacade.stopMovie();
        homecinemaFacade.startMusic();
        homecinemaFacade.stopMusic();
        homecinemaFacade.startRadio();
        homecinemaFacade.stopRadio();
    }
}