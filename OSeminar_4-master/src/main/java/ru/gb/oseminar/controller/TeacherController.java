package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.TeacherService;
import ru.gb.oseminar.view.TeacherView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private final TeacherService dataService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

    public void createTeacherGroup(Teacher teacher, List<Teacher> teachers){
        dataService.createTeacherGroup(teacher, teachers);
        teacherView.sendOnConsoleUserGroup(dataService.getTeacherGroup());
    }

    public void getTeacherInTeacherGroup(String firstName, String secondName){
        Teacher teacher = dataService.getTeacherFromTeacherGroup(firstName, secondName);
        teacherView.sendOnConsole(Collections.singletonList(teacher));
    }

    public void getSortedListTeacherFromTeacherGroup(){
        List<Teacher> teachers = dataService.getSortedTeacherGroup();
        teacherView.sendOnConsole(teachers);
    }

    public void getSortedListByFIOTeacherFromTeacherGroup(){
        List<Teacher> teachers = dataService.getSortedByFIOTeacherGroup();
        teacherView.sendOnConsole(teachers);
    }
}