package com.mahagn.dao;

import com.mahagn.doman.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    private final JdbcTemplate jdbcTemplate;
    private final String SQL_FOR_STUDENTS ="SELECT * FROM STUDENT";


    public StudentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void getStudentRecords(){
        List<List<Student>> boList = jdbcTemplate.query(SQL_FOR_STUDENTS, new StudentRowMapper());
        for (List<Student>list: boList){
            for (Student studentBo :list) {
                System.out.println(studentBo);
            }
            System.out.println();
        }
    }
   private final class StudentRowMapper implements RowMapper<List<Student>>{

       @Override
       public List<Student> mapRow(ResultSet rs, int rowNum) throws SQLException {
           List<Student> studentList = new ArrayList<Student>();
           while (rs.next()){
               Student st = new Student();
               st.setStudent_Id(rs.getInt(1));
               st.setStudenT_Name(rs.getString(2));
               st.setStudent_Add(rs.getString(3));
               st.setStudent_Mo_No(rs.getString(4));

               studentList.add(st);
           }

           return studentList;
       }
   }
}
