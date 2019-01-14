package practice.design.patterns.builder;

import practice.constants.MartialStatus;
import practice.constants.SEX;

public class PersonPerforma {
    private String name;
    private String age;
    private MartialStatus martialStatus;
    private SEX sex;

    public PersonPerforma(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.age = personBuilder.age;
        this.martialStatus = personBuilder.martialStatus;
        this.sex = personBuilder.sex;
    }

    public static class PersonBuilder {
        private String name;
        private String age;
        private MartialStatus martialStatus;
        private SEX sex;

        public PersonBuilder(String name) {
            if (name == null) {
                throw new IllegalArgumentException("Name can not be null");
            }
            this.name = name;
        }

        public PersonBuilder withAge(String age) {
            this.age = age;
            return this;
        }

        public PersonBuilder withMartialStatus(MartialStatus status) {
            this.martialStatus = status;
            return this;
        }

        public PersonBuilder withSex(SEX sex) {
            this.sex = sex;
            return this;
        }

        public PersonPerforma build() {
            return new PersonPerforma(this);
        }
    }
}
