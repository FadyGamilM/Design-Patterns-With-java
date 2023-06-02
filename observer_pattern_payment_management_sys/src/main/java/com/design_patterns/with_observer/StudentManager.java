package com.design_patterns.with_observer;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    // private final StudentBooksStore studentBooksStore = new StudentBooksStore();
    // private final HrTeam hrTeam = new HrTeam();

    private List<StudentManagerObserver> observers = new ArrayList<StudentManagerObserver>();

    public void RegisterObserver(StudentManagerObserver observer) {
        observers.add(observer);
    }

    public void UnRegisterObserver(StudentManagerObserver observer) {
        observers.remove(observer);
    }

    public void RegisterNewStudent(String student) {
        // registeration process work ...
        System.out.printf("welcome %s your are successfully registered to the class \n", student);

        // notify the other services ...
        observers.forEach(o -> o.studentHasRegistered());
    }
}