package cn.xsh.lam.repository.impl;


import javax.sql.DataSource;

import cn.xsh.lam.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BaseRepositoryImpl implements BaseRepository {

	@Autowired
	private DataSource dataSource;
	
	
    public void save() {
        System.out.println("BaseRepositoryImpl....." + dataSource.getClass());
    }

}
