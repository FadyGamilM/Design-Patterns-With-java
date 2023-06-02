package com.design_patterns.with_observer;

public class HrTeam implements StudentManagerObserver {
    public void setNewStudentOnBoard() {
        System.out.println("Welcome on board, we need to fill some info about you ! :)");
    }

    @Override
    public void studentHasRegistered() {
        setNewStudentOnBoard();
    }

}