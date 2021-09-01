--
CREATE USER products@owner WITH PASSWORD 'P@ssw0rd';
CREATE DATABASE products_db WITH OWNER = products@owner;
-- PGSYNC
ALTER SYSTEM SET wal_level = logical;
