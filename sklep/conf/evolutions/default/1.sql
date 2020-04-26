# --- !Ups

CREATE TABLE "address" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "address" VARCHAR NOT NULL
);

CREATE TABLE "productCategory" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "name" VARCHAR NOT NULL
);

CREATE TABLE "product" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "name" VARCHAR NOT NULL,
 "description" TEXT NOT NULL,
 "category" INT NOT NULL,
 FOREIGN KEY(category) references category(id)
);

# --- !Downs

DROP TABLE "productCategory"
DROP TABLE "product"
DROP TABLE "address"
