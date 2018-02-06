package io.github.coffeecodehouse.opensuche.engine.handler;

public interface HandlerCallback<T> {

    void onResult(T t);
}
