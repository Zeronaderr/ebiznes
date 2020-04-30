# --- !Ups
ALTER TABLE "product"
ADD COLUMN "price" float;
ALTER TABLE "product"
ADD COLUMN "img" varchar;


# --- !Downs

DROP TABLE "product";

CREATE TABLE "product" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "name" VARCHAR NOT NULL,
 "description" TEXT NOT NULL,
 "category" INT NOT NULL,
 FOREIGN KEY(category) references category(id)
);
