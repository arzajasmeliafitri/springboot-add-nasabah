package id.project.spring.springbootaddnasabah.repository;

import id.project.spring.springbootaddnasabah.model.Nasabah;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddNasabahRepository extends CrudRepository<Nasabah, String> {
    Nasabah save(Nasabah nasabah);

}
