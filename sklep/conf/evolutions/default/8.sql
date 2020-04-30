# --- !Ups

DROP TABLE "product";

CREATE TABLE "product" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "name" VARCHAR NOT NULL,
 "description" TEXT NOT NULL,
 "category" INT NOT NULL,
  "price" FLOAT NOT NULL,
 "img" varchar NOT NULL,
 "brandId" INT NOT NULL,
 FOREIGN KEY(category) references category(id),
 FOREIGN KEY(brandId) references brand(id)
);


# --- !Downs

DROP TABLE "product";

CREATE TABLE "product" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "name" VARCHAR NOT NULL,
 "description" TEXT NOT NULL,
 "category" INT NOT NULL,
 "price" FLOAT NOT NULL,
 "img" varchar NOT NULL,
 FOREIGN KEY(category) references category(id)
);
