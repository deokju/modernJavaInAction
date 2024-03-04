package p_consumer;

import java.util.List;
import java.util.Objects;

public class ExConsumer01 {
    public static void main(String[] args) {
        List<ParamVO> paramVOList = List.of(
                new ParamVO("user1", "user1@java8.com","user1")
                ,new ParamVO("user2", "user2@java8.com","user2")
                ,new ParamVO("user3", "user3@java8.com","user3")
                ,new ParamVO("user4", "user4@java8.com","user4")
                ,new ParamVO("user5", "user5@java8.com",null)
        );
        paramVOList.forEach(u -> {
            Objects.requireNonNull(u.getUsername());
            Objects.requireNonNull(u.getEmail());
            Objects.requireNonNull(u.getPassword());
        });

    }
}



