package service;

import java.util.List;



import pojo.quality;

public interface qualityService {

	public List<quality> getAll(int begin,int count);
	public int count();
	public int insert(quality q);
}
