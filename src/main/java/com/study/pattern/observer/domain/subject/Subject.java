package com.study.pattern.observer.domain.subject;

import com.study.pattern.observer.domain.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver(Observer o);


}
