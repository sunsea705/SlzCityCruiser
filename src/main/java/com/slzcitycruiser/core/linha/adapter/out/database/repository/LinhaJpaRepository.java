package com.slzcitycruiser.core.linha.adapter.out.database.repository;

import com.slzcitycruiser.core.linha.adapter.out.database.entity.LinhaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinhaJpaRepository extends JpaRepository<LinhaEntity, Long> {}
