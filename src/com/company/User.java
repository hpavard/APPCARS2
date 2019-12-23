/**
 * In this part, we can find the code for adding,
 * setting and removing the users who can rent the cars
 * with the application.
 */

package com.company;

public class User {

    /**
     * User informations :
     */
    private String lastName;
    private String firstName;
    private int age;
    private String nationality;
    private int department;

    public User(String l, String f, int a, String n, int d) {
        lastName = l;
        firstName = f;
        age = a;
        nationality = n;
        department = d;

        /**
         * You must be over 18 years old to use this application.
         */
        if(a < 18) {
            a = 18;
        }

        /**
         * There are 95 departments in metropolitan France.
         */
        if(d < 1) {
            d = 1;
        }
        if (d > 95) {
            d = 95;
        }
    }

    /**
     * Get user informations :
     */
    private String getLastName() {
        return lastName;
    }
    private String getFirstName() {
        return firstName;
    }
    private int getAge() {
        return age;
    }
    private String getNationality() {
        return nationality;
    }
    private int getDepartment() {
        return department;
    }

    /**
     * Add a user :
     */
    public void setLastName(String l) {
        lastName = l;
    }
    public void setFirstName(String f) {
        firstName = f;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setNationality(String n) {
        nationality = n;
    }
    public void setDepartment(int d) {
        department = d;
    }
}
