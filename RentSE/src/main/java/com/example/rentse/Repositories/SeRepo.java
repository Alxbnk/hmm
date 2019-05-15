package com.example.rentse.Repositories;

import com.example.rentse.Models.SE;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeRepo {

    List<SE> getSE();
}
