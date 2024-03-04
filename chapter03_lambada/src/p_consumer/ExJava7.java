package p_consumer;

import java.util.List;

public class ExJava7 {
    public static void main(String[] args) {
        List<ParamVO> paramVOList = List.of(
                new ParamVO("user1", "user1@java8.com","user1")
                ,new ParamVO("user2", "user2@java8.com","user2")
                ,new ParamVO("user3", "user3@java8.com","user3")
                ,new ParamVO("user4", "user4@java8.com","user4")
                ,new ParamVO("user5", "user5@java8.com",null)
        );

        for (ParamVO u : paramVOList) {
            new ConsumerJDK7<ParamVO>() {
                @Override
                public void accept(ParamVO paramVO) {
                    if (paramVO.getUsername() == null) {
                        throw new IllegalArgumentException("Username is null");
                    }
                    if (paramVO.getEmail() == null) {
                        throw new IllegalArgumentException("Email is null");
                    }
                    if (paramVO.getPassword() == null) {
                        throw new IllegalArgumentException("Password is null");
                    }
                }
            }.accept(u);
        }
    }
}

interface ConsumerJDK7<T> {
    void accept(T t);
}
