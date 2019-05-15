package com.example.rentse.Services;

import com.example.rentse.Models.SE;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeService {

    List<SE> getSE();
}
