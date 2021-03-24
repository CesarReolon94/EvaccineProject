package br.com.cesarreolon.fullstackweek.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cesarreolon.fullstackweek.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
