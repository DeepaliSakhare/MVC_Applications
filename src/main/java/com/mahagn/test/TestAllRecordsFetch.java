package com.mahagn.test;

import com.mahagn.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class TestAllRecordsFetch {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("application-context.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        studentDao.getStudentRecords();//getallrecords
        System.out.println(studentDao);//src/main/resources/application-context.xml
    }

}
