# --- !Ups

DROP TABLE "orderProduct";
DROP TABLE "order";

CREATE TABLE "order" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "customerId" INT NOT NULL,
 "productId" INT NOT NULL,
 FOREIGN KEY(customerId) references customer(id),
 FOREIGN KEY(productId) references product(id)
);

# --- !Downs

CREATE TABLE "orderProduct" (
    "orderId" INT NOT NULL,
    "productId" INT NOT NULL,
    FOREIGN KEY(orderId) references "order"(id),
    FOREIGN KEY(productId) references product(id)
);
DROP TABLE "order";
CREATE TABLE "order" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "customerId" INT NOT NULL,
 FOREIGN KEY(customerId) references customer(id),
);
