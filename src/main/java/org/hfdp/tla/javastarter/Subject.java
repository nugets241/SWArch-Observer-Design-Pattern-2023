package org.hfdp.tla.javastarter;

// The Subject interface
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}


