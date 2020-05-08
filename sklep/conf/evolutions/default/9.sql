# --- !Ups
ALTER TABLE "order"
ADD COLUMN "orderDate" DATE;
update "order" set orderDate = date() where 1 = 1;
# --- !Downs

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
