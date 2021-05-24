package com.prabhapgm.challenge.repository;

import com.prabhapgm.challenge.model.ChallengeRequest;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * $$	  $$ $$$$$$ $$$$$$ $$      $$    $$     $$   $$
 * $$     $$ $$     $$     $$      $$   $$ $$    $$ $$ 
 * $$     $$ $$$$   $$$$$  $$  $$  $$  $$$$$$$     $$
 * $$     $$ $$     $$      $$ $$ $$   $$   $$     $$
 * $$$$$$ $$ $$     $$$$$$   $$ $$     $$   $$     $$
 */

public interface ChallengeRequestDAO extends JpaRepository<ChallengeRequest, String> {
}
