package practice.design.patterns.builder;

import practice.constants.MartialStatus;
import practice.constants.SEX;

public class BuilderApp {
    public static void main(String[] args) {
        PersonPerforma personPerforma1 = new PersonPerforma.PersonBuilder("Dummy").build();
        PersonPerforma personPerforma2 = new PersonPerforma.PersonBuilder("Dummy 2")
                .withAge("134")
                .withMartialStatus(MartialStatus.MARRIED)
                .withSex(SEX.MALE)
                .build();
    }
}
