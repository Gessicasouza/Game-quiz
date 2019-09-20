package br.com.game.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.game.models.User;

@Repository
public interface UserRespository extends CrudRepository<User, Long >{

}
