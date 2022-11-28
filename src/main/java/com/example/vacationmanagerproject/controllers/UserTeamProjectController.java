package com.example.vacationmanagerproject.controllers;

import com.example.vacationmanagerproject.dao.UserTeamProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserTeamProjectController {

    @Autowired
    UserTeamProjectRepository userTeamProjectRepository;


}