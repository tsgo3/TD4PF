package promowarn.version3;

import promowarn.common.mail.EMailAddress;

import java.util.Optional;

public interface Student {
    Integer id();

    EMailAddress email();

    Optional grade();

    void grade(final Optional grade);
}
