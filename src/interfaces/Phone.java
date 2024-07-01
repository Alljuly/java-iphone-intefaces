package src.interfaces;

import src.entities.Contact;

import java.awt.*;
import java.util.ArrayList;

public interface Phone {
    ArrayList<Contact> ContactsList = new ArrayList<>();
    boolean networkIsActive = false;


    public void call(String number);

    public  void pickUp();

    public  void newVoiceMessage(String number);

}
