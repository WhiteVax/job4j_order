CREATE TABLE IF NOT EXISTS orders_dishes
(
    id SERIAL   PRIMARY KEY,
    order_id    INT REFERENCES orders(id) ON DELETE CASCADE,
    dish_id     INT REFERENCES dish(id) ON DELETE CASCADE
);