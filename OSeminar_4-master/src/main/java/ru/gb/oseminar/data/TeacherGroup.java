package ru.gb.oseminar.data;

import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teachers;
    private Student student;

    public TeacherGroup(Student student, List<Teacher> teachers) {
        this.teachers = teachers;
        this.student = student;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }


    @Override
    public String toString() {
        return "TeacherGroup{" +
               "teachers=" + teachers +
                '}';
    }

    @Override
    public TeacherGroupIterator iterator() {
        return new TeacherGroupIterator(this);
    }
}