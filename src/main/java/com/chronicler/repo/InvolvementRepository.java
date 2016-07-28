package com.chronicler.repo;



import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.chronicler.model.Involvement;

@RepositoryRestResource(collectionResourceRel = "involvements", path = "involvements")
public interface InvolvementRepository extends PagingAndSortingRepository<Involvement, Long> {
}
