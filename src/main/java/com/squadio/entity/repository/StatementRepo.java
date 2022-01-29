package com.squadio.entity.repository;

import com.squadio.entity.Account;
import com.squadio.entity.Statement;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BasharOthman
 */
@Repository
public interface StatementRepo extends JpaRepository<Statement, String> {
    
    
    public List<Statement> findByAccountId(String accountId);

}
