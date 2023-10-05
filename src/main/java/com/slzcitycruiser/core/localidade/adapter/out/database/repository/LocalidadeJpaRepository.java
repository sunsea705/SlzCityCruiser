package com.slzcitycruiser.core.localidade.adapter.out.database.repository;

import com.slzcitycruiser.core.localidade.adapter.out.database.entity.LocalidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalidadeJpaRepository extends JpaRepository<LocalidadeEntity, Long> {}
