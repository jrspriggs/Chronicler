package com.chronicler.repo;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.chronicler.model.Story;

@RepositoryRestResource(collectionResourceRel = "stories", path = "stories")
public interface StoryRepository extends PagingAndSortingRepository<Story, Long> {}
