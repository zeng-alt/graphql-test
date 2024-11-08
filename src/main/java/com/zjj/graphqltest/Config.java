package com.zjj.graphqltest;

import com.zjj.graphqltest.repository.UsersRepository;
import graphql.schema.idl.RuntimeWiring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.data.query.QuerydslDataFetcher;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

/**
 * @author zengJiaJun
 * @version 1.0
 * @crateTime 2024年11月08日 21:28
 */
@Configuration
public class Config {

    @Bean
    public RuntimeWiringConfigurer configure(UsersRepository usersRepository) {

        return new RuntimeWiringConfigurer() {

            @Override
            public void configure(RuntimeWiring.Builder builder) {
                builder.type("Query", typeWiring -> {
                    typeWiring.dataFetcher("findAllUsers", QuerydslDataFetcher.builder(usersRepository).many());
                    return typeWiring;
                });
            }
        };
    }
}
