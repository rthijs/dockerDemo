package dockerdemo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface QuoteRepository extends CrudRepository<Quote, Long> {

    List<Quote> findByAuthor(String author);
    
    @Query("select q from Quote q order by random()") //JPQL doesn't understand limit 1
    List<Quote> findRandom();
}