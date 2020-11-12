package com.walker.dao;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.walker.user.User;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static SqlSessionFactory sqlSessionFactory;
    static {

        InputStream resourceStream = null;
        try {
            resourceStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceStream);

    }

    //mybatis中必有的一个操作，获取SqlSession
    public static final SqlSession session =  sqlSessionFactory.openSession();

    public static final UserMapper userManager = session.getMapper(UserMapper.class);

    public static void printUsers() {
        List<User> list = userManager.getUsers();
        for (User user : list) {
            System.out.println(user);
        }
    }
    public static void main(String[] args) {

        //session获取接口，映射成一个接口实现类
        printUsers();

        User user = userManager.getUserById("2019210971");
        System.out.println(user);

//        for (int i = 100; i < 900; i++) {
//            userManager.addUser(User.createUser("Walker" + i, "2019210" + i, "00000000"));
//        }


//        session.commit();

        printUsers();


        session.close();
    }
}
