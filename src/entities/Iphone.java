package src.entities;

import src.interfaces.BrowserNavigator;
import src.interfaces.MusicPlayer;
import src.interfaces.Phone;

public class Iphone implements BrowserNavigator, MusicPlayer, Phone {
    public Iphone() {
    }


    @Override
    public void play(String title) {
        boolean found = false;
         for(Music m: MusicPlayer.musicList){
             if(m.getTitle().equals(title)){
                 found = true;
                 System.out.println("Playing song: " + m.getTitle());
             }
         }
         if(!found){
             System.out.println("Music not found. ");
         }
    }

    @Override
    public void pause(String title) {
        boolean found = false;
        for(Music m: MusicPlayer.musicList){
            if(m.getTitle().equals(title)){
                found = true;
                System.out.println("Pause song: " + m.getTitle());
            }
        }
        if(!found){
            System.out.println("Music not found. ");
        }
    }

    @Override
    public void chooseMusic(String title) {
        boolean found = false;
        for(Music m: MusicPlayer.musicList){
            if(m.getTitle().equals(title)){
                found = true;
                System.out.println("You selected " + m.toString());
            }
        }
        if(!found){
            System.out.println("Music not found. ");
        }
    }

    @Override
    public void call(String number) {
            boolean found = false;
            for(Contact c:Phone.ContactsList){
                if(c.getNumber().equals(number)){
                    found = true;
                    System.out.println("Calling....");
                }
            }
            if(!found){
                System.out.println("Contact not found.");
            }
    }

    @Override
    public void pickUp() {
        System.out.println("On call");
    }

    @Override
    public void newVoiceMessage(String number) {
        boolean found = false;
        for(Contact c:Phone.ContactsList){
            if(c.getNumber().equals(number)){
                found = true;
                System.out.println("Recording....");
            }
        }
        if(!found){
            System.out.println("Contact not found.");
        }
    }

    @Override
    public void displayPage() {

    }

    @Override
    public void addNewTab() {

    }

    @Override
    public void refreshPage() {

    }
}
