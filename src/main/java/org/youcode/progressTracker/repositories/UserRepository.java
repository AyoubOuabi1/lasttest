package org.youcode.progressTracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.youcode.progressTracker.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
}
