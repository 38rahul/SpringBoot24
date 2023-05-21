package com.SpringBoot21.Repository;

import com.SpringBoot21.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
