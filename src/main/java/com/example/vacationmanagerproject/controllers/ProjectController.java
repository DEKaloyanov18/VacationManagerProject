package com.example.vacationmanagerproject.controllers;

import com.example.vacationmanagerproject.dao.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping("/goToProjectsInfoPage")
    public java.lang.String projectsInfoPage() {
        return "projectsInfo";
    }

    @RequestMapping(value = "/projectsInfo")
    public java.lang.String getAllProjects(Model model) {
        model.addAttribute("projects", projectRepository.findAll());
        return "projectsInfo";
    }
}