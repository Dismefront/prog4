package changes;

import abstractions.MessageProcesser;

public class AuthorWords {

    public static void sayHardJob() {
        MessageProcesser.begin().reportCustom("Нетрудно представить, " +
                "какая это была сложная работа");
    }

}
