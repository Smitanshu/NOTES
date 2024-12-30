package com.springBoot.notes;


public class StudentBean {
    private int id;
    private int roll;
    private String name;
    private String course;

    public void setId(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setRoll(int roll) {
        this.roll = roll;

    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;

    }

    public static void main(String[] args) {
        System.out.println("h");
    }

}
/*For Making bean Class Rules:
 * 1.Class Should be public and extended by the java.io.Serializable.
 * 2.Member variables should be  private.
 * 3.Getter setter method should be public.
 */
/*

POJO:Plain old Java Object
 * It should not be implementing or extending third party interface except the JDK(Like Runnable, Thread) module.
 * Which can be compiled by JDK libraries.
 * Exception:
 * public class pojo{
 *
 * void execute(){
 *
 *      //But in that some code written which needs third party technologies(means we not add external
 *      Jar files to run that module).
 *
 *      //Which can be compiled
 *     }
 * }

 */
