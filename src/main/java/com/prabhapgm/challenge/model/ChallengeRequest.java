package com.prabhapgm.challenge.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/*
 * $$	  $$ $$$$$$ $$$$$$ $$      $$    $$     $$   $$
 * $$     $$ $$     $$     $$      $$   $$ $$    $$ $$ 
 * $$     $$ $$$$   $$$$$  $$  $$  $$  $$$$$$$     $$
 * $$     $$ $$     $$      $$ $$ $$   $$   $$     $$
 * $$$$$$ $$ $$     $$$$$$   $$ $$     $$   $$     $$
 */

@Entity
public class ChallengeRequest {

    @Id
    @NotNull
    @Min(0)
    @NotBlank
    private String id;

    @NotNull
    @NotBlank
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
