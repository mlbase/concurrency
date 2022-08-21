package com.example.stock.facade;

import com.example.stock.service.OptimisticLockService;
import org.springframework.stereotype.Service;

@Service
public class OptimisticLockFacade {

    private OptimisticLockService optimisticLockService;

    public OptimisticLockFacade(OptimisticLockService optimisticLockService) {
        this.optimisticLockService = optimisticLockService;
    }

    public void decrease(Long id, Long quantity) throws InterruptedException {
        while (true){
            try {
                optimisticLockService.decrease(id, quantity);

                break;
            } catch (Exception e) {
                Thread.sleep(50);
            }
        }
    }
}
