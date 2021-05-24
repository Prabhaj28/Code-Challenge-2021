package com.prabhapgm.challenge.service;

import com.prabhapgm.challenge.model.ChallengeRequest;
import com.prabhapgm.challenge.model.ChallengeResponse;

import com.prabhapgm.challenge.repository.ChallengeRequestDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/*
 * $$	  $$ $$$$$$ $$$$$$ $$      $$    $$     $$   $$
 * $$     $$ $$     $$     $$      $$   $$ $$    $$ $$ 
 * $$     $$ $$$$   $$$$$  $$  $$  $$  $$$$$$$     $$
 * $$     $$ $$     $$      $$ $$ $$   $$   $$     $$
 * $$$$$$ $$ $$     $$$$$$   $$ $$     $$   $$     $$
 */

@Service
@Component
public class ChallengeService {
  private static final Logger log = LoggerFactory.getLogger(ChallengeService.class);

    private static int counter  =   0;

    @Autowired
    private ChallengeRequestDAO challengeRequestDAO;


    public ResponseEntity messageCounter (ChallengeRequest challengeRequest)  {
        try {
            //Validate If id already exist
            if(!challengeRequestDAO.existsById(challengeRequest.getId())) {
                //if not exist add number of character to counter
               // hashMap.putIfAbsent(challengeRequest.getId(), challengeRequest.getMessage());
                challengeRequestDAO.save(challengeRequest);
                int count = 0;
                for(int i = 0; i < challengeRequest.getMessage().length(); i++) {
                    if(challengeRequest.getMessage().charAt(i) != ' ')
                        count++;
                }
                counter =   counter + count;
            } else {
                //If already exist no logic requiredHSQLDB (Local)
                //log.info("Id already exist");
                System.out.println(challengeRequestDAO.getOne(challengeRequest.getId()).getMessage());
                System.out.println("Id already exist");
            }
            ChallengeResponse challengeResponse =   new ChallengeResponse();
            challengeResponse.setCount(counter);

            return ResponseEntity.status(HttpStatus.ACCEPTED).body(challengeResponse);
        } catch (Exception e) {
            System.out.println("Exception in messageCounter : "+e);
            throw e;
        }


    }
}
