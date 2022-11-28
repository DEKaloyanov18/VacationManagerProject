package com.example.vacationmanagerproject.dao;

import com.example.vacationmanagerproject.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, String> {


}