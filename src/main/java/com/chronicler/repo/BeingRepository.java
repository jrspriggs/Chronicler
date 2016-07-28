package com.chronicler.repo;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.chronicler.model.Being;
import com.chronicler.model.Involvement;

@RepositoryRestResource(collectionResourceRel = "beings", path = "beings")
public interface BeingRepository extends PagingAndSortingRepository<Being, Long> {
	List<Being> findByLastName(@Param("name") String name);
	List<Being> findByHero(@Param("hero") boolean hero);
	List<Being> findByVillain(@Param("villain") boolean villain);
}
