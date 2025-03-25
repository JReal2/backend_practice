package com.fastcampus.fcboard.repository;

import com.fastcampus.fcboard.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
