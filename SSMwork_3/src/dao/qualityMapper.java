package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.quality;

public interface qualityMapper {

	public List<quality> getAll(@Param("a")int begin,@Param("b")int count);

	public int count();
	
	public int insert(quality q);

}
