package com.ebezdomnikov.permission.bootstrap;

import com.ebezdomnikov.permission.domain.model.Action;
import com.ebezdomnikov.permission.domain.model.SecurityResource;
import com.ebezdomnikov.permission.domain.model.SecurityScope;
import com.ebezdomnikov.permission.domain.repository.SecurityResourceRepository;
import com.ebezdomnikov.permission.domain.repository.SecurityScopeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataPreparator implements CommandLineRunner {

    private final SecurityResourceRepository securityResourceRepository;

    private final SecurityScopeRepository securityScopeRepository;

    public DataPreparator(SecurityResourceRepository securityResourceRepository, SecurityScopeRepository securityScopeRepository) {
        this.securityResourceRepository = securityResourceRepository;
        this.securityScopeRepository = securityScopeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        SecurityScope index = new SecurityScope(Action.INDEX);
        SecurityScope show = new SecurityScope(Action.SHOW);

        this.securityScopeRepository.save(index);
        this.securityScopeRepository.save(show);

        SecurityResource resource = new SecurityResource("resource:1");

        resource.addScope(index)
                .addScope(show);

        // todo add more dummy data
        this.securityResourceRepository.save(resource);
        this.securityResourceRepository.save(new SecurityResource("resource:2"));
    }
}
