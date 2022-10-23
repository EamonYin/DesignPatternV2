package com.eamon.designpatternv2.SOLID.Single.Example2;

import java.util.List;

public class StudentChart {
    StudentDao dao;

    public void setDao(StudentDao dao){
        this.dao = dao;
    }
    public void showChart(){
        List<Student> studentList = dao.getStudentList();
        for (Student stu : studentList) {
            System.out.println("Name:" + stu.getName() + " Age:" + stu.getAge());
        }
    }
}
