package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private static String topic;
    private static Teacher instructor;
    private static ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.


    public static String getTopic() {
        return topic;
    }

    public static void setTopic(String topic) {
        Course.topic = topic;
    }

    public static Teacher getInstructor() {
        return instructor;
    }

    public static void setInstructor(Teacher instructor) {
        Course.instructor = instructor;
    }

    public static ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public static void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        Course.enrolledStudents = enrolledStudents;
    }

    @Override
    public String toString() {
        String  courseReport = String.format("Course info: ", this.topic, this.instructor, this.enrolledStudents);
        return courseReport;

    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    @Override
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        Course theCourse = (Course) toBeCompared;

        return Objects.equals(topic, Course.topic) && Objects.equals(instructor, Course.instructor) && Objects.equals(enrolledStudents, Course.enrolledStudents);
    }


    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor, enrolledStudents);
    }
}
