package com.iflix.iflix.DAO;

import com.iflix.iflix.Entities.Directors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorsRepository extends JpaRepository<Directors, String> {
}