package id.nexcloud.nexsurvey.entity.common;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMetaDataEntity is a Querydsl query type for MetaDataEntity
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QMetaDataEntity extends EntityPathBase<MetaDataEntity> {

    private static final long serialVersionUID = -2015563068L;

    public static final QMetaDataEntity metaDataEntity = new QMetaDataEntity("metaDataEntity");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final StringPath modifiedBy = createString("modifiedBy");

    public final DateTimePath<java.util.Date> modifiedDate = createDateTime("modifiedDate", java.util.Date.class);

    public QMetaDataEntity(String variable) {
        super(MetaDataEntity.class, forVariable(variable));
    }

    public QMetaDataEntity(Path<? extends MetaDataEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMetaDataEntity(PathMetadata metadata) {
        super(MetaDataEntity.class, metadata);
    }

}

