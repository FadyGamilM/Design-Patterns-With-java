package com.design_patterns;

import com.design_patterns.with_observer.StudentBooksStore;
import com.design_patterns.without_observer.StudentManager;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // -> without observer pattern (highly coupled)
        System.out.println("➜ without observer pattern");
        StudentManager studentManager = new StudentManager();
        studentManager.RegisterNewStudent("fady gamil");

        // -> with oserver pattern (loose-coupling)
        System.out.println("➜ with observer pattern");
        com.design_patterns.with_observer.StudentManager sm = new com.design_patterns.with_observer.StudentManager();
        var hr_1 = new com.design_patterns.with_observer.HrTeam();
        sm.RegisterObserver(hr_1);

        var sbs_1 = new com.design_patterns.with_observer.StudentBooksStore();
        sm.RegisterObserver(sbs_1);

        sm.RegisterNewStudent("ahmed mostafa");
        sm.RegisterNewStudent("magy magdy");

        sm.UnRegisterObserver(hr_1);

        sm.RegisterNewStudent("marawan mohammed");
    }
}
