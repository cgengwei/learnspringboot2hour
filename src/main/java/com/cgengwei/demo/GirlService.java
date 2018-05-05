package com.cgengwei.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by cgengwei
 * 2018/5/5 13:17
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;


    @Transactional()
    public void addTwo() throws Exception {

        Girl girlA = new Girl();
        girlA.setAge(50);
        girlA.setCupSize("C");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(51);
        girlB.setCupSize("D");
        if (true){
            throw new Exception("错误了");
        }
        girlRepository.save(girlB);

    }

}
