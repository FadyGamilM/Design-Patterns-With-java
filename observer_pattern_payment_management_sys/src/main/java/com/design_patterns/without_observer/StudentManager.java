package com.design_patterns.without_observer;

public class StudentManager {

    private final StudentBooksStore studentBooksStore = new StudentBooksStore();
    private final HrTeam hrTeam = new HrTeam();

    public void RegisterNewStudent(String student) {
        // registeration process work ...
        System.out.printf("welcome %s your are successfully registered to the class \n", student);

        // notify the other services ...
        studentBooksStore.getNewSetOfBooksReady();
        hrTeam.setNewStudentOnBoard();
    }
}