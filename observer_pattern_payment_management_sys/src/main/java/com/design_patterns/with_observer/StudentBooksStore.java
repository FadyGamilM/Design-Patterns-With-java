package com.design_patterns.with_observer;

public class StudentBooksStore implements StudentManagerObserver {
    public void getNewSetOfBooksReady() {
        System.out.println("New books package are ready for the new student");
    }

    @Override
    public void studentHasRegistered() {
        getNewSetOfBooksReady();
    }
}