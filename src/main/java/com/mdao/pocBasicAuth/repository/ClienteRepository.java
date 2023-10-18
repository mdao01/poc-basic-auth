package com.mdao.pocBasicAuth.repository;

import com.mdao.pocBasicAuth.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository  extends JpaRepository<Cliente, Long> {
}
