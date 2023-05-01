CREATE TABLE IF NOT EXISTS dish
(
    id              BIGSERIAL PRIMARY KEY,
    name_dish       VARCHAR NOT NULL UNIQUE,
    composition     VARCHAR DEFAULT 'unknown',
    price           DOUBLE PRECISION NOT NULL,
    added           TIMESTAMP WITHOUT TIME ZONE
);