# --- !Ups

INSERT INTO "productCategory"("name") VALUES("sample1");
INSERT INTO "productCategory"("name") VALUES("sample2");

# --- !Downs

DELETE FROM "productCategory" WHERE name="sample1"";
DELETE FROM "productCategory" WHERE name="sample2"";
