package com.cgengwei.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

/**
 * Created by cgengwei
 * 2018/5/5 11:09
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @GetMapping("/girls")
    public List<Girl> getGirlList(){
        return girlRepository.findAll();
    }

    @PostMapping("/girls")
    public Girl addGirl(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }

    @GetMapping("/girls/{id}")
    public Girl findOneGirl(@PathVariable("id") Integer id){
        Optional<Girl> girl = girlRepository.findById(id);
        return girl.get();
    }

    @PutMapping("/girls/{id}")
    public Girl updateGirl(@PathVariable("id") Integer id,
                            @RequestParam("cupSize") String cupSize,
                            @RequestParam("age") Integer age){
        Optional<Girl> girlOptional = girlRepository.findById(id);
        Girl girl = null;
        if (!girlOptional.isPresent()){
            girl = new Girl();
        }else{
            girl = girlOptional.get();
        }
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    @DeleteMapping("/girls/{id}")
    public void deleteGirl(@PathVariable("id") Integer id){
        girlRepository.deleteById(id);
    }

    @GetMapping("/girls/addTwo")
    public void addTwo() throws Exception {
        girlService.addTwo();
    }

}
