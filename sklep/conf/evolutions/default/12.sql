# --- !Ups
ALTER TABLE "customer"
ADD COLUMN "userId" int;
update "customer" set userId = 0 where 1 = 1;
# --- !Downs
DROP TABLE "customer";