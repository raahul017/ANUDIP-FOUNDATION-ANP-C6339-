// Home Theater System: Create a home theater system using the Facade Pattern.
//Define classes for various components like DVD player, amplifier, projector, and screen. 
//Implement a HomeTheaterFacade class that provides a simplified interface to control
//the entire home theater system, including turning it on, playing a movie, and turning it off.


package com.designpatterns;

//DVD Player class
class DVDPlayer {
 void on() {
     System.out.println("DVD Player is ON");
 }

 void play(String movie) {
     System.out.println("Playing movie: " + movie);
 }

 void off() {
     System.out.println("DVD Player is OFF");
 }
}

//Amplifier class
class Amplifier {
 void on() {
     System.out.println("Amplifier is ON");
 }

 void setVolume(int volume) {
     System.out.println("Setting volume to " + volume);
 }

 void off() {
     System.out.println("Amplifier is OFF");
 }
}

//Projector class
class Projector {
 void on() {
     System.out.println("Projector is ON");
 }

 void setInput(DVDPlayer dvdPlayer) {
     System.out.println("Setting projector input to DVD Player");
 }

 void off() {
     System.out.println("Projector is OFF");
 }
}

//Screen class
class Screen {
 void up() {
     System.out.println("Screen is UP");
 }

 void down() {
     System.out.println("Screen is DOWN");
 }
}

//Home Theater Facade class
class HomeTheaterFacade {
       DVDPlayer dvdPlayer;
       Amplifier amplifier;
       Projector projector;
       Screen screen;

 public HomeTheaterFacade(DVDPlayer dvdPlayer, Amplifier amplifier, Projector projector, Screen screen) {
     this.dvdPlayer = dvdPlayer;
     this.amplifier = amplifier;
     this.projector = projector;
     this.screen = screen;
 }

 public void watchMovie(String movie) {
     System.out.println("Get ready to watch a movie...");
     screen.down();
     projector.on();
     projector.setInput(dvdPlayer);
     amplifier.on();
     amplifier.setVolume(7);
     dvdPlayer.on();
     dvdPlayer.play(movie);
 }

 public void endMovie() {
     System.out.println("Shutting down the home theater...");
     dvdPlayer.off();
     amplifier.off();
     projector.off();
     screen.up();
 }
}

public class HomeTheaterSystem {
 public static void main(String[] args) {
     DVDPlayer dvdPlayer = new DVDPlayer();
     Amplifier amplifier = new Amplifier();
     Projector projector = new Projector();
     Screen screen = new Screen();

     HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, amplifier, projector, screen);

     // Watch a movie
     homeTheater.watchMovie("xxxxx");

     // End the movie
     homeTheater.endMovie();
 }
}
