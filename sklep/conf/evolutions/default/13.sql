# --- !Ups
CREATE TABLE "customerNew" (
 "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 "firstName" VARCHAR NOT NULL,
 "lastName" TEXT NOT NULL,
 "addressId" INT NOT NULL,
 "userId" INTEGER NOT NULL,
 FOREIGN KEY(addressId) references address(id)
);
insert into customerNew select id,firstName,lastName,addressId,0 from customer;
drop table customer;
ALTER table customerNew rename to customer;

# --- !Downs
drop table "customer"