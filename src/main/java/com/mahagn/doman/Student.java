package com.mahagn.doman;

public class Student {
  private  int student_Id;

  private String studenT_Name;

  private String student_Add;

  private String student_Mo_No;

    public Student() {

    }

    public int getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }

    public String getStudenT_Name() {
        return studenT_Name;
    }

    public void setStudenT_Name(String studenT_Name) {
        this.studenT_Name = studenT_Name;
    }

    public String getStudent_Add() {
        return student_Add;
    }

    public void setStudent_Add(String student_Add) {
        this.student_Add = student_Add;
    }

    public String getStudent_Mo_No() {
        return student_Mo_No;
    }

    public void setStudent_Mo_No(String student_Mo_No) {
        this.student_Mo_No = student_Mo_No;
    }

    public Student(int student_Id, String studenT_Name, String student_Add, String student_Mo_No) {
        this.student_Id = student_Id;
        this.studenT_Name = studenT_Name;
        this.student_Add = student_Add;
        this.student_Mo_No = student_Mo_No;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_Id=" + student_Id +
                ", studenT_Name='" + studenT_Name + '\'' +
                ", student_Add='" + student_Add + '\'' +
                ", student_Mo_No='" + student_Mo_No + '\'' +
                '}';
    }
}
