package id.nexcloud.nexsurvey.entity.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * Qcompetitor is a Querydsl query type for competitor
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class Qcompetitor extends EntityPathBase<competitor> {

    private static final long serialVersionUID = -1052868624L;

    public static final Qcompetitor competitor = new Qcompetitor("competitor");

    public final id.nexcloud.nexsurvey.entity.common.QBaseEntity _super = new id.nexcloud.nexsurvey.entity.common.QBaseEntity(this);

    public final StringPath competitorName = createString("competitorName");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> customer_ID = createNumber("customer_ID", Long.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath impactPromo = createString("impactPromo");

    public final StringPath jenisPromo = createString("jenisPromo");

    public final StringPath mekanismePromo = createString("mekanismePromo");

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> modifiedDate = _super.modifiedDate;

    public final StringPath periodePromo = createString("periodePromo");

    public final StringPath prodCompetitor = createString("prodCompetitor");

    public final DateTimePath<java.util.Date> visitDate = createDateTime("visitDate", java.util.Date.class);

    public Qcompetitor(String variable) {
        super(competitor.class, forVariable(variable));
    }

    public Qcompetitor(Path<? extends competitor> path) {
        super(path.getType(), path.getMetadata());
    }

    public Qcompetitor(PathMetadata metadata) {
        super(competitor.class, metadata);
    }

}

