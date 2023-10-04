package com.slzcitycruiser.core.linha.adapter.out.database.repository;

import com.slzcitycruiser.core.linha.adapter.out.database.model.Linha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinhaJpaRepository extends JpaRepository<Linha, Long> {}
