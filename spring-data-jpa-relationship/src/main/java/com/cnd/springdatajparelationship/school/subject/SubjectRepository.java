package com.cnd.springdatajparelationship.school.subject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
