package exercise;

import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class App {

    private static final List<Map<String, String>> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });

        // BEGIN
        app.get("/users", ctx -> {
            int page = ctx.queryParamAsClass("page", Integer.class).getOrDefault(1);
            int per = ctx.queryParamAsClass("per", Integer.class).getOrDefault(5);
            List<Map<String, String>> users;
            int step = (page - 1) * per;
            if (step + per < USERS.size() && step >= 0 && per >= 0) {
                users = USERS.subList(step, step + per);
            } else if (step >= USERS.size() || step + per < 1 || (page < 0 && per < 0)) {
                users = new ArrayList<>();
            } else {
                users = new ArrayList<>(USERS);
            }
            ctx.json(users);
        });
        // END

        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
