package cn.xsh.lam.service.impl;

import cn.xsh.lam.repository.BaseRepository;
import cn.xsh.lam.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BaseServiceImpl implements BaseService {

	@Autowired
    private BaseRepository baseRepository;
    
	public void setBaseRepository(BaseRepository baseRepository) {
		this.baseRepository = baseRepository;
	}


	public void saveService() {
		
        baseRepository.save();
        System.out.println("BaseServiceImpl.....");
    }

}
