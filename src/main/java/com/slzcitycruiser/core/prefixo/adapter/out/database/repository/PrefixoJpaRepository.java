package com.slzcitycruiser.core.prefixo.adapter.out.database.repository;

import com.slzcitycruiser.core.prefixo.adapter.out.database.entity.PrefixoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrefixoJpaRepository extends JpaRepository<PrefixoEntity, Long> {}
