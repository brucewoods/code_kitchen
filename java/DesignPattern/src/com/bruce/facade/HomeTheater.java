package com.bruce.facade;

public class HomeTheater {

	private DVDPlayer dvdPlayer;
	private Popcorn popcorn;
	private Projector projector;
	private Screen screen;
	private Stereo stereo;
	private TheaterLight theaterLight;

	public HomeTheater() {
		super();
		this.dvdPlayer = dvdPlayer.getInstance();
		this.popcorn = popcorn.getInstance();
		this.projector = projector.getInstance();
		this.screen = screen.getInstance();
		this.stereo = stereo.getInstance();
		this.theaterLight = theaterLight.getInstance();
	}

	public void ready() {

		popcorn.on();
		dvdPlayer.on();
	}

	public void turnon() {
		dvdPlayer.play();
		stereo.up();
		screen.down();

		projector.on();
		theaterLight.dim();

	}

	public void pause() {
		dvdPlayer.pause();

	}

	public void turnoff() {
		dvdPlayer.off();
		stereo.down();
		screen.up();

		projector.off();
		theaterLight.bright();
		popcorn.off();
	}

}
