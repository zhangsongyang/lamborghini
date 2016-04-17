package cn.xsh.lam.service.impl;

import cn.xsh.lam.repository.BaseRepository;
import cn.xsh.lam.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("baseService")
public class BaseServiceImpl implements BaseService {

	@Autowired
	@Qualifier("baseTwoRepositoryImpl")
    private BaseRepository baseRepository;


	public void saveService() {
        baseRepository.save();
        System.out.println("BaseServiceImpl.....");
    }

}
