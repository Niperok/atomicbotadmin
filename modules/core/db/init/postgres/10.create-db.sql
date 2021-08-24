-- begin ATOMICBOTADMIN_NEWS_ITEM
create table ATOMICBOTADMIN_NEWS_ITEM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_ timestamp not null,
    HEADER varchar(255) not null,
    PREVIEW_TEXT text not null,
    IMAGE_ID uuid,
    LINK_TO_ORIGINAL varchar(255),
    HASH_TAGS varchar(255),
    --
    primary key (ID)
)^
-- end ATOMICBOTADMIN_NEWS_ITEM
