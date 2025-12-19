package com.codingshuttle.Aryan.prod_ready_features.Auth;
import org.springframework.data.domain.AuditorAware;
import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        //get security context.
        //get authentication .
        //get user credentials.
        //get user name.
        //after that we can use it by creating a bean of it.
        return Optional.of("Aryan Kiran");
    }
}
