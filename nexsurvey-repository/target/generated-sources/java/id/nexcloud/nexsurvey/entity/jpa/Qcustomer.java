package id.nexcloud.nexsurvey.entity.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * Qcustomer is a Querydsl query type for customer
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class Qcustomer extends EntityPathBase<customer> {

    private static final long serialVersionUID = 708630402L;

    public static final Qcustomer customer = new Qcustomer("customer");

    public final id.nexcloud.nexsurvey.entity.common.QBaseEntity _super = new id.nexcloud.nexsurvey.entity.common.QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath customerAddress1 = createString("customerAddress1");

    public final StringPath customerAddress2 = createString("customerAddress2");

    public final StringPath customerCity = createString("customerCity");

    public final StringPath customerCode = createString("customerCode");

    public final StringPath customerKeyAccount = createString("customerKeyAccount");

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

    public final ListPath<competitor, Qcompetitor> listCompetitor = this.<competitor, Qcompetitor>createList("listCompetitor", competitor.class, Qcompetitor.class, PathInits.DIRECT2);

    public final ListPath<noteStore, QnoteStore> listNote = this.<noteStore, QnoteStore>createList("listNote", noteStore.class, QnoteStore.class, PathInits.DIRECT2);

    public final ListPath<productInStore, QproductInStore> listProd = this.<productInStore, QproductInStore>createList("listProd", productInStore.class, QproductInStore.class, PathInits.DIRECT2);

    public final ListPath<implementationPromo, QimplementationPromo> listPromo = this.<implementationPromo, QimplementationPromo>createList("listPromo", implementationPromo.class, QimplementationPromo.class, PathInits.DIRECT2);

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> modifiedDate = _super.modifiedDate;

    public final StringPath npwpAddress = createString("npwpAddress");

    public final StringPath npwpName = createString("npwpName");

    public final StringPath npwpNumber = createString("npwpNumber");

    public final StringPath principalID = createString("principalID");

    public final DateTimePath<java.util.Date> visitDate = createDateTime("visitDate", java.util.Date.class);

    public Qcustomer(String variable) {
        super(customer.class, forVariable(variable));
    }

    public Qcustomer(Path<? extends customer> path) {
        super(path.getType(), path.getMetadata());
    }

    public Qcustomer(PathMetadata metadata) {
        super(customer.class, metadata);
    }

}

