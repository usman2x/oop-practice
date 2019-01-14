package practice.design.patterns.builder;

import practice.constants.MartialStatus;
import practice.constants.SEX;

public class BuilderApp {
    public static void main(String[] args) {
        PersonPerforma personPerforma1 = new PersonPerforma.PersonBuilder("usman").build();
        PersonPerforma personPerforma2 = new PersonPerforma.PersonBuilder("usman")
                .withAge("26")
                .withMartialStatus(MartialStatus.MARRIED)
                .withSex(SEX.MALE)
                .build();
    }
}
