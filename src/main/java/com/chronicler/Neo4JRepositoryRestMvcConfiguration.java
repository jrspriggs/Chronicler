package com.chronicler;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.chronicler.model.Being;
import com.chronicler.model.Involvement;
import com.chronicler.model.Story;

@Configuration
public class Neo4JRepositoryRestMvcConfiguration extends RepositoryRestMvcConfiguration  {
	@Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Being.class);
        config.exposeIdsFor(Story.class);
        config.exposeIdsFor(Involvement.class);
    }
}