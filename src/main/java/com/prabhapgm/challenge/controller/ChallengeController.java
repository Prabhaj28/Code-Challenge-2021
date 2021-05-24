package com.prabhapgm.challenge.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prabhapgm.challenge.model.ChallengeRequest;
import com.prabhapgm.challenge.service.ChallengeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/*
 * $$	  $$ $$$$$$ $$$$$$ $$      $$    $$     $$   $$
 * $$     $$ $$     $$     $$      $$   $$ $$    $$ $$ 
 * $$     $$ $$$$   $$$$$  $$  $$  $$  $$$$$$$     $$
 * $$     $$ $$     $$      $$ $$ $$   $$   $$     $$
 * $$$$$$ $$ $$     $$$$$$   $$ $$     $$   $$     $$
 */

@RestController
@RequestMapping("/")
public class ChallengeController {

    private static final Logger log = LoggerFactory.getLogger(ChallengeController.class);
    @Autowired
    private  ChallengeService challengeService;

    @ResponseBody
    @RequestMapping(value = "/challenge/v1", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> messageReceiver(@Valid @RequestBody ChallengeRequest challengeRequest) throws Exception {
        //log.info("Controller : message=", new ObjectMapper().writeValueAsString(challengeRequest));
        System.out.println("messageReceiver : "+challengeRequest.getMessage());
        return challengeService.messageCounter(challengeRequest);
    }


}