package service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.quality;

import dao.qualityMapper;

@Service("hs")
public class qualityServiceImpl implements qualityService {

	@Autowired
	private qualityMapper qm;

	public qualityMapper getQm() {
		return qm;
	}

	public void setQm(qualityMapper qm) {
		this.qm = qm;
	}
	public List<quality> getAll(int begin,int count){
		return qm.getAll(begin, count);
	}
	public int count(){
		return qm.count();
	}
	public int insert(quality q){
		return qm.insert(q);
	}
}
