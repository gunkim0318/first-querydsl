package dev.gunlog.app.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AcademyRepository extends JpaRepository<Academy, Long> {
}