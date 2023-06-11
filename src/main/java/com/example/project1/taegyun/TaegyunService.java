package com.example.project1.taegyun;

import com.example.project1.taegyun.model.TaegyunModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaegyunService {

    @Autowired
    private TaegyunRepository taegyunRepository;


    public TaegyunModel transformData() {
        TaegyunModel taegyunModel = new TaegyunModel();
        String data = taegyunRepository.getData();
        taegyunModel.setName(data.split(",")[0]);
        taegyunModel.setAge(data.split(",")[1]);
        return taegyunModel;
    }

}
