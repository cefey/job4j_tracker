package inheritance;

import java.util.Date;

public class Engineer extends Profession {

    private int experience;

    public Engineer(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);
    }

    public Engineer(int experienc, boolean degree) {
        super(degree);
        this.experience = experience;
    }
    }


