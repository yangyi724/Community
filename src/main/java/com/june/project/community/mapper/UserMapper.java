package com.june.project.community.mapper;

import com.june.project.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author June
 * @date 2020/6/30 - 22:22
 */
@Repository
@Mapper
public interface UserMapper {
    @Insert("insert into user (name, account_id, token, gmt_create, gmt_modified, avatar_url) values (#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified}, #{avatarUrl})")
    void insert(User user);

    // @Param("token")
    @Select("select * from user where token = #{token_}")
    User findByToken(@Param("token_") String token);

    @Select("select * from user where id = #{id_}")
    User findById(@Param("id_") Integer id);
}
