package web.finals6.repository;

import web.finals6.models.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PublicationRepository extends JpaRepository<Publication,Integer> {

    @Query("select p  from Publication p where p.id_type=:id")
    public List<Publication> findWhere(@Param("id") Integer id);

    @Query("select p from Publication p where p.id=:id")
    public List<Publication> findAllById(@Param("id")Integer id);


}
