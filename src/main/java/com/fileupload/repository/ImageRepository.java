package com.fileupload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fileupload.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{

}
