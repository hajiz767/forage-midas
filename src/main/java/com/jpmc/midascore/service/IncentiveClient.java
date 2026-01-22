
// sends transaction as JSON. receives Incentives as Java object
// no manual JSON handling needed.

package com.jpmc.midascore.service;

import com.jpmc.midascore.foundation.Incentive;
import com.jpmc.midascore.foundation.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class IncentiveClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public Incentive fetchIncentive(Transaction transaction) {
        return restTemplate.postForObject(
                "http://localhost:8080/incentive",
                transaction,
                Incentive.class
        );
    }
}

