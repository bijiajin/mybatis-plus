package com.baomidou.mybatisplus.test.h2.entity.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.test.h2.entity.persistent.H2UserDateVersion;

/**
 * <p>
 * H2User without version column
 * </p>
 *
 * @author Caratacus
 * @date 2017/4/1
 */
public interface H2UserDateVersionMapper extends BaseMapper<H2UserDateVersion> {

    @Insert(
            "insert into h2user(name,version) values(#{name},#{version})"
    )
    public int myInsertWithNameVersion(@Param("name") String name, @Param("version") int version);

    @Update(
            "update h2user set name=#{name} where test_id=#{id}"
    )
    public int myUpdateWithNameId(@Param("id") Long id, @Param("name") String name);
}
