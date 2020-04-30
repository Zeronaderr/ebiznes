# --- !Ups
DROP TABLE "order";

CREATE TABLE "order" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "customerId" INT NOT NULL,
 "productId" INT NOT NULL,
 "shipperId" INT NOT NULL,
 FOREIGN KEY(customerId) references customer(id),
 FOREIGN KEY(productId) references product(id),
 FOREIGN KEY(shipperId) references shipper(id)
);


# --- !Downs
DROP TABLE "order";

CREATE TABLE "order" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "customerId" INT NOT NULL,
 "productId" INT NOT NULL,
 FOREIGN KEY(customerId) references customer(id),
 FOREIGN KEY(productId) references product(id)
);
