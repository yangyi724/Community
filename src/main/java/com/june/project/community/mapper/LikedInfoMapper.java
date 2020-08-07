package com.june.project.community.mapper;

import com.june.project.community.model.LikedInfo;
import com.june.project.community.model.LikedInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LikedInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likedinfo
     *
     * @mbg.generated Thu Aug 06 16:22:14 CST 2020
     */
    long countByExample(LikedInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likedinfo
     *
     * @mbg.generated Thu Aug 06 16:22:14 CST 2020
     */
    int deleteByExample(LikedInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likedinfo
     *
     * @mbg.generated Thu Aug 06 16:22:14 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likedinfo
     *
     * @mbg.generated Thu Aug 06 16:22:14 CST 2020
     */
    int insert(LikedInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likedinfo
     *
     * @mbg.generated Thu Aug 06 16:22:14 CST 2020
     */
    int insertSelective(LikedInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likedinfo
     *
     * @mbg.generated Thu Aug 06 16:22:14 CST 2020
     */
    List<LikedInfo> selectByExampleWithRowbounds(LikedInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likedinfo
     *
     * @mbg.generated Thu Aug 06 16:22:14 CST 2020
     */
    List<LikedInfo> selectByExample(LikedInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likedinfo
     *
     * @mbg.generated Thu Aug 06 16:22:14 CST 2020
     */
    LikedInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likedinfo
     *
     * @mbg.generated Thu Aug 06 16:22:14 CST 2020
     */
    int updateByExampleSelective(@Param("record") LikedInfo record, @Param("example") LikedInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likedinfo
     *
     * @mbg.generated Thu Aug 06 16:22:14 CST 2020
     */
    int updateByExample(@Param("record") LikedInfo record, @Param("example") LikedInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likedinfo
     *
     * @mbg.generated Thu Aug 06 16:22:14 CST 2020
     */
    int updateByPrimaryKeySelective(LikedInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likedinfo
     *
     * @mbg.generated Thu Aug 06 16:22:14 CST 2020
     */
    int updateByPrimaryKey(LikedInfo record);
}