package com.mersey.rowing.club.e2e_testing.config;

import lombok.Getter;

import java.time.Duration;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;

@Getter
public class Context {
    public static final String BASE_URL = "http://localhost/";
    public static String KEY_WEB_ACTIONS = "web_actions";
    public static String KEY_CHROME_DRIVER = "chrome_driver";

    private static ThreadLocal<Map<String, Object>> data = ThreadLocal.withInitial(HashMap::new);

    public static <T> T get(String key, Function<Object, T> converter) {
        var value = data.get().get(key);
        if (value == null) {
            return null;
        }
        return converter.apply(value);
    }

    public static <T> T get(String key, Class<T> clazz) {
        return get(key, clazz::cast);
    }

    public static Object get(String key) {
        return get(key, Function.identity());
    }

    public static <T> void set(String key, T value) {
        data.get().put(key, value);
    }
}
