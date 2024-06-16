package org.example.usercenterserver;

import jakarta.annotation.Resource;
import org.example.usercenterserver.mapper.UserMapper;
import org.example.usercenterserver.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
class UserCenterServerApplicationTests {

    @Resource
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        System.out.println("----- selectAll method test ------");
        List<User> userList = userMapper.selectList(null);
        assertNotNull(userList); // 确保返回的列表不是null
        // 这里我们假设数据库中至少有一些用户，但我们不假设具体的数量
        if (userList.size() > 0) {
            // 打印所有用户信息
            userList.forEach(System.out::println);
            // 如果你确实想断言有5个用户（这通常不推荐），可以这样写：
            // assertEquals("Expected 5 users but found " + userList.size(), 5, userList.size());
        } else {
            // 如果数据库中一个用户都没有，你可能想要决定是失败测试还是简单地记录一个消息
            // fail("No users found in the database"); // 如果你想要测试失败
            System.out.println("No users found in the database"); // 或者只是记录一个消息
        }
    }

}
