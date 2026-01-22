package com.jpmc.midascore.controller;

import com.jpmc.midascore.entity.UserRecord;
import com.jpmc.midascore.foundation.Balance;
import com.jpmc.midascore.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BalanceController {

    private final UserRepository userRepository;

    public BalanceController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/balance")
    public Balance getBalance(@RequestParam long userId) {
        // Fetch user using the standard CrudRepository method
        Optional<UserRecord> optionalUser = userRepository.findById(userId);

        // Use Optional.map to safely extract balance or default to 0
        float amount = optionalUser.map(UserRecord::getBalance).orElse(0f);

        // Return a Balance object
        return new Balance(amount);
    }
}
