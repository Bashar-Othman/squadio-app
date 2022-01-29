package com.squadio.entity.repository;

import com.squadio.entity.Account;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BasharOthman
 */
@Repository
public interface AccountRepo extends JpaRepository<Account, String> {

    public List<Account> findByUserid(String userid);

}
