create extension if not exists  "uuid-ossp";

create table if not exists history
(
    id varchar constraint history_pk primary key default  uuid_generate_v4(),
    value varchar
);
