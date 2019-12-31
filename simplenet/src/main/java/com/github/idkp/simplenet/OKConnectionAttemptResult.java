package com.github.idkp.simplenet;

public final class OKConnectionAttemptResult implements ConnectionAttemptResult {
    private final ActiveConnection connection;

    public OKConnectionAttemptResult(ActiveConnection connection) {
        this.connection = connection;
    }

    public ActiveConnection getConnection() {
        return connection;
    }

    @Override
    public Type getType() {
        return Type.OK;
    }
}