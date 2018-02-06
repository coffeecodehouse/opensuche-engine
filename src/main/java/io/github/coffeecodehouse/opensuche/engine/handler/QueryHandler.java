package io.github.coffeecodehouse.opensuche.engine.handler;

import javax.validation.constraints.NotNull;
import java.util.concurrent.CompletableFuture;

public interface QueryHandler {

    @NotNull CompletableFuture<Boolean> canHandle(String query);

    CompletableFuture<String> fastResult(String query);

}
