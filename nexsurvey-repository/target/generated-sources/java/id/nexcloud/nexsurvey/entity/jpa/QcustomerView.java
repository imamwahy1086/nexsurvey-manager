package id.nexcloud.nexsurvey.entity.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QcustomerView is a Querydsl query type for customerView
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QcustomerView extends EntityPathBase<customerView> {

    private static final long serialVersionUID = -1991641785L;

    public static final QcustomerView customerView = new QcustomerView("customerView");

    public final id.nexcloud.nexsurvey.entity.common.QBaseEntity _super = new id.nexcloud.nexsurvey.entity.common.QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath customerAddress1 = createString("customerAddress1");

    public final StringPath customerAddress2 = createString("customerAddress2");

    public final StringPath customerCity = createString("customerCity");

    public final StringPath customerCode = createString("customerCode");

    public final StringPath customerKodePos = createString("customerKodePos");

    public final StringPath customerLatitude = createString("customerLatitude");

    public final StringPath customerLongitude = createString("customerLongitude");

    public final StringPath customerName = createString("customerName");

    public final StringPath customerPhone = createString("customerPhone");

    public final StringPath customerSubtype = createString("customerSubtype");

    public final StringPath customerType = createString("customerType");

    public final StringPath distributorID = createString("distributorID");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> modifiedDate = _super.modifiedDate;

    public final StringPath principalID = createString("principalID");

    public final DateTimePath<java.util.Date> visitDate = createDateTime("visitDate", java.util.Date.class);

    public QcustomerView(String variable) {
        super(customerView.class, forVariable(variable));
    }

    public QcustomerView(Path<? extends customerView> path) {
        super(path.getType(), path.getMetadata());
    }

    public QcustomerView(PathMetadata metadata) {
        super(customerView.class, metadata);
    }

}

