package br.com.fiap.shiftweb6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.shiftweb6.model.LojaModel;

public interface LojaRepository extends JpaRepository <LojaModel, Long> {

}
