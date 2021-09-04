--
CREATE USER service_user WITH PASSWORD 'please_change_me';
CREATE DATABASE products_db WITH OWNER = service_user;
-- PG_SYNC
ALTER SYSTEM SET wal_level = logical;
