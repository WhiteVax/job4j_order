CREATE TABLE IF NOT EXISTS orders
(
    id          SERIAL PRIMARY KEY,
    status      VARCHAR,
    description VARCHAR,
    created     TIMESTAMP WITHOUT TIME ZONE
);