# --- !Ups

CREATE TABLE "orderProduct" (
    "orderId" INT NOT NULL,
    "productId" INT NOT NULL,
    FOREIGN KEY(orderId) references "order"(id),
    FOREIGN KEY(productId) references product(id)
);
CREATE TABLE "payment" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "orderId" INT NOT NULL,
 FOREIGN KEY(orderId) references "order"(id)
);

CREATE TABLE "shipper" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "name" VARCHAR NOT NULL
);


# --- !Downs

DROP TABLE "shipper";
DROP TABLE "payment";
DROP TABLE "orderProduct";
