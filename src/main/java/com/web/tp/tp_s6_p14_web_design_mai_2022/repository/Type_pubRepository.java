package com.web.tp.tp_s6_p14_web_design_mai_2022.repository;

import com.web.tp.tp_s6_p14_web_design_mai_2022.models.Type_pub;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface Type_pubRepository extends JpaRepository<Type_pub,Integer> {
}
