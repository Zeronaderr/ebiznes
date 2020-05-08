# --- !Ups
ALTER TABLE "order"
ADD COLUMN "orderState" INT;
update "order" set orderState = 1 where 1 = 1;
# --- !Downs

DROP TABLE "order";

CREATE TABLE "order" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "customerId" INT NOT NULL,
 "productId" INT NOT NULL,
 "shipperId" INT NOT NULL,
 "orderDate" DATE,
 FOREIGN KEY(customerId) references customer(id),
 FOREIGN KEY(productId) references product(id),
 FOREIGN KEY(shipperId) references shipper(id)
);
