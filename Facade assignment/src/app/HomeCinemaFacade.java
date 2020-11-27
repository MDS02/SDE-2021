package app;

public class HomeCinemaFacade {

    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvdplayer;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popcorn;

    public HomeCinemaFacade(
            Amplifier amplifier,
            Tuner tuner,
            DvdPlayer dvdplayer,
            CdPlayer cd,
            Projector projector,
            TheaterLights lights,
            Screen screen,
            PopcornPopper popcorn
    )
    {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdplayer = dvdplayer;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popcorn = popcorn;
    }


    public void startMovie() {
        this.popcorn.on();
        this.popcorn.pop();
        this.lights.dim(8);
        this.screen.down();
        this.projector.on();
        this.projector.wideScreenMode();
        this.amplifier.on();
        this.amplifier.setDvd(this.dvdplayer);
        this.amplifier.setSurroundSound();
        this.amplifier.setVolume(45);
        this.dvdplayer.on();
        this.dvdplayer.play("The Fast and the Furious");
    }

    public void stopMovie() {
        this.popcorn.off();
        this.lights.on();
        this.screen.up();
        this.projector.off();
        this.amplifier.off();
        this.dvdplayer.stop();
        this.dvdplayer.eject();
        this.dvdplayer.off();
    }

    public void startMusic() {
        this.lights.on();
        this.amplifier.on();
        this.amplifier.setVolume(69);
        this.amplifier.setCd(this.cd);
        this.amplifier.setStereoSound();
        this.cd.on();
        this.cd.play("Aha - Take On Me");
    }

    public void stopMusic() {
        this.amplifier.off();
        this.amplifier.setCd(cd);
        this.cd.eject();
        this.cd.off();
    }

    public void startRadio() {
        this.tuner.on();
        this.tuner.setFrequency(102.4);
        this.amplifier.on();
        this.amplifier.setVolume(13);
        this.amplifier.setTuner(tuner);
    }

    public void stopRadio() {
        this.tuner.off();
        this.amplifier.off();
    }
}
