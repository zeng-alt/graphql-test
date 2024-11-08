package com.zjj.graphqltest.repository;

import com.zjj.graphqltest.domain.Address;
import com.zjj.graphqltest.domain.Users;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.graphql.data.GraphQlRepository;

/**
 * @author zengJiaJun
 * @version 1.0
 * @crateTime 2024年11月08日 10:34
 */
@GraphQlRepository
public interface AddressRepository extends Repository<Address, Long>, QuerydslPredicateExecutor<Address>, QueryByExampleExecutor<Address> {
}
