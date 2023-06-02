package com.design_patterns;

import com.design_patterns.without_observer.StudentManager;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.RegisterNewStudent("fady gamil");
    }
}
