package promowarn.version1;

import promowarn.common.mail.EMailAddress;

import java.util.Optional;

public interface Student {
    Integer id();

    EMailAddress email();

    Optional grade();

    void grade(final double grade);

    void grade(Optional grade);
}
