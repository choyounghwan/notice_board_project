package com.example.notice_board.repository;

import com.example.notice_board.entity.BoardFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface BoardFileRepository extends JpaRepository<BoardFileEntity, Long> {
    @Transactional
    @Modifying
    @Query("delete from BoardFileEntity bfe where bfe.secondId = :secondId")
    void deleteBySecondId(@Param("secondId") Long secondId);
}
