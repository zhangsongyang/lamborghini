package cn.xsh.lam.repository.impl;

import cn.xsh.lam.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class BaseTwoRepositoryImpl implements BaseRepository{

    @Autowired
    private DataSource dataSource;


    public void save() {
        System.out.println("BaseTwoRepositoryImpl....." + dataSource.getClass());
    }


}
