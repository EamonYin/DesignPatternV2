package com.eamon.designpatternv2.SOLID.Single.Example2;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public List<Student> getStudentList(){
        // 模拟查数据库
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三",12));
        students.add(new Student("李四",78));
        students.add(new Student("王五",24));
        // 返回查询结果
        return students;
    }
}
