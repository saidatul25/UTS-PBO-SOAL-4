/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts4;

/**
 *
 * @author HP
 */
public class CourseDemoo {
    
    public static void main(String[] args) {
       Instructor myInstructor = new Instructor("saidatul", "maghfiroh", "004");
       
       TextBook myTextBook = new TextBook("Bumi Manusia", "Pramoedya Ananta Toer", "Gramedia Pustaka Utama");
       
       Course myCourse = new Course("Motivasi diri", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
}
