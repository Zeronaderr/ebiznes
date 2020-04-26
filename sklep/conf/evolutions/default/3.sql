# --- !Ups

CREATE TABLE "brand" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "name" VARCHAR NOT NULL
);

CREATE TABLE "customer" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "firstName" VARCHAR NOT NULL,
 "lastName" TEXT NOT NULL,
 "addressId" INT NOT NULL,
 FOREIGN KEY(addressId) references address(id)
);

CREATE TABLE "discount" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "value" FLOAT NOT NULL
);

CREATE TABLE "employee" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "firstName" VARCHAR NOT NULL,
 "lastName" TEXT NOT NULL,
 "addressId" INT NOT NULL,
 FOREIGN KEY(addressId) references address(id)
);

CREATE TABLE "order" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "customerId" INT NOT NULL,
 FOREIGN KEY(customerId) references customer(id)
);

# --- !Downs

DROP TABLE "order";
DROP TABLE "employee";
DROP TABLE "customer";
DROP TABLE "discount";
DROP TABLE "brand";