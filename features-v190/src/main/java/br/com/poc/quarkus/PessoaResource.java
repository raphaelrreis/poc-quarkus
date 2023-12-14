package br.com.poc.quarkus;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface PessoaResource extends PanacheEntityResource<Pessoa, Long> {
    
}
