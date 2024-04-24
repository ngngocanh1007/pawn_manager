package com.pawn_manager.repository;

import com.pawn_manager.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findOneByEmailAndStatus(String email, int status);
}
