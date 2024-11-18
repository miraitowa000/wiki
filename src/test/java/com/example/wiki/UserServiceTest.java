package com.example.wiki;

import com.example.wiki.common.utils.MD5Utils;
import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.domain.Users;
import com.example.wiki.mapper.UsersMapper;
import com.sun.org.apache.xerces.internal.xni.Augmentations;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Date;
import java.util.stream.Stream;

import com.example.wiki.service.impl.UserServiceImpl;
@SpringBootTest
public class UserServiceTest {

	@Mock
	private UsersMapper usersMapper; // 模拟 UsersMapper 依赖

	@InjectMocks
	private UserServiceImpl userService; // 需要测试的 UserService 实例

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this); // 初始化 Mockito
	}

	@ParameterizedTest
	@MethodSource("userData")
	// @DisplayName("用户注册成功")
	public void testUserRegister_Success(String username,String password,Integer expected,String expectedMessage) {
		// 设置用户名不存在的情况
		when(usersMapper.queryUserByName(username)).thenReturn(null);
		when(usersMapper.insertUser(any(Users.class))).thenReturn(1); // 模拟成功插入记录

		ResultVO result = userService.userRegister(username, password);

		// 验证返回结果
		assertEquals(expected, result.getCode());
		assertEquals(expectedMessage, result.getMessage());
	}
	static Stream<Arguments> userData() {
		return Stream.of(
				Arguments.of("test", "123456", 10000, "注册成功"),
				Arguments.of("test", "123456", 10000, "用户名已存在1"),
				Arguments.of("test", "123456", 10001, "用户名已存在1")
		);
	}
}



