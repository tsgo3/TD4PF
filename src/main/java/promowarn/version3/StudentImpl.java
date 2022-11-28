package promowarn.version3;

import promowarn.common.mail.EMailAddress;
import promowarn.version1.Student;

import java.util.Objects;
import java.util.Optional;

public class StudentImpl implements Student {
    private final Integer id;
    private final EMailAddress email;
    private Optional grade;

    public StudentImpl(final Integer id, final String email) {
        this.id = id;
        this.email = new EMailAddress(email);
        this.grade = null;
    }

    @Override
    public Integer id() {
        return id;
    }

    @Override
    public EMailAddress email() {
        return email;
    }

    @Override
    public Optional grade() {
        return grade;
    }

    @Override
    public void grade(final Optional grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final StudentImpl student = (StudentImpl) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
