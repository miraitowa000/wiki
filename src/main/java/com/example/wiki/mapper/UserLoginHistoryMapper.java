package com.example.wiki.mapper;

import com.example.wiki.domain.UserLoginHistory;
import java.util.List;

public interface UserLoginHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_history
     *
     * @mbg.generated
     */
    int insert(UserLoginHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_history
     *
     * @mbg.generated
     */
    List<UserLoginHistory> selectAll();
}