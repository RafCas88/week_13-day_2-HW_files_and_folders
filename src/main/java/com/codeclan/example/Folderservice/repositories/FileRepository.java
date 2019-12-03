package com.codeclan.example.Folderservice.repositories;

import com.codeclan.example.Folderservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
