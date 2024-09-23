package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.oop.Member;

public class JDBCConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String uri = "jdbc:mariadb://127.0.0.1:3306/webdev";
        String userid = "webmaster";
        String userpw = "12345";
        String query = "select name,gender,age from tbl_test";

        Connection con;
        Statement stmt;
        ResultSet rs;

        //JDBC 드라이버 연결
        Class.forName("org.mariadb.jdbc.Driver");

        //DBMS와 연결
        con = DriverManager.getConnection(uri, userid, userpw);
        //연결 시 명령문 전달 계통 설정
        stmt = con.createStatement();
        //SQL을 실행시키고 그 결과(데이터셋: Data Set)
        rs = stmt.executeQuery(query);

        
        // ArrayList<Member> list;        
        // list = new ArrayList<Member>();
        List<Member> list = new ArrayList();
        
        
        while(rs.next()){ //rs.next()가 false(행끝남)를 반환할떄까지 루핑


            list.add(new Member(rs.getString("name"),rs.getString("gender"), rs.getInt("age")));

        }
        
        /*
        while(rs.next()){
            System.out.println(rs.getString("name") + "\t" + rs.getString("gender") + "\t" + rs.getInt("age"));
        }
        */

        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(con != null) con.close();

        list.stream().forEach(s->{
                System.out.println("이름 : "+ s.getName() + "\t"
                + "성별 : " + s.getGender() + "\t"
                + "나이 : " + s.getAge()
                );
        });

    }

}

