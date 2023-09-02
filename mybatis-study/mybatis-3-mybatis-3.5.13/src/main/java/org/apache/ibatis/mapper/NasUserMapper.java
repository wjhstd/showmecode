package org.apache.ibatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.entity.NasUser;

@Mapper
public interface NasUserMapper {
    int deleteByPrimaryKey(Integer paramLong);

    int insertSelective(NasUser paramNasUser);

    NasUser selectByPrimaryKey(Integer id);

    @Select("select count(*) from nas_user where user_name=#{userName} or real_name=#{realName}")
    int checkUserExist(@Param("userName") String userName, @Param("realName") String realName);
}
