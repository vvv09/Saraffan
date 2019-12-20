package com.valunskii.saraffan.repo;

import com.valunskii.saraffan.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
