package dev.gunlog.app.domain;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AcademyRepositorySupport extends org.springframework.data.jpa.repository.support.QuerydslRepositorySupport {
    private final JPAQueryFactory queryFactory;

    public AcademyRepositorySupport(JPAQueryFactory queryFactory){
        super(Academy.class);
        this.queryFactory = queryFactory;
    }
    public List<Academy> findByName(String name){
        return null;
//        return queryFactory;
//                .selectFrom(academy)
//                .where(academy.name)
    }
}