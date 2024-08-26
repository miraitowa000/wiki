package com.example.wiki.mapper;

import com.example.wiki.domain.UserAddr;
import java.util.List;

public interface UserAddrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_addr
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer addrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_addr
     *
     * @mbg.generated
     */
    int insert(UserAddr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_addr
     *
     * @mbg.generated
     */
    UserAddr selectByPrimaryKey(Integer addrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_addr
     *
     * @mbg.generated
     */
    List<UserAddr> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_addr
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserAddr record);
}