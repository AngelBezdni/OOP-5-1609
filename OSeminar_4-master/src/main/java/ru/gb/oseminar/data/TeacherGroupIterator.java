package ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {

    private int counter;
    private final List<Teacher> teachers;

    public TeacherGroupIterator(TeacherGroup teacherGroup) {
        this.teachers = teacherGroup.getTeachers();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < teachers.size() - 1;
    }

    @Override
    public Teacher next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return teachers.get(counter);
    }
}