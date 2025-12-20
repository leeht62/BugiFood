package com.milkit_shop.repository;

import com.milkit_shop.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long>{
  @Query("select c from Comment c join fetch c.member where c.board.id = :boardId")
  List<Comment> findByBoardId(@Param("boardId") Long boardId);
}
