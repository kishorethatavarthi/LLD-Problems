package com.learnings.notificationservice;

public interface IObservable {
       void addObserver(IObserver observer);
       
       void removeObserver(IObserver observer);
       
       void notifyObserver();
}
