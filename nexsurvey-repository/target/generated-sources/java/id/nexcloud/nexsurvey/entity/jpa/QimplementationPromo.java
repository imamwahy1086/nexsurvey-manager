package id.nexcloud.nexsurvey.entity.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QimplementationPromo is a Querydsl query type for implementationPromo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QimplementationPromo extends EntityPathBase<implementationPromo> {

    private static final long serialVersionUID = 31385177L;

    public static final QimplementationPromo implementationPromo = new QimplementationPromo("implementationPromo");

    public final id.nexcloud.nexsurvey.entity.common.QBaseEntity _super = new id.nexcloud.nexsurvey.entity.common.QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> customer_ID = createNumber("customer_ID", Long.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath isAvailable = createString("isAvailable");

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> modifiedDate = _super.modifiedDate;

    public final StringPath promoID = createString("promoID");

    public final StringPath promoName = createString("promoName");

    public final StringPath referenceNumber = createString("referenceNumber");

    public final DateTimePath<java.util.Date> validFrom = createDateTime("validFrom", java.util.Date.class);

    public final DateTimePath<java.util.Date> validThru = createDateTime("validThru", java.util.Date.class);

    public final DateTimePath<java.util.Date> visitDate = createDateTime("visitDate", java.util.Date.class);

    public QimplementationPromo(String variable) {
        super(implementationPromo.class, forVariable(variable));
    }

    public QimplementationPromo(Path<? extends implementationPromo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QimplementationPromo(PathMetadata metadata) {
        super(implementationPromo.class, metadata);
    }

}

